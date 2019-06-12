package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import com.mygdx.game.Part.SubPart.Shape;

/**
 * Class representing a leg.
 * Its shape defines it's stats.
 */
public class Leg extends Part{

    private Vector2 hooktoFrame = new Vector2(0.5f,0.68f);
    private String mobility;


    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
        setArmor(shape.getArmor());
        setDodge(shape.getDodge());
        setEnergyCost(shape.getCost());
    }

    @Override
    public String toString() {
        return "Leg{" +
                "shape=" + shape +
                '}';
    }


    @Override
    public void draw(Batch batch, float x, float y) {

        //    sprite.setPosition(x - sprite.getWidth() * hooktoFrame.x, y - sprite.getHeight() * hooktoFrame.y);
        shape.draw(batch, x - shape.getSprite().getWidth() * hooktoFrame.x, y - shape.getSprite().getHeight() * hooktoFrame.y);

      //  sprite.draw(batch);
    }

    @Override
    public Sprite getSprite() {
        return shape.getSprite();
    }

    public Vector2 getHooktoFrame() {
        return hooktoFrame;
    }


}

