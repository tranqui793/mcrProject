package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.Random;

public class Bubble extends Actor {

    Sprite sprite;

    long popTime;
    long endTime;
    public Bubble(int x ,int y,int maxx,int maxy,long dura) {
        Random r = new Random();
        int truex=r.nextInt(maxx-x);
        truex+=x;
        int truey=r.nextInt(maxy-y);
        truey+=y;
        this.sprite=new Sprite(new Texture(Gdx.files.internal("BANG_4.png")));
        popTime= System.currentTimeMillis()/1000;
        setPosition(truex,truey);
        endTime=System.currentTimeMillis()+dura;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.setPosition(getX(),getY());
        sprite.draw(batch);
        if(System.currentTimeMillis()>endTime){
            remove();
        }
    }
}
