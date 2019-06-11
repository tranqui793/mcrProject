package com.mygdx.game;

import com.mygdx.game.Part.Part;

public class Robot {
    private int energy = 200;

    private Part leftArm;
    private Part rightArm;
    private Part frame;
    private Part head;
    private Part leftLeg;
    private Part rightLeg;

    public int getArmor() {
        return frame.getArmor() + rightLeg.getArmor() + leftLeg.getArmor();
    }

    public int getDodge() {
        return head.getDodge() + leftLeg.getDodge() + rightLeg.getDodge();
    }

    public int getAccuracyLeft() {
        return head.getAccuracy() + leftArm.getAccuracy();
    }

    public int getAccuracyRight() {
        return head.getAccuracy() + rightArm.getAccuracy();
    }

    public int getShieldAmount() {
        return frame.getShieldAmount();
    }

    public double getArmorPenLeft() {
        return leftArm.getArmorPen();
    }

    public double getShieldPenLeft() {
        return leftArm.getShieldPen();
    }

    public int getDamageLeft() {
        return (int)(leftArm.getDamage() * leftArm.getDamageMult());
    }

    public double getAttackSpeedLeft() {
        return (int)(leftArm.getAttackSpeed() * leftArm.getAttackSpeedMult());
    }

    public double getArmorPenRight() {
        return rightArm.getArmorPen();
    }

    public double getShieldPenRight() {
        return rightArm.getShieldPen();
    }

    public int getDamageRight() {
        return (int)(rightArm.getDamage() * rightArm.getDamageMult());
    }

    public double getAttackSpeedRight() {
        return (int)(rightArm.getAttackSpeed() * rightArm.getAttackSpeedMult());
    }

    public void setFrame(Part frame) {
        if(this.frame != null){
            energy += this.frame.getEnergyCost() - frame.getEnergyCost();
        } else {
            energy -= frame.getEnergyCost();
        }
        this.frame = frame;
    }

    public void setHead(Part head) {
        if(this.head != null){
            energy += this.head.getEnergyCost() - head.getEnergyCost();
        } else {
            energy -= head.getEnergyCost();
        }
        this.head = head;
    }

    public void setLeftLeg(Part leg) {
        if(this.leftLeg != null){
            energy += this.leftLeg.getEnergyCost() - leg.getEnergyCost();
        } else {
            energy -= leg.getEnergyCost();
        }
        this.leftLeg = leg;
    }

    public void setRightLeg(Part leg) {
        if(this.rightLeg != null){
            energy += this.rightLeg.getEnergyCost() - leg.getEnergyCost();
        } else {
            energy -= leg.getEnergyCost();
        }
        this.rightLeg = leg;
    }

    public void setLeftArm(Part leftArm) {
        if(this.leftArm != null){
            energy += this.leftArm.getEnergyCost() - leftArm.getEnergyCost();
        } else {
            energy -= leftArm.getEnergyCost();
        }
        this.leftArm = leftArm;
    }

    public void setRightArm(Part rightArm) {
        if(this.rightArm != null){
            energy += this.rightArm.getEnergyCost() - rightArm.getEnergyCost();
        } else {
            energy -= rightArm.getEnergyCost();
        }
        this.rightArm = rightArm;
    }

    public int getEnergy() {
        return energy;
    }
}
