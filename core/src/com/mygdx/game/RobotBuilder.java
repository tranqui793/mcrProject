package com.mygdx.game;


import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Head;
import com.mygdx.game.Part.Leg;

public class RobotBuilder {
    private Robot robot = new Robot();

    public void buildLeftArm(Arm a){
        robot.setLeftArm(a);
    }

    public void buildRightArm(Arm a){
        robot.setRightArm(a);
    }

    public void buildLegs(Leg l){
        robot.setLeftLeg(l);
        robot.setRightLeg(l);
    }

    public void buildHead(Head h){
        robot.setHead(h);
    }

    public void buildFrame(Frame f){
        robot.setFrame(f);
    }

    public Robot build(){
        return robot;
    }

}
