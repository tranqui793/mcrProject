package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;


/**
 * Class representing a fighting robot.
 */
public class Robot extends Actor{

    private long timeOfLastAttack = System.currentTimeMillis();

    private int energy = 200;

    private Part leftArm;
    private Part rightArm;
    private Frame frame;

    private Part head;
    private Part leftLeg;
    private Part rightLeg;


    public void shootLeft(Robot target){

    }

    public void shootRight(Robot target){

    }

    public long getTimeOfLastAttack() {
        return timeOfLastAttack;
    }

    public void setTimeOfLastAttack(long timeOfLastAttack) {
        this.timeOfLastAttack = timeOfLastAttack;
    }

    public int getArmor() {
        return frame.getArmor() + rightLeg.getArmor() + leftLeg.getArmor();
    }


    public int heightOffset() {
        if (leftLeg != null) {
            return (int) (leftLeg.getSprite().getHeight() * ((Leg)leftLeg).getHooktoFrame().y - frame.getSprite().getHeight() * frame.getAnchorLeg().y);
        }else {
            return 0;
        }
    }
    public void draw(SpriteBatch batch, int x, int y){

        float frameX = x;
        float frameY = y+ heightOffset();

        leftArm.draw(batch, (int) (frameX + frame.getAnchorLeftArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeftArm().y * frame.getSprite().getHeight()));
        leftLeg.draw(batch, (int) (frameX + frame.getAnchorLeg().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeg().y * frame.getSprite().getHeight()));
        head.draw(batch, (int) (frameX + frame.getAnchorHead().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorHead().y * frame.getSprite().getHeight()));


        frame.draw(batch,frameX,frameY);

        rightArm.draw(batch, (int) (frameX + frame.getAnchorRightArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorRightArm().y * frame.getSprite().getHeight()));

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
        this.frame = (Frame) frame;
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

    public Part getLeftArm() {
        return leftArm;
    }

    public Part getRightArm() {
        return rightArm;
    }

    public Frame getFrame() {
        return frame;
    }

    public Part getHead() {
        return head;
    }

    public Part getLeftLeg() {
        return leftLeg;
    }

    public Part getRightLeg() {
        return rightLeg;
    }
}
