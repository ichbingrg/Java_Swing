package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        File file = new File("sound.wav");
        if (file.exists()) System.out.println("File found");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

        String response = "";
        while(!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = Quit");
            System.out.print("Enter your Choice : ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case ("P") :
                    clip.start();
                    break;
                default: System.out.println("Not a Valid Response");

            }



        }



    }
}
