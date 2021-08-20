package com.company;

import javax.swing.*;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    MyFrame(){
      this.setTitle("DragAndDrop");
      this.setSize(600,600);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



      this.add(dragPanel);
      this.setVisible(true);
  }
}
