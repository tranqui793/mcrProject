package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum ShieldGenerator  implements myDrawable {
    LIGHT(10, 20), MEDIUM(20, 40), HEAVY(40, 80);

    private Sprite sprite;

    private int cost;
    private int shieldAmount;

    public int getCost() {
        return cost;
    }

    public int getShieldAmount() {
        return shieldAmount;
    }

    ShieldGenerator(int cost, int shieldAmount){

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
