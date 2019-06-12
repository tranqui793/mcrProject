package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Interface defining how to draw a part.
 */
public interface myDrawable {
    public void setSprite(Sprite sprite);
    public Sprite getSprite();

    public void draw(Batch batch, float x, float y);

}
