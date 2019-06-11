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
        if(this.weapon != null) {
            setEnergyCost(getEnergyCost() - this.weapon.getCost() + weapon.getCost());
        } else {
            setEnergyCost(getEnergyCost() + weapon.getCost());
        }
        setDamage(weapon.getDamage());
        setAccuracy(weapon.getAccuracy());
        setDamage(weapon.getDamage());
        setAttackSpeed(weapon.getAttackSpeed());
        setArmorPen(weapon.getArmorPen());
        setShieldPen(weapon.getShieldPen());
        this.weapon = weapon;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        if(this.weight != null){
            setEnergyCost(getEnergyCost() - this.weight.getCost() + weight.getCost());
        } else {
            setEnergyCost(weight.getCost());
        }
        setAttackSpeedMult(weight.getAttackSpeedMult());
        setDamageMult(weight.getDamageMult());
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
