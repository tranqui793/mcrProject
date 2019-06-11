package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Part;

import java.util.ArrayList;

public class FramePicker extends PartPicker {
    public FramePicker(float x, float y, int height, int width, ArrayList<myDrawable> parts, Robot target) {
        super(x, y, height, width, parts,target);
    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
            target.setFrame((Frame) currentPart);
            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
