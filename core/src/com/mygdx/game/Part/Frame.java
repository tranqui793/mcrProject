package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class Frame extends Part {

    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Arm leftArm;
    private Arm rightArm;

    private Material material;
    private int power = 200;
    private ShieldGenerator shieldGenerator;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        if(this.material != null){
            power += this.material.getEnergyCost();
        }
        this.material = material;
        this.power -= material.getEnergyCost();
    }

    public int getPower() {
        return power;
    }


    public ShieldGenerator getShieldGenerator() {
        return shieldGenerator;
    }

    public void setShieldGenerator(ShieldGenerator shieldGenerator) {
        if(this.shieldGenerator != null){
            power += this.shieldGenerator.getEnergyCost();
        }
        this.shieldGenerator = shieldGenerator;
        this.power -= shieldGenerator.getEnergyCost()
    }
}
