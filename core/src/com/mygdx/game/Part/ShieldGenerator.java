package com.mygdx.game.Part;

public enum ShieldGenerator {
    LIGHT(10, 20), MEDIUM(20, 40), HEAVY(40, 80);
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
}
