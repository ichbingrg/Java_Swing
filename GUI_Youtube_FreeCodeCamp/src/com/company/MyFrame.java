package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){ //creates a frame // constructor

        this.setSize(420,420); // sets x-dim and y-dim
        this.setTitle("JFRAME PRACTISE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit the app when close button is clicked else only hides
        this.setResizable(false); //prevent frame from being resized
        this.getContentPane().setBackground(new Color(123,50,255));// change color of the background

        this.setVisible(true); //makes the frame Visible

    ImageIcon image = new ImageIcon("logo.png"); // parsing the logo.png file into a javasuppported Image Object
        this.setIconImage(image.getImage()); // setting the image as the icon
    }
}
