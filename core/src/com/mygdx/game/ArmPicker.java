package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;

import java.util.ArrayList;

public class ArmPicker extends PartPicker {
    public ArmPicker(float x, float y, int height, int width, ArrayList<Part> parts, Robot target) {
        super(x, y, height, width, parts,target);
    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
            target.setArm((Arm) currentPart);
            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
