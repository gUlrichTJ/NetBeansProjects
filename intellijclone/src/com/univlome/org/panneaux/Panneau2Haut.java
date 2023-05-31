/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import com.univlome.org.fenetres.Fenetre;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
    
    // We declare a Fenetre
    Fenetre fenetre;
    
    // Constructor iciclis unconscientious atop unsheathed
    public Panneau2Haut(Fenetre fenetre) {
        /*this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(new LineBorder(Color.WHITE, 2));
        this.setPreferredSize(new Dimension(30, 49));*/
        //runButton = new JButton(runIcon);
        this.fenetre = fenetre;
        
        this.setPreferredSize(new Dimension(20, 30));

        
        runButton = new JButton(runIcon);
        //runButton.setPreferredSize(new Dimension(19, 23));
        //this.add(runButton);
        
        // We add an action on the button
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fenetre.dispose();
            }
        });
        
        this.add(addImageAndString2(smartPhone, "Google Pixelbook (mobile)"));
        this.add(addImageAndString2(mobilePhone, "emulator-5554"));
        //this.add(addImageAndString(runIcon, ""));
        this.add(runButton);
        this.add(addImageAndString(debug, ""));
        this.add(addImageAndString(stop1, ""));
        this.add(addImageAndString(debug2, ""));
        this.add(addImageAndString(device, ""));
        this.add(addImageAndString(search1, ""));
        this.add(addImageAndString(settings, ""));
        this.add(addImageAndString(singIn, ""));
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
        button.add(label);
        
        //button.setIconTextGap(10);
        button.setContentAreaFilled(true);
        panel.add(button);
        
        label.setVisible(true);
        
        return panel;
    }
    
    public static JPanel addImageAndString2(Icon icon, String text) {
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panel.setBackground(Color.WHITE);

        JLabel label = new JLabel(text);
        label.setBorder(new LineBorder(Color.CYAN, 1));

        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBorder(new LineBorder(Color.CYAN, 1));
        iconLabel.setVerticalAlignment(SwingConstants.CENTER);

        panel.setLayout(new BorderLayout());
        panel.add(iconLabel, BorderLayout.WEST);
        panel.add(label, BorderLayout.CENTER);

        return panel;
    }

}
