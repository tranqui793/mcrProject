package com.mygdx.game;

import com.mygdx.game.Part.Part;

public interface RobotBuider {

    void setArm(Part arm);
    void setFrame(Part frame);
    void setHead(Part head);
    void setLeg(Part Leg);

    Robot build();

}
