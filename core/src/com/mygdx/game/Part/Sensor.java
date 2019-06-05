package com.mygdx.game.Part;

public enum Sensor {
    THERMIC(0, 20), HOLOGRAPHIC(10, 10), SONIC(20, 0);

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
}
