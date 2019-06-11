package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Matrix4;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import com.mygdx.game.Part.*;
import com.mygdx.game.Part.SubPart.Shape;

import java.util.ArrayList;

public class MyGdxGame extends Game {
    private SpriteBatch batch;
	private SpriteBatch batch2;
    private BitmapFont font;
    private Robot r;
    private Frame f;

    private Stage stage;
    private Texture myTexture;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;
    private ImageButton button;
    private PartPicker partPicker;
    @Override
    public void create() {
        batch = new SpriteBatch();
		batch2 = new SpriteBatch();




        stage=new Stage();
        Gdx.input.setInputProcessor(stage); //Start taking input from the ui

		font = new BitmapFont();
        font.setColor(Color.RED);
        r = new Robot();
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

        ArrayList<myDrawable> legs=new ArrayList<myDrawable>();
        legs.add(l1);
        legs.add(l2);
        legs.add(l3);


        partPicker=new LegPicker(515,0,256,256,legs,r);

        Arm leftArm, rightArm;
        leftArm = new Arm();
        rightArm = new Arm();

        leftArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm1.png"))));
        rightArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm1.png"))));
        h.setSprite(new Sprite(new Texture(Gdx.files.internal("head1.png"))));
        f.setSprite(new Sprite(new Texture(Gdx.files.internal("frame1.png"))));
        r.setFrame(f);
        r.setHead(h);
        r.setLeftArm(leftArm);
        r.setLeftLeg(l);
        r.setRightLeg(l);
        r.setRightArm(rightArm);
        r.setLeftArm(leftArm);


        //stage.addActor(r);
         stage.addActor(partPicker);

       r.setPosition(100,0);
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

    @Override
    public void render() {
      Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        //font.draw(batch, "Mcr Project", 200, 200);
		r.draw(batch, 0, 0);
		Matrix4 m= batch.getTransformMatrix();

		m.setToTranslation(256,0,0);
		//batch.setTransformMatrix(m);
        batch.end();
       /* batch2.begin();
        r.draw(batch2,0,0);

        Matrix4 m2= batch2.getTransformMatrix();
        m2.setToTranslation(1024,0,0);
        m2.val[0]=-1;

        batch2.setTransformMatrix(m2);
        batch2.end();*/
        stage.act(Gdx.graphics.getDeltaTime()); //Perform ui logic
        stage.draw(); //Draw the ui
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
}