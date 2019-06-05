package com.mygdx.game.Part;

public enum Shape {
    HEAVY(0, 50), MEDIUM(10, 25), LIGHT(20, 0);

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

    Shape(int d, int a){
        dodge = d;
        armor = a;
    }
}
