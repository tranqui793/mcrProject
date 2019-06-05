package com.mygdx.game.Part;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Head extends Part {

    private Vector2 hooktoFrame = new Vector2(0.5f,0.1f);


    //private Vector2 anchorSensor= new Vector2(0.8f,0.5f);
    private String sensor;


    private String comm;

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    @Override
    public void draw(SpriteBatch batch, int x, int y) {


        sprite.setPosition(x-sprite.getWidth()*hooktoFrame.x,y-sprite.getHeight()*hooktoFrame.y);

        sprite.draw(batch);
    }
}
