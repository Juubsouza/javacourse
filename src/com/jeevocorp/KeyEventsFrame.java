package com.jeevocorp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventsFrame extends JFrame implements KeyListener {

    JLabel label;

    KeyEventsFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label.setBackground(Color.blue);
        label.setOpaque(true);

        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {


        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
