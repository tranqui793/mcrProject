package com.mygdx.game.Part.SubPart;

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
