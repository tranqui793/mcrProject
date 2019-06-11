package com.mygdx.game;

import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Builder.Frame.FrameBuilder;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;

public class RobotBuilder {
    private Robot robot = new Robot();

    public void buildLeftArm(ArmBuilder ab){
        robot.setLeftArm(ab.getArm());
    }

    public void buildRightArm(ArmBuilder ab){
        robot.setRightArm(ab.getArm());
    }

    public void buildLegs(LegBuilder lb){
        robot.setLeftLeg(lb.getLeg());
        robot.setRightLeg(lb.getLeg());
    }

    public void buildHead(HeadBuilder hb){
        robot.setHead(hb.getHead());
    }

    public void buildFrame(FrameBuilder fb){
        robot.setFrame(fb.getFrame());
    }

    public Robot build(){
        return robot;
    }

}
