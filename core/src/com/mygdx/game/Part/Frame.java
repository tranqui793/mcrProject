package com.mygdx.game.Part;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Part.SubPart.Material;
import com.mygdx.game.Part.SubPart.ShieldGenerator;
import com.mygdx.game.myDrawable;

public class Frame extends Part {


    private Vector2 anchorHead = new Vector2(0.5f, 0.9f);
   

    private Vector2 anchorLeg = new Vector2(0.5f, 0.1f);
   

    private Vector2 anchorLeftArm = new Vector2(0.4f, 0.67f);
    private Vector2 anchorRightArm = new Vector2(0.6f, 0.67f);

    private Material material;
    private ShieldGenerator shieldGenerator;

    private myDrawable test;


    public Vector2 getAnchorHead() {
        return anchorHead;
    }

    public Vector2 getAnchorLeg() {
        return anchorLeg;
    }

    public Vector2 getAnchorLeftArm() {
        return anchorLeftArm;
    }

    public Vector2 getAnchorRightArm() {
        return anchorRightArm;
    }


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



    @Override
    public void draw(Batch batch, float x, float y) {

        sprite.setPosition(x, y);
        sprite.draw(batch);
    }

}
