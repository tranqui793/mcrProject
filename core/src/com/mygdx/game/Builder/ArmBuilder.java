package com.mygdx.game.Builder;

import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

public class ArmBuilder {
    private Arm arm;

    public void buildNewArm(){
        arm = new Arm();
    }

    public void buildWeight(Weight w){
        arm.setWeight(w);
    }

    public void buildWeapon(Weapon w){
        arm.setWeapon(w);
    }

    public Arm getArm() throws NullPointerException{
        if(arm.getWeapon() == null || arm.getWeight() == null){
            throw new NullPointerException("Arm not built correctly");
        } else {
            return arm;
        }
    }
}
