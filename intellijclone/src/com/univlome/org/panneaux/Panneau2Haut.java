/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Panneau2Haut extends JPanel {
    
    // We try with the button run
    Icon runIcon = new ImageIcon("/home/mgraciano/NetBeansProjects/images/play-store.png");
    Icon smartPhone = new ImageIcon("/home/mgraciano/NetBeansProjects/images/smartphone.png");
    
    // We create a JButton where we add the image
    JButton runButton;
    // Constructor
    public Panneau2Haut() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(new LineBorder(Color.WHITE, 2));
        this.setPreferredSize(new Dimension(30, 49));
        
        //runButton = new JButton(runIcon);
        
        //runButton.setPreferredSize(new Dimension(19, 23));
        //this.add(runButton);
        this.add(addImageAndString(runIcon, "Run here"));
        this.add(addImageAndString(smartPhone, "Google Pixelbook (mobile)"));
    }
    
    // Method to add an image beside an icon
    public static JPanel addImageAndString(Icon icon, String text) {
        
        JPanel panel = new JPanel();
        
        // Panel's specifications
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panel.setForeground(Color.WHITE);
        
        JLabel label = new JLabel(text);
        label.setBackground(Color.WHITE);
        label.setBorder(new LineBorder(Color.CYAN, 1));
        
        JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(24, 24));
        panel.add(button);
        panel.add(label);
        
        return panel;
    }
}
