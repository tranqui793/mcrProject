package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Arm  extends Part{

    //a modifier

    private Vector2 hooktoFrame = new Vector2(0.1f,0.9f);
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    @Override
    public void draw(SpriteBatch batch, int x, int y) {
        sprite.setPosition(x-sprite.getWidth()*hooktoFrame.x,y-sprite.getHeight()*hooktoFrame.y);
        sprite.setColor(Color.GRAY);
        sprite.draw(batch);
    }
}
