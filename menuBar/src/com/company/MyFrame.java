package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenuItem save,load,exit;
    JMenu File,Edit,Help;
    ImageIcon Iexit,ISave,Iload;


    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MenuBar");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Help = new JMenu("Help");

        save = new JMenuItem("Save");
        load = new JMenuItem("load");
        exit = new JMenuItem("exit");

        //resizing the images for logo
        Image i = new ImageIcon("logout.png").getImage().getScaledInstance(10,10,Image.SCALE_SMOOTH);
        Image j = new ImageIcon("piggy-bank.png").getImage().getScaledInstance(10,10,Image.SCALE_SMOOTH);
        Image k = new ImageIcon("folder.png").getImage().getScaledInstance(10,10,Image.SCALE_SMOOTH);

        //icons
        Iexit= new ImageIcon(i);
        ISave= new ImageIcon(j);
        Iload= new ImageIcon(k);

        //setting up keyboard shortcuts for the operations
        //for menus
        File.setMnemonic(KeyEvent.VK_F);// Alt + f
        Edit.setMnemonic(KeyEvent.VK_E);//Alt + e
        Help.setMnemonic(KeyEvent.VK_H);//Alt + h
        //keyboard shortcuts for the menuitems in file menu
        load.setMnemonic(KeyEvent.VK_L); //l for load
        save.setMnemonic(KeyEvent.VK_S); // S for save
        exit.setMnemonic(KeyEvent.VK_E); // e to exit

        //adding icons to the menu Items
        load.setIcon(Iload);
        save.setIcon(ISave);
        exit.setIcon(Iexit);

        //adding Action listeners to the menu Items
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        File.add(save);
        File.add(load);
        File.add(exit);

        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == save){
            System.out.println("Saving File");
        }
        if(e.getSource() == load){
            System.out.println("Loading File");

        }
        if (e.getSource() == exit) {
            System.out.println("Exiting File...");
            System.exit(0);
        }
    }
}
