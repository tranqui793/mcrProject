package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

/**
 * Class representing a concrete wood frame builder.
 */
public class WoodFrameBuilder extends FrameBuilder{

    public FrameBuilder buildMaterial(){
        this.frameTmp.setMaterial(Material.WOOD);
        return this;
    }
    public FrameBuilder buildShieldGenerator(){
        this.frameTmp.setShieldGenerator(ShieldGenerator.HEAVY);
        return this;
    }
}
