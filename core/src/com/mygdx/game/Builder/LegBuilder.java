package com.mygdx.game.Builder;

import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.SubPart.Shape;

public class LegBuilder {

    private Leg leg = new Leg();

    public Leg getLeg() {

        if(leg.getShape() == null)
            throw new NullPointerException("Shape missing");

        return leg;
    }

    public void buildNewLeg(){

        leg = new Leg();
    }

    public void buildShape(Shape shape){

        leg.setShape(shape);
    }
}
