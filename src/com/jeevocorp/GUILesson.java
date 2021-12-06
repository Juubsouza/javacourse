package com.jeevocorp;

import javax.swing.JOptionPane;

public class GUILesson {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        JOptionPane.showMessageDialog(null, "Hello "+name+". You are "+age+" years old and "+height+" cm tall.");
    }
}
