package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;

import javax.swing.*;

public class Robot extends Actor {

    private int armor;
    private int dodge;
    private int shield;
    private int attack;
    private int defense;
    private int energy;

    private Part arm;
    private Part frame;
    private Part Head;
    private Part leg;


    @Override
    public void draw(Batch batch, float parentAlpha) {
        frame.draw(batch, getX(),getY());
    }

    public void draw(SpriteBatch batch, int x, int y){

        frame.draw(batch,x,y);
    }
    public Part getArm() {
        return arm;
    }

    public void setArm(Part arm) {
        this.arm = arm;
    }

    public Part getFrame() {
        return frame;
    }

    public void setFrame(Part frame) {
        this.frame = frame;
    }

    public Part getHead() {
        return Head;
    }

    public void setHead(Part head) {
        Head = head;
    }

    public Part getLeg() {
        return leg;
    }

    public void setLeg(Part leg) {
        ((Frame)frame).setLeg((Leg)leg);
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
