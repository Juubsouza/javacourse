package com.jeevocorp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton();

    MyFrame(){
        button.setText("I'm a butt");
        button.setBounds(200, 100, 100, 50);
        button.setFocusable(true);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
//        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("Poo")); //Lambda

        this.setTitle("My Frame");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);

        ImageIcon image = new ImageIcon("Marco.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(000, 100, 150, 100));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Poo");
        }
    }
}