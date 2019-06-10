package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.Frame;

public abstract class FrameBuilder {
    public Frame frame;

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
}
