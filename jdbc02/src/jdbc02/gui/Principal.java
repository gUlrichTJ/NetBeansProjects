/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Principal extends JFrame {
    
    // Nous déclarons le haut
    Haut haut;
    // Nous déclarons gauche
    Gauche gauche;
    // Constructor
    public Principal() {
        
        super("Fenetre Principale");
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // Nous instancions haut et nous l'ajoutons au panel princiapal
        haut = new Haut();
        this.add(haut, BorderLayout.NORTH);
        
        gauche = new Gauche();
        this.add(gauche, BorderLayout.WEST);
        
        // Visibility
        this.setVisible(true);
    }
}
