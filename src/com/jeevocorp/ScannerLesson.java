package com.jeevocorp;

import java.util.Scanner;

public class ScannerLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        scanner.nextLine(); // This is used to clear the scanner;
                            // Without this, the scanner will skip the next
                            // "nextLine()" that comes after the previous "nextInt()"

        System.out.println("What is your favorite food?");
        String favoriteFood = scanner.nextLine();

        System.out.println("Hello "+name+"!");
        System.out.println("You are "+age+" years old");
        System.out.println("Your favorite food is: "+favoriteFood);
    }
}
