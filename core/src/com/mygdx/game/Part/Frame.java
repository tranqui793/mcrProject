package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class Frame extends Part {

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
