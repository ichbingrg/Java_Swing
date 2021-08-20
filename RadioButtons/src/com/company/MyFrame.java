package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton hamburger;
    JRadioButton hotdog;
    ImageIcon hotdogicon;
    ImageIcon pizzaicon;
    ImageIcon hamburgergicon;

    MyFrame(){
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Radio Button");

        pizza = new JRadioButton("pizza");
        hamburger = new JRadioButton("hamburger");
        hotdog = new JRadioButton("hotdog");

        pizzaicon= new ImageIcon("pizza.png");
        hotdogicon = new ImageIcon("hotdog.png");
        hamburgergicon = new ImageIcon("hamburger.png");

        pizza.setIcon(pizzaicon);
        hamburger.setIcon(hamburgergicon);
        hotdog.setIcon(hotdogicon);
        pizza.addActionListener(this);
        hamburger.addActionListener(this);
        hotdog.addActionListener(this);

        ButtonGroup group = new ButtonGroup(); // if we don't group them, we will be able to choose more than one button at once
        group.add(pizza);
        group.add(hamburger);
        group.add(hotdog);

        this.add(pizza);
        this.add(hamburger);
        this.add(hotdog);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == pizza){
                System.out.println("You ordered Pizza");
            }
            if(e.getSource() == hamburger){
                System.out.println("You ordered Hamburger");
            }
            if(e.getSource() == hotdog){
                System.out.println("You ordered HotDog");
            }
            // this.dispose();
    }
}
