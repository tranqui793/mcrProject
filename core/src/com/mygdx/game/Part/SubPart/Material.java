package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

/**
 * Enum representing the materials a farme can be made of.
 * It has a cost and enhances armor.
 */
public enum Material implements myDrawable {
    TITANIUM(50, 100,"TITANIUM_4.png"),
    WOOD(1,10,"WOOD_4.png"),
    CARBON(25, 50,"CARBON_4.png");

    private Sprite sprite;
    private int cost;
    private int armor;

    Material(int cost, int armor,String path){
        this.cost = cost;
        this.armor = armor;
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
        sprite.setPosition(x, y);
        sprite.draw(batch);

    }
    public int getEnergyCost() {
        return cost;
    }

    public void setEnergyCost(int cost) {
        this.cost = cost;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;

    }
}
