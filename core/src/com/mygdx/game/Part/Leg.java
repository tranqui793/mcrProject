package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

import com.mygdx.game.Part.SubPart.Shape;

public class Leg extends Part{

    private Vector2 hooktoFrame = new Vector2(0.5f,0.9f);
    private String mobility;


    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void draw(Batch batch, float x, float y) {

            sprite.setPosition(x - sprite.getWidth() * hooktoFrame.x, y - sprite.getHeight() * hooktoFrame.y);


        sprite.draw(batch);
    }

    public Vector2 getHooktoFrame() {
        return hooktoFrame;
    }


}
