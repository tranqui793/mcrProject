package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.mygdx.game.Part.SubPart.*;
import com.mygdx.game.Part.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MyGdxGame implements ApplicationListener {
      private SpriteBatch batch;
    private SpriteBatch batch2;
    private BitmapFont font;
    
    private Frame f;

    private Stage stage;
    private Texture myTexture;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;
    private ImageButton button;
    private PartPicker partPicker;
	
	private Robot player;
	private Robot enemy;


	private RobotBuilder rb;

	@Override
	public void create() {
		  batch = new SpriteBatch();
        batch2 = new SpriteBatch();




        stage=new Stage();
        Gdx.input.setInputProcessor(stage); //Start taking input from the ui

        font = new BitmapFont();
        font.setColor(Color.RED);
        player = new Robot();
        f = new Frame();
        Head h = new Head();

        Leg l= new Leg();
        l.setSprite(new Sprite(new Texture(Gdx.files.internal("leg1.png"))));
        l.setShape(Shape.HEAVY);
        Leg l1= new Leg();
        l1.setSprite(new Sprite(new Texture(Gdx.files.internal("leg1.png"))));
        l1.setShape(Shape.HEAVY);
        Leg l2= new Leg();
        l2.setSprite(new Sprite(new Texture(Gdx.files.internal("leg2.png"))));
        l2.setShape(Shape.MEDIUM);
        Leg l3=new Leg();
        l3.setSprite(new Sprite(new Texture(Gdx.files.internal("leg3.png"))));
        l3.setShape(Shape.LIGHT);

        ArrayList<myDrawable> legTypes= new ArrayList<myDrawable>();
        legTypes.add(Shape.HEAVY);
        legTypes.add(Shape.MEDIUM);
        legTypes.add(Shape.LIGHT);


        rb= new RobotBuilder();
        partPicker=new LegPicker(515,0,256,256,legTypes,rb);

        Arm leftArm, rightArm;
        leftArm = new Arm();
        rightArm = new Arm();

        leftArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm1.png"))));
        rightArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm1.png"))));
        h.setSprite(new Sprite(new Texture(Gdx.files.internal("head1.png"))));
        f.setSprite(new Sprite(new Texture(Gdx.files.internal("frame1.png"))));
        player.setFrame(f);
        player.setHead(h);
        player.setLeftArm(leftArm);
        player.setLeftLeg(l);
        player.setRightLeg(l);
        player.setRightArm(rightArm);
        player.setLeftArm(leftArm);


        //stage.addActor(r);
         stage.addActor(partPicker);

        player.setPosition(100,0);
	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}

	@Override
	public void render() {
		 /* Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        //font.draw(batch, "Mcr Project", 200, 200);
        player.draw(batch, 0, 0);
        Matrix4 m= batch.getTransformMatrix();

        m.setToTranslation(128,0,0);
        //batch.setTransformMatrix(m);
        batch.end();*/
       /* batch2.begin();
        r.draw(batch2,0,0);

        Matrix4 m2= batch2.getTransformMatrix();
        m2.setToTranslation(1024,0,0);
        m2.val[0]=-1;

        batch2.setTransformMatrix(m2);
        batch2.end();*/
        stage.act(Gdx.graphics.getDeltaTime()); //Perform ui logic
        stage.draw(); 
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

	private void update(){
		long currentTime = System.currentTimeMillis();
		long playerElapsedTime = player.getTimeOfLastAttack() - currentTime;
		long enemyElapsedTime = enemy.getTimeOfLastAttack() - currentTime;

		if(player.getAttackSpeedLeft() >= playerElapsedTime){
			player.shootLeft(enemy);
			player.setTimeOfLastAttack(currentTime);
		}
		if(player.getAttackSpeedRight() >= playerElapsedTime){
			player.shootRight(enemy);
			player.setTimeOfLastAttack(currentTime);
		}
		if(enemy.getAttackSpeedLeft() >= playerElapsedTime){
			enemy.shootLeft(player);
			enemy.setTimeOfLastAttack(currentTime);
		}
		if(enemy.getAttackSpeedLeft() >= playerElapsedTime){
			enemy.shootRight(player);
			enemy.setTimeOfLastAttack(currentTime);
		}

	}


}