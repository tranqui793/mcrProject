package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;
import com.mygdx.game.Part.SubPart.Weight;

import java.util.ArrayList;

public class ArmPicker extends PartPicker {
    ArmBuilder ab;
    public ArmPicker(float x, float y, int height, int width, ArrayList<myDrawable> parts, RobotBuilder target) {
        super(x, y, height, width, parts,target);
        ab= new ArmBuilder();
    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
            ab.buildNewArm();
            ab.buildWeight((Weight) currentPart);
            target.buildRightArm((Arm) currentPart);
            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
