package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;

import java.util.ArrayList;

public class LegPicker extends PartPicker {
    public LegPicker(float x, float y, int height, int width, ArrayList<Part> parts,Robot target) {
        super(x, y, height, width, parts,target);
    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
            target.setLeg((Leg) currentPart);
            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
