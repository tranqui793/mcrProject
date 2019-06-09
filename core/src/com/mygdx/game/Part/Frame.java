package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

public class Frame extends Part{



    private Vector2 anchorHead = new Vector2(0.5f,0.9f);
    private Head head;

    private Vector2 anchorLeg = new Vector2(0.5f,0.1f);
    private Leg leg;

    private Vector2 anchorLeftArm= new Vector2(0.5f,0.67f);
    private Vector2 anchorRightArm= new Vector2(0.5f,0.67f);

    private Arm leftArm,rightArm;

    private String protection;
    private String powerSource;

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

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public int heightOffset(){
        return (int) (leg.getSprite().getHeight()*leg.getHooktoFrame().y- sprite.getHeight()*anchorLeg.y);
    }
    public int widthOffset(){
        return (int) (- sprite.getHeight()/2);
    }
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }


    @Override
    public void draw(Batch batch, float x, float y) {
        float frameY= y+ heightOffset();
        float frameX= x+ widthOffset();
        leftArm.draw(batch,(int)(frameX+anchorLeftArm.x*sprite.getWidth()), (int) (frameY+anchorLeftArm.y*sprite.getHeight()));
        leg.draw(batch,(int)(frameX+anchorLeg.x*sprite.getWidth()), (int) (frameY+anchorLeg.y*sprite.getHeight()));
        head.draw(batch,(int)(frameX+anchorHead.x*sprite.getWidth()), (int) (frameY+anchorHead.y*sprite.getHeight()));
        sprite.setColor(Color.CHARTREUSE);
        sprite.setPosition(frameX,frameY);
        sprite.draw(batch);
        rightArm.draw(batch,(int)(frameX+anchorRightArm.x*sprite.getWidth()), (int) (frameY+anchorRightArm.y*sprite.getHeight()));
    }
}
