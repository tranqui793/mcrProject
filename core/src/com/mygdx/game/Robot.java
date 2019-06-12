package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;
import java.util.Random;


/**
 * Class representing a fighting robot.
 */
public class Robot extends Actor{



    private long timeOfLastAttackLeft = 0;
    private long timeOfLastAttackRight = 0;
    private int energy = 200;
    private boolean dead = false;

    private int shieldAmount = 0;
    private int armorAmount = 0;

    private Part leftArm;
    private Part rightArm;
    private Frame frame;

    private Part head;
    private Part leftLeg;
    private Part rightLeg;

    public String shootLeft(Robot target){
        int chanceToMiss = target.getDodge() - getAccuracyLeft();
        Random r = new Random();
        timeOfLastAttackLeft=System.currentTimeMillis()/1000;
        if(r.nextInt(99) >= chanceToMiss) {
            if (shieldAmount > 0) {
                int damage = (int)(getShieldPenLeft() * getDamageLeft());
                shieldAmount -= damage;
                return " shield with his left arm for " + damage + ".";
            } else if(armorAmount > 0) {
                int damage = (int)(getArmorPenLeft() * getDamageLeft());
                armorAmount -= damage;
                if(armorAmount <= 0){
                    target.setDead();
                    return " with his left arm and killed his opponent.";
                }
                return " armor with his left arm for " + damage + ".";
            }
        }
        return " and miss.";
    }

    public String shootRight(Robot target){

        int chanceToMiss = target.getDodge() - getAccuracyRight();
        Random r = new Random();
        timeOfLastAttackRight=System.currentTimeMillis()/1000;
        if(r.nextInt(99) >= chanceToMiss) {
            if (shieldAmount > 0) {
                int damage = (int)(getShieldPenRight() * getDamageRight());
                shieldAmount -= damage;
                return " shield with his right arm for " + damage + ".";
            } else if(armorAmount > 0) {
                int damage = (int)(getArmorPenRight() * getDamageRight());
                armorAmount -= damage;
                if(armorAmount <= 0){
                    target.setDead();
                    return " with his right arm and killed his opponent.";
                }
                return " armor with his right arm for " + damage + ".";
            }
        }
        return " and miss.";

    }

    public boolean canAttackLeft(long currTime){
        return timeOfLastAttackLeft+1/getAttackSpeedLeft()<currTime;
    }
    public boolean canAttackRight(long currTime){
        return timeOfLastAttackRight+1/getAttackSpeedRight()<currTime;
    }
    public boolean isDead() {
        return dead;
    }

    public void setDead() {
        this.dead = true;
    }

    public long getTimeOfLastAttackLeft() {
        return timeOfLastAttackLeft;
    }

    public void setTimeOfLastAttackLeft(long timeOfLastAttackLeft) {
        this.timeOfLastAttackLeft = timeOfLastAttackLeft;
    }

    public long getTimeOfLastAttackRight() {
        return timeOfLastAttackRight;
    }

    public void setTimeOfLastAttackRight(long timeOfLastAttackRight) {
        this.timeOfLastAttackRight = timeOfLastAttackRight;
    }

    public int getArmor() {
        int armor= 0;
        if( frame!=null){
            armor+= frame.getArmor();
        }

        if( rightLeg!=null){
            armor+= rightLeg.getArmor();
        }

        if( leftLeg!=null){
            armor+= leftLeg.getArmor();
        }

        return armor;
    }


    public int heightOffset() {
        if (leftLeg != null) {
            return (int) (leftLeg.getSprite().getHeight() * ((Leg)leftLeg).getHooktoFrame().y - frame.getSprite().getHeight() * frame.getAnchorLeg().y);
        }else {
            return 0;
        }
    }
    public void draw(SpriteBatch batch, int x, int y){
if(!dead){

        float frameX = x;
        float frameY = y+ heightOffset();

        leftArm.draw(batch, (int) (frameX + frame.getAnchorLeftArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeftArm().y * frame.getSprite().getHeight()));
        leftLeg.draw(batch, (int) (frameX + frame.getAnchorLeg().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeg().y * frame.getSprite().getHeight()));
        head.draw(batch, (int) (frameX + frame.getAnchorHead().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorHead().y * frame.getSprite().getHeight()));


        frame.draw(batch,frameX,frameY);

        rightArm.draw(batch, (int) (frameX + frame.getAnchorRightArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorRightArm().y * frame.getSprite().getHeight()));

}
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
        if(frame!=null){
            return frame.getShieldAmount();
        }
        return 0;
    }

    public double getArmorPenLeft() {
        return leftArm.getArmorPen();
    }

    public double getShieldPenLeft() {
        return leftArm.getShieldPen();
    }

    public int getDamageLeft() {
        Random r = new Random();
        return (int)(leftArm.getDamage() * leftArm.getDamageMult()*(1+(r.nextFloat()-0.5f)/3));
    }

    public double getAttackSpeedLeft() {

                double i=(leftArm.getAttackSpeed() * leftArm.getAttackSpeedMult());
                return i;
    }

    public double getArmorPenRight() {
        return rightArm.getArmorPen();
    }

    public double getShieldPenRight() {
        return rightArm.getShieldPen();
    }

    public int getDamageRight() {
        Random r= new Random();
        return (int)(rightArm.getDamage() * rightArm.getDamageMult()*(1+(r.nextFloat()-0.5f)/3));
    }

    public double getAttackSpeedRight() {
        return rightArm.getAttackSpeed() * rightArm.getAttackSpeedMult();
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

    public void resetShieldAndArmor(){
        dead=false;
        armorAmount= getArmor();
        shieldAmount= getShieldAmount();
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
