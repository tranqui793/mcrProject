package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Bubble extends Actor {

    Sprite sprite;

    long popTime;
    public Bubble(Sprite sprite,int x ,int y) {
        this.sprite = sprite;
        popTime= System.currentTimeMillis()/1000;

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
