package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon shit;

    MyFrame(){
        this.setTitle("KeyListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);

        Image i = new ImageIcon("shit.png").getImage().getScaledInstance(100,100,4);
        shit= new ImageIcon(i);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        //label.setOpaque(false);
        label.setIcon(shit);

        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) { //typed character
        //invoked when a key is typed. Uses KeyChar, char output // if i press q or Q, then the output will be q or Q resp.
        switch(e.getKeyChar()){
            case'a' : label.setLocation(label.getX()-5,label.getY());
            break;

            case'w' : label.setLocation(label.getX(),label.getY()-5);
            break;

            case'd' : label.setLocation(label.getX()+5,label.getY());
            break;

            case's' : label.setLocation(label.getX(),label.getY()+5);
            break;

            default: System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) { // button number
        //invoked when a physical key is pressed down. uses KeyCode , int output //if i press q or Q, then the output will be 81
        // setting up the arrow keys
        switch(e.getKeyCode()){
            case(37) : label.setLocation(label.getX()-5,label.getY());
                break;

            case(38) : label.setLocation(label.getX(),label.getY()-5);
                break;

            case(39) : label.setLocation(label.getX()+5,label.getY());
                break;

            case(40) : label.setLocation(label.getX(),label.getY()+5);
                break;

            default: System.exit(0);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a button is released
        System.out.println("You released key char : "+ e.getKeyChar());
        System.out.println("You released key Code : "+ e.getKeyCode());
    }
}
