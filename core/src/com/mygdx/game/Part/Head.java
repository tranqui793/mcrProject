package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Sensor;

public class Head extends Part {

    private Sensor sensor;

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "sensor=" + sensor +
                '}';
    }
}
