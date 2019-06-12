package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.SubPart.Sensor;
import com.mygdx.game.Part.SubPart.Shape;

import java.util.Arrays;

/**
 * Class defining a head picker.
 */
public class HeadPicker extends PartPicker {
    private HeadBuilder headbuilder;
    public HeadPicker(float x, float y, int height, int width, RobotBuilder target) {
        super(x, y, height, width, Arrays.asList(Arrays.copyOf(Sensor.values(), Sensor.values().length, myDrawable[].class)),target);
        headbuilder= new HeadBuilder();
        update();

    }

    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
//            headbuilder.buildNewHead();
            headbuilder.buildSensor((Sensor)currentPart);
            target.buildHead(headbuilder.build());

            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));

    }

}
