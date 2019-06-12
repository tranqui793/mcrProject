package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.Part;

import java.util.ArrayList;
import java.util.List;

/**
 * Class defining what a every part picker needs.
 */
public abstract class PartPicker extends Table {

    ImageButton leftArrow;
    ImageButton rightArrow;
    Image image;
    myDrawable currentPart;
    int currentIndex;
    List<myDrawable> availableParts;
    RobotBuilder target;

    public PartPicker(float x, float y, int height, int width,List<myDrawable> parts,RobotBuilder target) {
        this.target= target;
        availableParts=parts;
        setPosition(x, y);
        setSize(width, height);
        setDebug(true);
        leftArrow = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("leftArrow.png"))))); //Set the button up
        leftArrow.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                previous();
            }
        });
        rightArrow = new ImageButton(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("rightArrow.png"))))); //Set the button up


        rightArrow.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                next();
            }
        });
        currentPart = availableParts.get(currentIndex);


        image = new Image();
        image.setDrawable(new SpriteDrawable(currentPart.getSprite()));
        image.setScaling(Scaling.fit);
        setBackground(new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("pickerBackGround.png")))));
        add(leftArrow).width(35).pad(10);
        add(image).expand();
        add(rightArrow).width(35).pad(10);

    }

    public void setCurrentPart(Part currentPart) {
        this.currentPart = currentPart;
    }

    public void next(){
        currentIndex++;
        if(currentIndex>=availableParts.size()){
            currentIndex=0;
        }
        update();
    }

    public void previous(){
        currentIndex--;
        if(currentIndex<0){
            currentIndex=availableParts.size()-1;
        }
        update();
    }
    public abstract void update();


}
