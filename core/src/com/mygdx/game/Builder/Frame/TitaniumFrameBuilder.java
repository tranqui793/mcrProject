package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

/**
 * Class representing a concrete titanium frame builder.
 */
public class TitaniumFrameBuilder extends FrameBuilder{

    public FrameBuilder buildMaterial(){
        this.frameTmp.setMaterial(Material.TITANIUM);
        return this;
    }
    public FrameBuilder buildShieldGenerator(){
        this.frameTmp.setShieldGenerator(ShieldGenerator.LIGHT);
        return this;
    }
}
