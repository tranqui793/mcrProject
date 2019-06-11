package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum Shape implements myDrawable {
    HEAVY(0, 50,"leg1.png"), MEDIUM(10, 25,"leg2.png"), LIGHT(20, 0,"leg3.png");

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

    Shape(int d, int a, String path){
        dodge = d;
        armor = a;
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
