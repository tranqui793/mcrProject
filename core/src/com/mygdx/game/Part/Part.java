package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public  abstract class Part  {

    protected Sprite sprite;
    
  private int energyCost;

    public abstract void draw(Batch batch, float x, float y);



  

    public int getEnergyCost() {
        return energyCost;

    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }


}
