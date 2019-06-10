package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public  class FrameBuilder {
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

    public  void buildMaterial(Material material){
        frame.setMaterial(material);
    }
    public  void buildShieldGenerator(ShieldGenerator shield){
        frame.setShieldGenerator(shield);

    }

    public FrameBuilder buildHead(HeadBuilder headBuilder){
        this.frame.setHead(headBuilder.getHead());
        return this;
    }

    public FrameBuilder buildArm(ArmBuilder armBuilder){

        this.frame.setLeftArm(armBuilder.getArm());
        this.frame.setRightArm(armBuilder.getArm());
        return this;
    }

    public FrameBuilder buildLeg(LegBuilder legBuilder){

        this.frame.setLeftLeg(legBuilder.getLeg());
        this.frame.setRightLeg(legBuilder.getLeg());
        return this;


    }
}
