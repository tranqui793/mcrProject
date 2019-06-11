package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum Shape implements myDrawable {
    HEAVY(0, 50), MEDIUM(10, 25), LIGHT(20, 0);

    private Sprite sprite;

    private int dodge;
    private int armor;
    private int cost = 20;

    public int getDodge() {
        return dodge;
    }

    public int getArmor() {
        return armor;
    }

    public int getCost() {
        return cost;
    }

    Shape(int d, int a){
        dodge = d;
        armor = a;
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
