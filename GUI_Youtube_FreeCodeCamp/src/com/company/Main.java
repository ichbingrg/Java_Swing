package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  JFrame frame = new JFrame(); //creates a frame
        frame.setSize(420,420); // sets x-dim and y-dim
        frame.setTitle("JFRAME PRACTISE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit the app when close button is clicked else only hides
        frame.setResizable(false); //prevent frame from being resized
        frame.getContentPane().setBackground(new Color(123,50,255));// change color of the background

        frame.setVisible(true); //makes the frame Visible

        ImageIcon image = new ImageIcon("logo.png"); // parsing the logo.png file into a javasuppported Image Object
        frame.setIconImage(image.getImage()); // setting the image as the icon
       */

        //MyFrame myFrame = new MyFrame();

        ImageIcon image = new ImageIcon("logo.png"); // image element for label
        Border border = BorderFactory.createLineBorder(Color.green,3); // border Element

        JLabel label = new JLabel();
        label.setText("Bro, Do you ev\nen code ? ");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center or right of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text to top center or bottom of the image icon
        label.setForeground(new Color(0x00FF00)); // set font color
        label.setFont(new Font("MV Boli",Font.PLAIN, 50)); // set font style
        label.setIconTextGap(-25); //set gab betn label and image
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // display background of the text
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within the center of the frame
        label.setHorizontalAlignment(JLabel.CENTER); // set horizonral position of icon+text within the center of the frame
        label.setBounds(250,250,550,550); // set x,y positions and dimentions of the frame in the window



        JFrame frame = new JFrame();
        //frame.setSize(1200,1200);
        //frame.setLayout(null); // reset the layout of frame in the window

        frame.setVisible(true);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // .pack() only after all the elements have been added
        frame.pack(); // sets the size of the frame automatically to pack in all the elements that we added to the frame -> framesize needs not to be mentioned


    }
}
