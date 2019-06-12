package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.AssetLoader;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Builder.Frame.*;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.SubPart.*;
import com.mygdx.game.Part.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MyGdxGame implements ApplicationListener {
    private SpriteBatch batch;
    private SpriteBatch batch2;
    private BitmapFont font;

    private Frame f;

    private Stage stage;

    private Stage stage1;

    private Texture myTexture;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;
    private ImageButton button;
    private RightArmPicker rightArmPicker;
    private LeftArmPicker leftArmPicker;
    private LegPicker legPicker;
    private HeadPicker headPicker;
    private FramePicker framePicker;
    private Robot player;
    private Robot enemy;


    private RobotBuilder rb;

    private boolean inFight = false;
    Label playerStats;
    Label enemyStats;
    @Override
    public void create() {
        batch = new SpriteBatch();
        batch2 = new SpriteBatch();

        Frame f1 = new CarbonFrameBuilder().buildMaterial().buildShieldGenerator().build();
        Frame f2 = new TitaniumFrameBuilder().buildMaterial().buildShieldGenerator().build();
        Frame f3 = new WoodFrameBuilder().buildMaterial().buildShieldGenerator().build();

        stage = new Stage();

        stage1 = new Stage();


        Gdx.input.setInputProcessor(stage); //Start taking input from the ui

        font = new BitmapFont();
        font.setColor(Color.RED);

        f = new Frame();
        Head h = new Head();
        player = new Robot();


        rb = new RobotBuilder();

        ArrayList<myDrawable> frames = new ArrayList<myDrawable>();
        frames.add(f1);
        frames.add(f2);
        frames.add(f3);
        framePicker = new FramePicker(832, 400, 256, 256, frames, rb);
        headPicker = new HeadPicker(832, 696, 256, 256, rb);
        rightArmPicker = new RightArmPicker(256, 256, 512, 256, rb);
        leftArmPicker = new LeftArmPicker(1408, 256, 512, 256, rb);
        legPicker = new LegPicker(832, 128, 256, 256, rb);


        button = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("buildButtonWhite.png")))),
                new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("buildButtonGray.png"))))
        );
        button.setSize(512, 128);
        button.setPosition(832 - 128, 950);

        button.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                buildAndFight();
            }
        });
        //stage.addActor(r);

        stage.addActor(framePicker);
        stage.addActor(headPicker);
        stage.addActor(rightArmPicker);
        stage.addActor(leftArmPicker);
        stage.addActor(legPicker);
        stage.addActor(button);

        player.setPosition(100, 0);


        playerStats = new Label("", new Skin(Gdx.files.internal("uiskin.json")));
        enemyStats = new Label("", new Skin(Gdx.files.internal("uiskin.json")));

        playerStats.setPosition(170,80);


        enemyStats.setPosition(1600,80);
        stage1.addActor(playerStats);
        stage1.addActor(enemyStats);

        //player.setPosition(100, 0);
    }


    public void buildAndFight() {
        player = rb.build();
        player.resetShieldAndArmor();
        enemy = generateEnemys();
        enemy.resetShieldAndArmor();
        inFight = true;
    }

	private Robot generateEnemys() {

        Random rand = new Random();

//
        int random = rand.nextInt(2)+1;

        Robot[] robotArray = new Robot[random];


        RobotBuilder robotBuilder = new RobotBuilder();
        FrameBuilder fb = new WoodFrameBuilder();
        HeadBuilder hb = new HeadBuilder();
        LegBuilder lb = new LegBuilder();
        ArmBuilder ab = new ArmBuilder();

        for (int i = 0; i < random; i++) {

            robotArray[i] = robotBuilder.buildFrame(fb.buildShieldGenerator().buildMaterial().build())
                    .buildHead(hb.buildSensor(Sensor.values()[rand.nextInt(3)]).build())
                    .buildLeftArm(ab.buildWeapon(Weapon.values()[rand.nextInt(3)]).buildWeight(Weight.values()[rand.nextInt(3)]).build())
                    .buildRightArm(ab.buildWeapon(Weapon.values()[rand.nextInt(3)]).buildWeight(Weight.values()[rand.nextInt(3)]).build())
                    .buildLegs(lb.buildShape(Shape.values()[rand.nextInt(3)]).build()).build();

        }

        return robotArray[0];
    }

    


 

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

    @Override
    public void render() {



        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (inFight) {


            batch.begin();
            //font.draw(batch, "Mcr Project", 200, 200);
            player.draw(batch, 0, 0);
            Matrix4 m = batch.getTransformMatrix();


            m.setToTranslation(128, 256, 0);
            //batch.setTransformMatrix(m);
            batch.end();
            batch2.begin();
            enemy.draw(batch2, 0, 0);

            Matrix4 m2 = batch2.getTransformMatrix();
            m2.setToTranslation(1920 - 128, 256, 0);
            m2.val[0] = -1;




            playerStats.setText(player.toString());
            enemyStats.setText(enemy.toString());

            stage1.draw();
            batch2.setTransformMatrix(m2);
            batch2.end();
            update();

        } else {

            stage.act(Gdx.graphics.getDeltaTime()); //Perform ui logic
            stage.draw();
        }
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }


    private void update() {
        long currentTime = System.currentTimeMillis();



        if(!player.isDead()&&!enemy.isDead()){

            if (player.canAttackLeft(currentTime/1000)) {
              stage1.addActor(new Bubble(300,350,512,450,175));
                System.out.println("Player attacks enemy" + player.shootLeft(enemy));

            }
            if (player.canAttackRight(currentTime/1000)) {
               stage1.addActor(new Bubble(300,350,512,650,175));
                System.out.println("Player attacks enemy" + player.shootRight(enemy));

            }


            if (enemy.canAttackLeft(currentTime/1000)) {
                stage1.addActor(new Bubble(1280,350,1480,450,175));

                System.out.println("Enemy attacks enemy" + enemy.shootLeft(player));

            }
            if (enemy.canAttackRight(currentTime/1000)) {
                stage1.addActor(new Bubble(1230,350,1430,450,175));

                System.out.println("Enemy attacks enemy" + enemy.shootRight(player));

            }
        }else{
            //inFight=false;
        }



    }


}