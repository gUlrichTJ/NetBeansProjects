/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import javax.swing.ImageIcon;
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
    JMenuItem logoApplication = new JMenuItem("Icon d'application", imageApplication);
    
    // Constructor
    public Haut() {
        // Nous ajoutons le jmenuItem au JMenuBar
        this.add(logoApplication);
    }
}
