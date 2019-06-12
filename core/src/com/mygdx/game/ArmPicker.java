package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;
import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Part.Arm;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;
import com.mygdx.game.Part.SubPart.Weapon;
import com.mygdx.game.Part.SubPart.Weight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class defining what an arm picker needs.
 */
public abstract class ArmPicker extends PartPicker {
    ArmBuilder ab;

    ImageButton leftArrowWeapon;
    ImageButton rightArrowWeapon;

    List<myDrawable> weapons;

    myDrawable currentWeapon;
    int currentWeaponIndex=0;
    Image imageWeapon;
    public ArmPicker(float x, float y, int height, int width , RobotBuilder target) {
        super(x, y, height, width,  Arrays.asList(Arrays.copyOf(Weight.values(), Weight.values().length, myDrawable[].class)),target);

         weapons=  Arrays.asList(Arrays.copyOf(Weapon.values(), Weapon.values().length, myDrawable[].class));

        ab= new ArmBuilder();
        leftArrowWeapon = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("leftArrow.png"))))); //Set the button up
        rightArrowWeapon = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("rightArrow.png"))))); //Set the button up

        leftArrowWeapon.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                previousWeapon();
            }
        });
        rightArrowWeapon.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                nextWeapon();
            }
        });

        currentWeapon= (Weapon)weapons.get(currentWeaponIndex);
        imageWeapon = new Image();
        imageWeapon.setDrawable(new SpriteDrawable(currentWeapon.getSprite()));
        imageWeapon.setScaling(Scaling.fit);

        row();
        add(leftArrowWeapon).width(35).pad(10);
        add(imageWeapon).expand();
        add(rightArrowWeapon).width(35).pad(10);

update();
    }

    public void nextWeapon(){
        currentWeaponIndex++;
        if(currentWeaponIndex>=weapons.size()){
            currentWeaponIndex=0;
        }
        update();
    }

    public void previousWeapon(){
        currentWeaponIndex--;
        if(currentWeaponIndex<0){
            currentWeaponIndex=weapons.size()-1;
        }
        update();
    }
    @Override
    public void update() {

            currentPart=availableParts.get(currentIndex);
            currentWeapon=weapons.get(currentWeaponIndex);
          //  ab.buildNewArm();
            ab.buildWeight((Weight) currentPart);
            ab.buildWeapon((Weapon)currentWeapon);


            image.setDrawable(new SpriteDrawable(currentPart.getSprite()));
            imageWeapon.setDrawable(new SpriteDrawable(currentWeapon.getSprite()));

    }

}
