/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Gauche extends JPanel {

    JPanel panel = new JPanel();
    BoutonImage accueil = new BoutonImage("Accueil", "/home/mgraciano/NetBeansProjects/images/home1.png");
    BoutonImage utilisateur = new BoutonImage("Utilisateurs", "/home/mgraciano/NetBeansProjects/images/users2.png");
    BoutonImage caisse = new BoutonImage("Caisse", "/home/mgraciano/NetBeansProjects/images/caisse2.png");
    BoutonImage itineraire = new BoutonImage("Itineraire", "/home/mgraciano/NetBeansProjects/images/itineraire1.png");
    
    // Constructor
    public Gauche() {
        
        // Nous allons utiliser un boxlayout pour mettre les éléments
        // les uns en dessous des autres et un glue pour laisser de 
        // l'espace vide en bas
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        add(accueil);
        // Nous ajoutons le bouton utilisateur
        add(utilisateur);
        
        // Nous ajoutons le bouton de la caisse
        add(caisse);
        
        // Nous ajoutons le bouton de itineraire
        add(itineraire);
        
        //this.add(panel, BorderLayout.WEST);
        
        // Nous créons de l'espace vide en bas
        add(Box.createVerticalGlue());
    }
}
