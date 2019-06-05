package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Head;
import com.mygdx.game.Part.Leg;

public class MyGdxGame implements ApplicationListener {
    private SpriteBatch batch;
    private BitmapFont font;
    private Robot r;
    private Frame f;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.RED);
        r = new Robot();
        f = new Frame();
        Head h = new Head();
        Leg l = new Leg();
        Arm leftArm, rightArm;
        leftArm = new Arm();
        rightArm = new Arm();
        l.setSprite(new Sprite(new Texture(Gdx.files.internal("leg.png"))));
        leftArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm.png"))));
        rightArm.setSprite(new Sprite(new Texture(Gdx.files.internal("arm.png"))));
        h.setSprite(new Sprite(new Texture(Gdx.files.internal("head.png"))));
        f.setSprite(new Sprite(new Texture(Gdx.files.internal("frame.png"))));
        r.setFrame(f);
        f.setHead(h);
        f.setLeftArm(leftArm);
        f.setLeg(l);
        f.setRightArm(rightArm);
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
        r.draw(batch, 256, 256);
        batch.end();
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