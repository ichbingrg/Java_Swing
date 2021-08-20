package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon one,two,three,four;
    MyFrame(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("mouseListener");
        this.setLayout(new FlowLayout());

        one = new ImageIcon("cool.png");
        two = new ImageIcon("cry.png");
        three = new ImageIcon("love.png");
        four = new ImageIcon("sad.png");

        label = new JLabel();
        label.setBounds(0,0,128,128);
        label.setIcon(one);
        //label.setOpaque(true);
        label.addMouseListener(this);
        //this.addMouseListener(this);



        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    int clicks =0 ;
    @Override
    public void mouseClicked(MouseEvent e) {
        // clicked on a component (hold and release)
        System.out.println("You clicked the mouse");
        clicks++;
        if(clicks%2 ==0)
            label.setIcon(three);

        if(clicks%4==0)
            label.setIcon(one);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // mouse has been pressed
        System.out.println("You pressed the mouse");
        label.setBackground(Color.orange);

    }

    @Override
    public void mouseReleased(MouseEvent e){
        System.out.println("You released the mouse");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //mouse enter the area // hovers
        System.out.println("You entered the mouse");
        label.setBackground(Color.magenta);
        label.setIcon(four);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the mouse");
        label.setBackground(Color.red);
        label.setIcon(one);
        clicks = 0;
    }
}
