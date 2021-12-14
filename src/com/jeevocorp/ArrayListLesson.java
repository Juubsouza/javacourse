package com.jeevocorp;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList(); //The ArrayList data type needs to be a wrapper

        drinks.add("Water");
        drinks.add("Juice");
        drinks.add("Soda");

        ArrayList<String> sweets = new ArrayList();

        sweets.add("Chocolate");
        sweets.add("Chewing gum");
        sweets.add("Candy");

        ArrayList<String> fruits = new ArrayList();

        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Banana");

        Random random = new Random();

        JOptionPane.showMessageDialog(null,
                "Your favourite drink, sweet and fruit are respectively: "
                        +drinks.get(random.nextInt(3))
                        +", "+sweets.get(random.nextInt(3))
                        +" and "+fruits.get(random.nextInt(3)));
    }
}
