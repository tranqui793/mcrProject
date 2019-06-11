package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public abstract class FrameBuilder {
    public Frame frame = new Frame();

    public Frame getFrame() {
        return frame;
    }
    public void buildNewFrame(){
        this.frame = new Frame();
    }

    public abstract void buildMaterial();


    public FrameBuilder build(){
        buildMaterial();
        buildShieldGenerator();
        return this;
    }
    public abstract void buildShieldGenerator();

}
