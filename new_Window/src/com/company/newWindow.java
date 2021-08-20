package com.company;

import javax.swing.*;
import java.awt.*;

public class newWindow {
    JFrame frame2 = new JFrame();
    JLabel label =new JLabel("Hello");
    newWindow(){
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500,500);
        frame2.setLayout(null);

        label.setBounds(0,0,100,40);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame2.add(label);
        frame2.setVisible(true);

    }
}
