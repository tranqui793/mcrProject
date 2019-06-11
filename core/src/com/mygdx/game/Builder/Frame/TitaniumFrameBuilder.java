package com.mygdx.game.Builder.Frame;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class TitaniumFrameBuilder extends FrameBuilder{

    public void buildMaterial(){
        this.frame.setMaterial(Material.TITANIUM);
    }
    public void buildShieldGenerator(){
        this.frame.setShieldGenerator(ShieldGenerator.LIGHT);
    }
}
