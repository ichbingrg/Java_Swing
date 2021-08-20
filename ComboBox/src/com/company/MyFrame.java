package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame(){
        this.setTitle("ComboBox");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] animals = {"dog","cat", "bird"};
        comboBox = new JComboBox(animals); // always use wrapper Class as parameter!!!
        comboBox.addActionListener(this);

        comboBox.setEditable(true); // you can just Type the option you want
        //System.out.println(comboBox.getItemCount()); // number of items to choose from
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0); //selected default item
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }

    }
}
