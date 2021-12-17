package com.jeevocorp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class AudioPlayer {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("The_Grand_Affair.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play/Pause, R = Reset, Q = Quit");

            response = scanner.next().toUpperCase();

            switch (response) {
                case "P":
                    if(clip.isRunning())
                        clip.stop();
                    else
                        clip.start();
                    break;

                case "R":
                    clip.setMicrosecondPosition(0);
                    break;


                case "Q":
                    clip.close();
                    System.out.println("See ya later");
                    break;
            }
        }
    }
}
