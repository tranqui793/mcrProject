package com.mygdx.game.Part;

import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

public class Arm extends Part {

    private Weapon weapon;
    private Weight weight;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Arm{" +
                "weapon=" + weapon +
                ", weight=" + weight +
                '}';
    }
}
