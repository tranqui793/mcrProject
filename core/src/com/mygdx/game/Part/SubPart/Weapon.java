package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.Part.Part;
import com.mygdx.game.myDrawable;

import java.sql.Driver;

/**
 * Enum representing weapons.
 * IT has many stacks and a cost.
 */
public enum Weapon implements myDrawable {
    KINETIC(1, 1, 45, 2, 6, 10,"KINETIC_4.png"),
    MISSILE(1.2, 0.8, 30, 30, 0.5, 10,"MISSILE_4.png"),
    LASER(0.5, 1.5,75, 10, 1, 10,"LASER_4.png");
    private Sprite sprite;

    private double armorPen;
    private double shieldPen;
    private int accuracy;
    private int damage;
    private double attackSpeed;
    private int cost;

    public int getCost() {
        return cost;
    }

    public double getArmorPen() {
        return armorPen;
    }

    public double getShieldPen() {
        return shieldPen;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    Weapon(double ap, double sp, int accuracy, int damage, double as, int cost,String path){
        this.armorPen = ap;
        this.shieldPen = sp;
        this.accuracy = accuracy;
        this.damage = damage;
        this.attackSpeed = as;
        this.cost = cost;
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
