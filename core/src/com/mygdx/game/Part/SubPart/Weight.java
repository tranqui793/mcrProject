package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum Weight implements myDrawable {
    HEAVY(1.5, 0.5), MEDIUM(1, 1), LIGHT(0.5, 1.5);

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

    Weight(double dm, double asm){
        damageMult = dm;
        attackSpeedMult = asm;
    }

    @Override
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public Sprite getSprite() {
        return new Sprite(sprite);
    }
}
