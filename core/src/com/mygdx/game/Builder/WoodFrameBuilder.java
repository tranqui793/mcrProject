package com.mygdx.game.Builder;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class WoodFrameBuilder extends FrameBuilder{
    public void buildMaterial(){
        this.frame.setMaterial(Material.WOOD);
    }
    public void buildShieldGenerator(){
        this.frame.setShieldGenerator(ShieldGenerator.HEAVY);
    }
}
