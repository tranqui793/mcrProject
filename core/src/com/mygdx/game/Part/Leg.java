package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

public class Leg extends Part{

    private Vector2 hooktoFrame = new Vector2(0.5f,0.9f);
    private String mobility;

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }


    @Override
    public void draw(Batch batch, float x, float y) {

            sprite.setPosition(x - sprite.getWidth() * hooktoFrame.x, y - sprite.getHeight() * hooktoFrame.y);
            sprite.setColor(Color.CHARTREUSE);

        sprite.draw(batch);
    }

    public Vector2 getHooktoFrame() {
        return hooktoFrame;
    }


}
