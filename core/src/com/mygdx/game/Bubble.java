package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Bubble extends Actor {

    Sprite sprite;

    long popTime;
    public Bubble(int x ,int y) {

        this.sprite=new Sprite(new Texture(Gdx.files.internal("BANG_4.png")));
        popTime= System.currentTimeMillis()/1000;
        setPosition(x,y);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.setPosition(getX(),getY());
        sprite.draw(batch);
    }
}
