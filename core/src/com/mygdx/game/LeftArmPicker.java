package com.mygdx.game;

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
