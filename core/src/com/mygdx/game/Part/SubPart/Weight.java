package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

/**
 * Enum representing the weight of a part.
 */
public enum Weight implements myDrawable {
    HEAVY(1.5, 0.5,"HEAVY_ARM_6.png"), MEDIUM(1, 1,"MEDIUM_ARM_6.png"), LIGHT(0.5, 1.5,"LIGHT_ARM_6.png");

    private Sprite sprite;

    private double damageMult;
    private double attackSpeedMult;
    private int cost = 20;

    public double getDamageMult() {
        return damageMult;
    }

    public double getAttackSpeedMult() {
        return attackSpeedMult;
    }

    public int getCost() {
        return cost;
    }

    Weight(double dm, double asm,String path){
        damageMult = dm;
        attackSpeedMult = asm;
        sprite=new Sprite(new Texture(Gdx.files.internal(path)));
    }

    @Override
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public Sprite getSprite() {
        return new Sprite(sprite);
    }

    @Override
    public void draw(Batch batch, float x, float y) {
        sprite.setPosition(x,y);
        sprite.draw(batch);
    }
}
