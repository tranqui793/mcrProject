package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

/**
 * Class representing a concrete carbon frame builder.
 */
public class CarbonFrameBuilder extends FrameBuilder {

    public FrameBuilder buildMaterial(){
        this.frameTmp.setMaterial(Material.CARBON);
        return this;
    }
    public FrameBuilder buildShieldGenerator(){
        this.frameTmp.setShieldGenerator(ShieldGenerator.MEDIUM);
        return this;
    }
}
