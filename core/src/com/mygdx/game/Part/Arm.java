package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

public class Arm extends Part {

   private Vector2 hooktoFrame = new Vector2(0.1f,0.9f);
    private Weapon weapon;
    private Weight weight;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    @Override
    public void draw(Batch batch, float x, float y) {
        sprite.setPosition(x - sprite.getWidth() * hooktoFrame.x, y - sprite.getHeight() * hooktoFrame.y);
        sprite.setColor(Color.GRAY);
        sprite.draw(batch);

    }
    public Weight getWeight(){
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;

    }
}
