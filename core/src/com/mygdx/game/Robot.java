package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;

public class Robot extends Actor {


    private int armor;
    private int dodge;
    private int shield;
    private int attack;
    private int defense;
    private int energy;

    private Part leftArm;
    private Part rightArm;
    private Frame frame;

    


    private Part head;
    private Part leg;


    @Override
    public void draw(Batch batch, float parentAlpha) {
        float frameY = getY()+ heightOffset();
        float frameX = getX()+ widthOffset();

        leftArm.draw(batch, (int) (frameX + frame.getAnchorLeftArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeftArm().y * frame.getSprite().getHeight()));
        leg.draw(batch, (int) (frameX + frame.getAnchorLeg().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeg().y * frame.getSprite().getHeight()));
        head.draw(batch, (int) (frameX + frame.getAnchorHead().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorHead().y * frame.getSprite().getHeight()));

        frame.draw(batch,frameX,frameY);

        rightArm.draw(batch, (int) (frameX + frame.getAnchorRightArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorRightArm().y * frame.getSprite().getHeight()));
    }
    public int widthOffset() {
        return (int) (-frame.getSprite().getHeight() / 2);
    }
    public int heightOffset() {
        if (leg != null) {
            return (int) (leg.getSprite().getHeight() * ((Leg)leg).getHooktoFrame().y - frame.getSprite().getHeight() * frame.getAnchorLeg().y);
        }else {
            return 0;
        }
    }
    public void draw(SpriteBatch batch, int x, int y){

        float frameX = x+ widthOffset();
        float frameY = y+ heightOffset();

        leftArm.draw(batch, (int) (frameX + frame.getAnchorLeftArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeftArm().y * frame.getSprite().getHeight()));
        leg.draw(batch, (int) (frameX + frame.getAnchorLeg().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorLeg().y * frame.getSprite().getHeight()));
        head.draw(batch, (int) (frameX + frame.getAnchorHead().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorHead().y * frame.getSprite().getHeight()));

        frame.draw(batch,frameX,frameY);

        rightArm.draw(batch, (int) (frameX + frame.getAnchorRightArm().x * frame.getSprite().getWidth()), (int) (frameY + frame.getAnchorRightArm().y * frame.getSprite().getHeight()));

    }

    public Part getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Part leftArm) {
        this.leftArm = leftArm;
    }

    public Part getRightArm() {
        return rightArm;
    }

    public void setRightArm(Part arm) {
        this.rightArm = arm;
    }

    public Part getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Part getHead() {
        return head;
    }

    public void setHead(Part head) {
        this.head = head;
    }

    public Part getLeg() {
        return leg;
    }

    public void setLeg(Part leg) {

        this.leg = leg;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
