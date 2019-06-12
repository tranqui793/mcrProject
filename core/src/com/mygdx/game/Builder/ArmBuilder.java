package com.mygdx.game.Builder;

import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

/**
 * Class representing an arm builder.
 */
public class ArmBuilder implements PartBuilder{
    private Arm armTmp = new Arm() ;


    public ArmBuilder buildWeight(Weight w){
        armTmp.setWeight(w);
        return this;
    }

    public ArmBuilder buildWeapon(Weapon w){
        armTmp.setWeapon(w);
        return this;
    }

    public Arm build() throws NullPointerException{

        Arm arm = new Arm();

        arm.setWeapon(armTmp.getWeapon());
        arm.setWeight(armTmp.getWeight());

        if(arm.getWeapon() == null || arm.getWeight() == null){
            throw new NullPointerException("Arm not built correctly");
        } else {
            return arm;
        }
    }
}
