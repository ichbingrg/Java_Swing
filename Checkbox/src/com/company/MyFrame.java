package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton button;
    ImageIcon icon0;
    ImageIcon icon1;
    MyFrame(){
        this.setTitle("CheckBox");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        icon0 = new ImageIcon("zero.png");
        icon1 = new ImageIcon("one.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);


        checkBox = new JCheckBox();
        checkBox.setFocusable(false);
        checkBox.setSize(300,300);
        checkBox.setText("I'm not a Robot");
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(icon0);
        checkBox.setSelectedIcon(icon1);




        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());

        }
    }
}
