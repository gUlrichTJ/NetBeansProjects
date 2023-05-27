/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
// iconexperience.com
public class Panneau2Haut extends JMenuBar {
    
    // We try with the button run
    Icon runIcon = new ImageIcon("/home/mgraciano/NetBeansProjects/images/play-store.png");
    Icon smartPhone = new ImageIcon("/home/mgraciano/NetBeansProjects/images/smartphone.png");
    Icon mobilePhone = new ImageIcon("/home/mgraciano/NetBeansProjects/images/mobilephone.png");
    Icon debug = new ImageIcon("/home/mgraciano/NetBeansProjects/images/debug1.png");
    Icon stop1 = new ImageIcon("/home/mgraciano/NetBeansProjects/images/stop1.png");
    Icon debug2 = new ImageIcon("/home/mgraciano/NetBeansProjects/images/debug2.png");
    Icon device  = new ImageIcon("/home/mgraciano/NetBeansProjects/images/device.png");
    Icon search1 = new ImageIcon("/home/mgraciano/NetBeansProjects/images/search1.png");
    Icon settings = new ImageIcon("/home/mgraciano/NetBeansProjects/images/settings.png");
    Icon singIn = new ImageIcon("/home/mgraciano/NetBeansProjects/images/signIn.png");
// We create a JButton where we add the image
    JButton runButton;
    // Constructor
    public Panneau2Haut() {
        /*this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(new LineBorder(Color.WHITE, 2));
        this.setPreferredSize(new Dimension(30, 49));*/
        
        //runButton = new JButton(runIcon);
        
        //runButton.setPreferredSize(new Dimension(19, 23));
        //this.add(runButton);
        this.add(addImageAndString(smartPhone, "Google Pixelbook (mobile)"));
        this.add(addImageAndString(mobilePhone, "emulator-5554"));
        this.add(addImageAndString(runIcon, ""));
        this.add(addImageAndString(debug, ""));
        this.add(addImageAndString(stop1, ""));
        this.add(addImageAndString(debug2, ""));
        this.add(addImageAndString(device, ""));
        this.add(addImageAndString(search1, ""));
        this.add(addImageAndString(settings, ""));
        this.add(addImageAndString(singIn, ""));
    }
    
    // Method to add an image beside an icon
    public static JButton addImageAndString(Icon icon, String text) {
        
        JButton panel = new JButton();
        
        // Panel's specifications
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panel.setForeground(Color.WHITE);
        
        JLabel label = new JLabel(text);
        label.setBackground(Color.WHITE);
        label.setBorder(new LineBorder(Color.CYAN, 1));
        
        JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(24, 24));
        panel.add(label);
        panel.add((Component) icon, label);
        
        return panel;
    }
}
