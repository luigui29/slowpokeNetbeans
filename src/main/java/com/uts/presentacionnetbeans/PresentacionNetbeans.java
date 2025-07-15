package com.uts.presentacionnetbeans;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class PresentacionNetbeans {
    
    static void GUI() {
        ImageIcon gif = new ImageIcon("C:\\Users\\luigu\\Documents\\NetBeansProjects\\PresentacionNetbeans\\src\\main\\java\\com\\uts\\presentacionnetbeans\\slowpoke.gif");
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel(gif);
        
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Slowpoke en NetBeans");
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        GUI();
    }
}
