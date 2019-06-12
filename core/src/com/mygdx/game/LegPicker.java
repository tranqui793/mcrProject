package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;
import com.mygdx.game.Part.SubPart.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class LegPicker extends PartPicker {
    private LegBuilder legbuilder;
    public LegPicker(float x, float y, int height, int width,RobotBuilder target) {
        super(x, y, height, width, Arrays.asList(Arrays.copyOf(Shape.values(), Shape.values().length, myDrawable[].class)),target);
        legbuilder= new LegBuilder();
update();
    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
  //          legbuilder.buildNewLeg();
            legbuilder.buildShape((Shape)currentPart);
            target.buildLegs(legbuilder.build());

            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
