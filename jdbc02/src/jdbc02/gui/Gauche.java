/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Gauche extends JPanel {

    JPanel panel = new JPanel();
    BoutonImage accueil = new BoutonImage("Accueil", "/home/mgraciano/NetBeansProjects/images/home1.png");
    
    // Constructor
    public Gauche() {
        this.add(accueil, BorderLayout.WEST);
    }
}
