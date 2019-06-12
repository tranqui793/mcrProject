package com.mygdx.game;


import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Head;
import com.mygdx.game.Part.Leg;

public class RobotBuilder {
    private Robot robotTmp = new Robot();

    public RobotBuilder buildLeftArm(Arm a){
        robotTmp.setLeftArm(a);
        return this;
    }

    public RobotBuilder buildRightArm(Arm a){
        robotTmp.setRightArm(a);
        return this;
    }

    public RobotBuilder buildLegs(Leg l){
        robotTmp.setLeftLeg(l);
        robotTmp.setRightLeg(l);
        return this;
    }

    public RobotBuilder buildHead(Head h){
        robotTmp.setHead(h);
        return this;
    }

    public RobotBuilder buildFrame(Frame f){
        robotTmp.setFrame(f);
        return this;
    }

    public Robot build(){

        Robot robot = new Robot();
        robot.setFrame(robotTmp.getFrame());
        robot.setHead(robotTmp.getHead());
        robot.setLeftArm(robotTmp.getLeftArm());
        robot.setRightArm(robotTmp.getRightArm());
        robot.setLeftLeg(robotTmp.getLeftLeg());
        robot.setRightLeg(robotTmp.getRightLeg());

        return robot;
    }

}
