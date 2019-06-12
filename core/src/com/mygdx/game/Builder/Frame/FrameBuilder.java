package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Builder.PartBuilder;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;


public abstract class FrameBuilder implements PartBuilder {
    public Frame frameTmp = new Frame();

    ///build the frame with parameters set
    public Frame build(){

        Frame frame = new Frame();

        frame.setMaterial(frameTmp.getMaterial());
        frame.setShieldGenerator(frameTmp.getShieldGenerator());

        return frame;
    }

    ///build the shield generator of the frame
    public abstract FrameBuilder buildShieldGenerator();
    ///build the material of the frame
    public abstract FrameBuilder buildMaterial();

}
