package com.company;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo  {
    JFrame frame = new JFrame("Progreesbar");
    JProgressBar bar = new JProgressBar(0,500);

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int i = 500;
        while(i>0){
        bar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        i--;}

        bar.setString("DONE!");
    }
}
