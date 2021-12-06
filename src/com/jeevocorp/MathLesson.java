package com.jeevocorp;

import java.util.Scanner;

public class MathLesson {

    public static void main(String[] args) {

        double x = 3.14;
        double y = 10;
        double z = -9;

        System.out.println("The higher number is: "+Math.max(x, y));
        System.out.println("The lesser number is: "+Math.min(x, y));
        System.out.println("The absolute of "+z+" is: "+Math.abs(z));
        System.out.println("The square root of "+y+" is: "+Math.sqrt(y));
        System.out.println("The rounded (down) value of "+x+" is: "+Math.floor(x));
        System.out.println("The rounded (up) value of "+x+" is: "+Math.ceil(x));
        System.out.println();

        // Exercise
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the triangle's side A value: ");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the triangle's side B value: ");
        double sideB = scanner.nextDouble();

        double hypotenuse = Math.hypot(sideA, sideB);
        //OR
        double alternateHypotenuse = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));

        System.out.println("The hypotenuse of the triangle with sides "+sideA+" and "+sideB+" is: "+hypotenuse);
        System.out.println("The hypotenuse of the triangle with sides "+sideA+" and "+sideB+" is: "+alternateHypotenuse);

        scanner.close();
    }
}
