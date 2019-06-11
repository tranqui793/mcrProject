package com.mygdx.game.Part;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;
import com.mygdx.game.myDrawable;

public class Frame extends Part {



    private Vector2 anchorHead = new Vector2(0.5f, 0.9f);
   

    private Vector2 anchorLeg = new Vector2(0.5f, 0.1f);
   

    private Vector2 anchorLeftArm = new Vector2(0.4f, 0.67f);
    private Vector2 anchorRightArm = new Vector2(0.6f, 0.67f);


    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Arm leftArm;
    private Arm rightArm;


    private Material material;
    private int power = 200;
    private ShieldGenerator shieldGenerator;

    private myDrawable test;
    public Leg getLeg() {

        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Vector2 getAnchorHead() {
        return anchorHead;
    }

    public Vector2 getAnchorLeg() {
        return anchorLeg;
    }

    public Vector2 getAnchorLeftArm() {
        return anchorLeftArm;
    }

    public Vector2 getAnchorRightArm() {
        return anchorRightArm;
    }

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


    public int heightOffset() {
        if (leg != null) {
            return (int) (leg.getSprite().getHeight() * leg.getHooktoFrame().y - sprite.getHeight() * anchorLeg.y);
        }else {
            return 0;
        }
    }

    public int widthOffset() {
        return (int) (-sprite.getHeight() / 2);
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


    @Override
    public void draw(Batch batch, float x, float y) {

        sprite.setPosition(x, y);
        sprite.draw(batch);
    }
}
