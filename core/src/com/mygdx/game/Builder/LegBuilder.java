package com.mygdx.game.Builder;

import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.SubPart.Shape;

/**
 * Class representing a leg builder.
 */
public class LegBuilder implements PartBuilder{

    private Leg legTmp = new Leg();

    public Leg build() {

        Leg leg = new Leg();
        leg.setShape(legTmp.getShape());

        if(leg.getShape() == null)
            throw new NullPointerException("Shape missing");

        return leg;
    }


    public LegBuilder buildShape(Shape shape){

        legTmp.setShape(shape);
        return this;
    }
}
