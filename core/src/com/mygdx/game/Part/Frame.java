package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;

public class Frame extends Part {

    private Material material;
    private ShieldGenerator shieldGenerator;


    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        if(this.material != null){
            setEnergyCost(getEnergyCost() + material.getEnergyCost() - this.material.getEnergyCost());
        } else {
            setEnergyCost(getEnergyCost() + material.getEnergyCost());
        }
        setArmor(material.getArmor());
        this.material = material;
    }

    public ShieldGenerator getShieldGenerator() {
        return shieldGenerator;
    }

    public void setShieldGenerator(ShieldGenerator shieldGenerator) {
        if(this.shieldGenerator != null){
            setEnergyCost(getEnergyCost() + shieldGenerator.getEnergyCost() - this.shieldGenerator.getEnergyCost());
        } else {
            setEnergyCost(getEnergyCost() + shieldGenerator.getEnergyCost());
        }
        setShieldAmount(getShieldAmount());
        this.shieldGenerator = shieldGenerator;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material=" + material +
                ", shieldGenerator=" + shieldGenerator +
                '}';
    }

}
