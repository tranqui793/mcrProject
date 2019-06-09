package com.mygdx.game.Part;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Part.SubPart.Sensor;
public class Head extends Part {

    private Vector2 hooktoFrame = new Vector2(0.5f,0.1f);


    //private Vector2 anchorSensor= new Vector2(0.8f,0.5f);


    private Sensor sensor;

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }


    @Override
    public void draw(Batch batch, float x, float y) {

        sprite.setPosition(x-sprite.getWidth()*hooktoFrame.x,y-sprite.getHeight()*hooktoFrame.y);
        sprite.setColor(Color.CHARTREUSE);
        sprite.draw(batch);
    }

}
