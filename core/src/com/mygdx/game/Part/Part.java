package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;


public  abstract class Part  implements myDrawable {

    protected Sprite sprite;



    private int energyCost = 0;
    private int accuracy = 0;
    private int dodge = 0;
    private int armor = 0;
    private double damageMult = 0;
    private double attackSpeedMult = 0;
    private double armorPen = 0;
    private double shieldPen = 0;
    private int damage = 0;
    private double attackSpeed = 0;
    private int shieldAmount = 0;

    public int getShieldAmount() {
        return shieldAmount;
    }

    public void setShieldAmount(int shieldAmount) {
        this.shieldAmount = shieldAmount;
    }


    public abstract void draw(Batch batch, float x, float y);

    public int getEnergyCost() {
        return energyCost;

    }

    public double getArmorPen() {
        return armorPen;
    }

    public void setArmorPen(double armorPen) {
        this.armorPen = armorPen;
    }

    public double getShieldPen() {
        return shieldPen;
    }

    public void setShieldPen(double shieldPen) {
        this.shieldPen = shieldPen;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public double getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(double damageMult) {
        this.damageMult = damageMult;
    }

    public double getAttackSpeedMult() {
        return attackSpeedMult;
    }

    public void setAttackSpeedMult(double attackSpeedMult) {
        this.attackSpeedMult = attackSpeedMult;
    }

    public int getAccuracy(){
        return accuracy;
    }

    public int getDodge(){
        return dodge;
    }

    public int getArmor(){
        return armor;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public Sprite getSprite() {
        return new Sprite(sprite);
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }


}
