package com.mygdx.game.Part;

public enum Weight {
    HEAVY(1.5, 0.5), MEDIUM(1, 1), LIGHT(0.5, 1.5);

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
}
