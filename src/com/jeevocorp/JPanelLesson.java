package com.jeevocorp;

import javax.swing.*;
import java.awt.*;

public class JPanelLesson {
    public static void main(String[] args) {
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
