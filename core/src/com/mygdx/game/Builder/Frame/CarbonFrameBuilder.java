package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class CarbonFrameBuilder extends FrameBuilder {

    public void buildMaterial(){
        this.frame.setMaterial(Material.CARBON);
    }
    public void buildShieldGenerator(){
        this.frame.setShieldGenerator(ShieldGenerator.MEDIUM);
    }
}
