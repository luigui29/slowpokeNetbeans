package com.uts.presentacionnetbeans;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class PresentacionIntelliJ {
    static void GUI() {
        ImageIcon slowpoke = new ImageIcon("C:\\Users\\luigu\\IdeaProjects\\slowpokeNetbeans\\src\\main\\java\\com\\uts\\presentacionnetbeans\\slowpokeking.gif");

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel(slowpoke);

        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Slowpoke en IntelliJ");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI();
    }

}
