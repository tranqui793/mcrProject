package com.mygdx.game.desktop;


import com.mygdx.game.Builder.ArmBuilder;
import com.mygdx.game.Builder.Frame.CarbonFrameBuilder;
import com.mygdx.game.Builder.Frame.FrameBuilder;
import com.mygdx.game.Builder.Frame.TitaniumFrameBuilder;
import com.mygdx.game.Builder.Frame.WoodFrameBuilder;
import com.mygdx.game.Builder.HeadBuilder;
import com.mygdx.game.Builder.LegBuilder;
import com.mygdx.game.Part.Frame;
import com.mygdx.game.Part.Leg;
import com.mygdx.game.Part.SubPart.*;
import com.mygdx.game.Part.SubPart.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Class representing the main window
 *
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class MainView extends JFrame {

    HeadBuilder headBuilder = new HeadBuilder();

    ArmBuilder armBuilder = new ArmBuilder();
    LegBuilder legBuilder = new LegBuilder();
    FrameBuilder frameBuilder;


    public MainView() {
        this.setTitle("Clients Manager");
        this.setSize(600, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);


        //PANEL robot
        JPanel robotPanel = new JPanel();
        robotPanel.setLayout(new FlowLayout());

        JLabel robotLabel = new JLabel("Robot");

        final JComboBox materialBox = new JComboBox(Material.values());
        materialBox.setPrototypeDisplayValue("LX1(9999999999999)");
        materialBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {



                // Print the selected items and the action command.
                Material selected = (Material) materialBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                switch (selected){

                    case WOOD:
                        frameBuilder = new WoodFrameBuilder();
                        break;
                    case CARBON:
                        frameBuilder = new CarbonFrameBuilder();
                        break;

                    case TITANIUM:
                        frameBuilder = new TitaniumFrameBuilder();
                        break;
                }

            }
        });

        final JComboBox sensorBox = new JComboBox(Sensor.values());
        sensorBox.setPrototypeDisplayValue("LX1(9999999999999)");

        sensorBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {



                // Print the selected items and the action command.
                Sensor selected = (Sensor) sensorBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                headBuilder.buildSensor(selected);

            }
        });


        final JComboBox shapeBox = new JComboBox(Shape.values());
        shapeBox.setPrototypeDisplayValue("LX1(9999999999999)");

        shapeBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {



                // Print the selected items and the action command.
                Shape selected = (Shape) shapeBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                legBuilder.buildShape(selected);

            }
        });

        JComboBox shieldBox = new JComboBox(ShieldGenerator.values());
        shieldBox.setPrototypeDisplayValue("LX1(9999999999999)");



        final JComboBox weaponBox = new JComboBox(Weapon.values());
        weaponBox.setPrototypeDisplayValue("LX1(9999999999999)");

        weaponBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {



                // Print the selected items and the action command.
                Weapon selected = (Weapon) weaponBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                armBuilder.buildWeapon(selected);

            }
        });

        final JComboBox weightBox = new JComboBox(Weight.values());
        weightBox.setPrototypeDisplayValue("LX1(9999999999999)");
        weightBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {



                // Print the selected items and the action command.
                Weight selected = (Weight) weightBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                armBuilder.buildWeight(selected);

            }
        });




        JButton buttonBuild = new JButton("Build");


        robotPanel.add(robotLabel);
        robotPanel.add(materialBox);
        robotPanel.add(sensorBox);
        robotPanel.add(shapeBox);
        robotPanel.add(shieldBox);
        robotPanel.add(weaponBox);
        robotPanel.add(weightBox);
        robotPanel.add(buttonBuild);



        buttonBuild.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frameBuilder.buildMaterial();
                frameBuilder.buildShieldGenerator();
                frameBuilder.buildArm(armBuilder);
                frameBuilder.buildLeg(legBuilder);
                frameBuilder.buildHead(headBuilder);
                Frame frame = frameBuilder.getFrame();

                System.out.println(frame);




            }
        });









        JPanel pan = new JPanel();
        // We then put these lines in a column
        pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS));

        pan.add(robotPanel);


        this.getContentPane().add(pan);
        this.setVisible(true);
    }
}