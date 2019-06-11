package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum Sensor implements myDrawable {
    THERMIC(0, 20), HOLOGRAPHIC(10, 10), SONIC(20, 0);

    private Sprite sprite;

    private int dodge;
    private int accuracy;
    private int cost = 20;

    public int getDodge() {
        return dodge;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getCost() {
        return cost;
    }

    Sensor(int d, int a){
        dodge = d;
        accuracy = a;
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
