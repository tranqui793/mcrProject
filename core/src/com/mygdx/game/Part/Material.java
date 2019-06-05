package com.mygdx.game.Part;

public enum Material {
    TITANIUM(50, 100),
    WOOD(1,10),
    CARBON(25, 50);

    private int cost;
    private int armor;

    Material(int cost, int armor){
        this.cost = cost;
        this.armor = armor;
    }

}
