package com.mygdx.game.Part;

public class Frame {

    private Material material;
    private int power;
    private ShieldGenerator shieldGenerator;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public ShieldGenerator getShieldGenerator() {
        return shieldGenerator;
    }

    public void setShieldGenerator(ShieldGenerator shieldGenerator) {
        this.shieldGenerator = shieldGenerator;
    }
}
