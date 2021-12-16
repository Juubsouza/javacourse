
package com.jeevocorp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JFrameLesson {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Strawhat icon.png");

        Border border = BorderFactory.createLineBorder(new Color(0xF5DA42), 3);

        JLabel label = new JLabel();
        label.setText("One piece de cu é rola");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(0xF5DA42));
        label.setFont(new Font("MB Boli", Font.PLAIN, 20));
        label.setIconTextGap(50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0, 0, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
