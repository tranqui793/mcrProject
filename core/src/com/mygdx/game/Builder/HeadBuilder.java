package com.mygdx.game.Builder;

import com.mygdx.game.Part.Head;
import com.mygdx.game.Part.SubPart.Sensor;

public class HeadBuilder implements PartBuilder{

    private Head headTmp = new Head();

    public Head build()
    {
        Head head = new Head();
        head.setSensor(headTmp.getSensor());
        if(head.getSensor() == null)
            throw new NullPointerException("sensor missing");

        return head;
    }



    public HeadBuilder buildSensor(Sensor sensor){

            headTmp.setSensor(sensor);
            return this;
    }
}
