package com.mygdx.game;

/**
 * Class defining the left arm picker.
 */
public class LeftArmPicker extends ArmPicker {
    public LeftArmPicker(float x, float y, int height, int width, RobotBuilder target) {
        super(x, y, height, width, target);
    }

    @Override
    public void update() {
        super.update();
        target.buildLeftArm(ab.build());
    }
}
