package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text_Field");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolar", Font.PLAIN,35));
        textField.setForeground(new Color(0x0000FF));
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setCaretColor(Color.red);
        textField.setText("Username");

        button = new JButton("submit");
        button.addActionListener(this);






        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String a = textField.getText();
            System.out.println("Welcome "+ a);

            button.setEnabled(false);
            textField.setEditable(false);
            this.dispose();
        }
    }
}
