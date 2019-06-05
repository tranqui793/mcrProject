package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }


    @Override
    public void draw(SpriteBatch batch,int x, int y) {

        leftArm.draw(batch,(int)(x+anchorLeftArm.x*sprite.getWidth()), (int) (y+anchorLeftArm.y*sprite.getHeight()));
        leg.draw(batch,(int)(x+anchorLeg.x*sprite.getWidth()), (int) (y+anchorLeg.y*sprite.getHeight()));
        head.draw(batch,(int)(x+anchorHead.x*sprite.getWidth()), (int) (y+anchorHead.y*sprite.getHeight()));
        sprite.setColor(Color.CHARTREUSE);
        sprite.setPosition(x,y);
        sprite.draw(batch);
        rightArm.draw(batch,(int)(x+anchorRightArm.x*sprite.getWidth()), (int) (y+anchorRightArm.y*sprite.getHeight()));
    }
}
