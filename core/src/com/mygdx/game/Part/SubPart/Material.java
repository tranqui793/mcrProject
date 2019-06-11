package com.mygdx.game.Part.SubPart;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.myDrawable;

public enum Material implements myDrawable {
    TITANIUM(50, 100),
    WOOD(1,10),
    CARBON(25, 50);

    private Sprite sprite;
    private int cost;
    private int armor;

    Material(int cost, int armor){
        this.cost = cost;
        this.armor = armor;
    }

    @Override
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public Sprite getSprite() {
        return new Sprite(sprite);
    }
}
