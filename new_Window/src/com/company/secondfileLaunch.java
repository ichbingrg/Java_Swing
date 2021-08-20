package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class secondfileLaunch implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("new Window");

    secondfileLaunch(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            newWindow myWindow = new newWindow();
            myWindow.frame2.setTitle("SecondWindow");
        }
    }
}
