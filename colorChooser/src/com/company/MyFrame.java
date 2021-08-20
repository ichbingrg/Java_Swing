package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame(){
        this.setLayout(new FlowLayout());
        this.setTitle("Color Chooser");

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel("this is a label");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);


        this.add(button);
        this.add(label);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JColorChooser cc = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a color",Color.BLACK);

            label.setBackground(color);

        }
    }
}
