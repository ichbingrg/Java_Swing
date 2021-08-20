package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label; // only seen after clicking the button

    MyFrame(){

        Image ic = new ImageIcon("iconLA.png").getImage().getScaledInstance(80,50,Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(ic);
        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this); //button.addActionListener(e -> System.out.println("poo")); // Lambda Expression
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,15));
        //button.setIconTextGap(-15);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createRaisedBevelBorder());

        //Label (only visible after clicking the button)

        label = new JLabel();
        ImageIcon icon2 = new ImageIcon("emoji_u1f3a7.png");
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        this.setTitle("Button_practise");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("pooh");
            button.setEnabled(false); // only CLickable once
            label.setVisible(true);
        }
    }
}
