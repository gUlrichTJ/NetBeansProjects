/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mgraciano
 */
public class Haut extends JMenuBar {
    
    // Nous créons l'icône pour l'image de l'application
    ImageIcon imageApplication = new ImageIcon("/home/mgraciano/NetBeansProjects/images/schoolbus.png");
    // Nous testons le JMenuItem
    JMenuItem logoApplication = new JMenuItem("Powerful Bus App", imageApplication);
    
    JMenu superBus = new JMenu("Super Scholar bus");
    // Constructor
    public Haut() {
        // Nous ajoutons le jmenuItem au JMenuBar
        this.add(logoApplication);
        superBus.setFont(new Font("Comic Sans Ms", Font.BOLD, 20));
        superBus.setForeground(new Color(53, 41, 52));
        add(superBus);
    }
}
