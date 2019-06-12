package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

/**
 * Enum representing sensors.
 * It can enhance dodge and accury, also has a cost.
 */
public enum Sensor implements myDrawable {
    THERMIC(5, 20,"THERMIC_4.png"), HOLOGRAPHIC(15, 10,"HOLOGRAPHIC_4.png"), SONIC(25, 0,"SONIC_4.png");

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

    Sensor(int d, int a,String path){
        dodge = d;
        accuracy = a;
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
