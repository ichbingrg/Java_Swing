package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are Red\nViolets are blue\n");
        writer.append("\n(A poem by me)");
        writer.close();

        FileReader reader = new FileReader("poem.txt");
        int data = reader.read();

        while(data != -1){// -1 means no more data to be read
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
    }
}
