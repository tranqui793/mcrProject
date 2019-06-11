package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Shape;

public class Leg extends Part {

    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
        setArmor(shape.getArmor());
        setDodge(shape.getDodge());
        setEnergyCost(shape.getCost());
    }

    @Override
    public String toString() {
        return "Leg{" +
                "shape=" + shape +
                '}';
    }
}

