package com.mygdx.game.Part;

public enum Weapon {
    KINETIC(1, 1, 80, 2, 6, 10),
    MISSILE(1.2, 0.8, 60, 30, 0.5, 10),
    LASER(0.5, 1.5, 100, 10, 1, 10);

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

    Weapon(double ap, double sp, int accuracy, int damage, double as, int cost){
        this.armorPen = ap;
        this.shieldPen = sp;
        this.accuracy = accuracy;
        this.damage = damage;
        this.attackSpeed = as;
        this.cost = cost;
    }
}
