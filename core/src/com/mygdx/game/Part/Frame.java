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
        this.power -= shieldGenerator.getEnergyCost();
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "head=" + head +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", leftArm=" + leftArm +
                ", rightArm=" + rightArm +
                ", material=" + material +
                ", power=" + power +
                ", shieldGenerator=" + shieldGenerator +
                '}';
    }
}
