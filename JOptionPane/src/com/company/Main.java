package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // JOptionPane =  pop up a standard dialog box that prompts users for a value or informs them of something
/*
        //Message option
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.QUESTION_MESSAGE);
  */
        //Option
        //int answer = JOptionPane.showConfirmDialog(null,"bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name ? : ");
        //System.out.println("Hello "+name);

        String[] responses = {"No, you r awesome","thank you","blush"};

        ImageIcon icon = new ImageIcon("yes.png");
        System.out.println(JOptionPane.showOptionDialog(
                         null,
                                "You are awesome",
                                   "secret message",
                                        JOptionPane.YES_NO_CANCEL_OPTION,
                                        JOptionPane.INFORMATION_MESSAGE,
                                        icon,
                                        responses,
                                        0));

    }
}
