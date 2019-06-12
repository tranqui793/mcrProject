package com.mygdx.game.Part;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

/**
 * Class representing an arm.
 * It has a weapon and a weight.
 */
public class Arm extends Part {

   private Vector2 hooktoFrame = new Vector2(0.5f,0.7f);
    private Weapon weapon;
    private Weight weight;

    private Vector2 anchorWeapon= new Vector2(0.7f,0.3f);
    private Vector2 hookToArm= new Vector2(0.5f,0.5f);

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



    @Override
    public void draw(Batch batch, float x, float y) {
        int trueX= (int) (x - weight.getSprite().getWidth() * hooktoFrame.x);
        int trueY= (int) (y - weight.getSprite().getHeight()* hooktoFrame.y);
        weight.draw(batch,trueX, trueY);
        weapon.draw(batch,trueX+weight.getSprite().getWidth()*anchorWeapon.x -weapon.getSprite().getWidth()*hookToArm.x,
                trueY+weight.getSprite().getHeight()*anchorWeapon.y -weapon.getSprite().getHeight()*hookToArm.y);
      /*  sprite.setPosition(x - sprite.getWidth() * hooktoFrame.x, y - sprite.getHeight() * hooktoFrame.y);
        sprite.setColor(Color.GRAY);
        sprite.draw(batch);
*/
    }
    public Weight getWeight(){
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
