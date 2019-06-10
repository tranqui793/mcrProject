package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.Frame;

public abstract class FrameBuilder {
    public Frame frame = new Frame();

    public Frame getFrame() {
        return frame;
    }
    public void buildNewFrame(){
        this.frame = new Frame();
    }

    public int getPower(){
        return frame.getPower();
    }

    public abstract void buildMaterial();
    public abstract void buildShieldGenerator();

    public void buildHead(HeadBuilder headBuilder){
        this.frame.setHead(headBuilder.getHead());
    }

    public void buildArm(ArmBuilder armBuilder){

        this.frame.setLeftArm(armBuilder.getArm());
        this.frame.setRightArm(armBuilder.getArm());

    }

    public void buildLeg(LegBuilder legBuilder){

        this.frame.setLeftLeg(legBuilder.getLeg());
        this.frame.setRightLeg(legBuilder.getLeg());


    }
}
