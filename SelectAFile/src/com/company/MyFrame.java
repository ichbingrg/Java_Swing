package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JFileChooser fileChooser;
    JButton button;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            fileChooser = new JFileChooser();

            //fileChooser.setCurrentDirectory(new File(".")); // set the Current directory for your fileChooser

            //fileChooser.showOpenDialog(null); // select a file to open but cannot open file
            //int response = (fileChooser.showOpenDialog(null)); // 0-open, 1-cancel
            int response =fileChooser.showSaveDialog(null); // select file to save // won'T actually create a file yet though but just a dummy show

            if (response == JFileChooser.APPROVE_OPTION){//(same as (response == 0) but better and surer
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); // prints put the  location of the selected file
            }
        }
    }
}
