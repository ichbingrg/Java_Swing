package com.company;

import java.awt.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here

        File file = new File("secret_msg.txt");

        if(file.exists()){
            System.out.println("File Exists");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }else{
            System.out.print("File doesn't Exist");
        }
    }
}
