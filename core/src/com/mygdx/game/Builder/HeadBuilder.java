package com.mygdx.game.Builder;

import com.mygdx.game.Part.Head;
import com.mygdx.game.Part.SubPart.Sensor;

public class HeadBuilder{

    private Head head = new Head();

    public Head getHead()
    {
        if(head.getSensor() == null)
            throw new NullPointerException("sensor missing");

        return head;
    }

    public void buildNewHead(){

        head = new Head();
    }

    public void buildSensor(Sensor sensor){

            head.setSensor(sensor);
    }
}
