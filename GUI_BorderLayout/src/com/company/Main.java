package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

//Border Layout =  A BorderLayout is a method to place the components on diverent areas of the border of the frame
        // Mainly NORTH,SOUTH,EAST,WEST,CENTER

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.green);
        panel5.setBackground(Color.yellow);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));


        //-----SUB-PANELS in panel 5

        panel5.setLayout(new BorderLayout(2,2));

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        //JPanel panel0 = new JPanel();

        panel6.setBackground(Color.cyan);
        panel7.setBackground(Color.black);
        panel8.setBackground(Color.ORANGE);
        panel9.setBackground(Color.magenta);
        //panel0.setBackground(Color.pink);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        //panel0.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.WEST);
        //panel5.add(panel0,BorderLayout.CENTER);

        //END OF SUB PANELS

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setTitle("BorderLayout Practise");
 }
}
