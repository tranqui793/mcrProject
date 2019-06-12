package com.mygdx.game;

/**
 * Class representing the right arm picker.
 */
public class RightArmPicker extends ArmPicker {
    public RightArmPicker(float x, float y, int height, int width, RobotBuilder target) {
        super(x, y, height, width, target);
    }

    @Override
    public void update() {
        super.update();
        target.buildRightArm(ab.build());
    }
}
