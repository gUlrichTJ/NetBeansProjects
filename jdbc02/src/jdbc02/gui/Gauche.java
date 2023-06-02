/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Gauche extends JPanel {

    JPanel panel = new JPanel();
    BoutonImage accueil = new BoutonImage("Accueil", "/home/mgraciano/NetBeansProjects/images/home1.png");
    BoutonImage utilisateur = new BoutonImage("Utilisateurs", "/home/mgraciano/NetBeansProjects/images/users2.png");
    BoutonImage caisse = new BoutonImage("Caisse", "/home/mgraciano/NetBeansProjects/images/caisse2.png");
    BoutonImage itineraire = new BoutonImage("Itineraire", "/home/mgraciano/NetBeansProjects/images/itineraire1.png");
    BoutonImage parametres = new BoutonImage("Paramètres", "/home/mgraciano/NetBeansProjects/images/settings.png");
    BoutonImage aide = new BoutonImage("Aide", "/home/mgraciano/NetBeansProjects/images/help.png");
    BoutonImage quitter = new BoutonImage("Quitter", "/home/mgraciano/NetBeansProjects/images/exit.png");
    
    // Nous déclarons Principal pour pouvoir fermer la fenetre
    Principal principal;
    
    // Le panel du centre
    JPanel centre = new JPanel();
    
    // Constructor
    public Gauche(Principal principal) {
        
        this.principal = principal;
        // Nous allons utiliser un boxlayout pour mettre les éléments
        // les uns en dessous des autres et un glue pour laisser de 
        // l'espace vide en bas
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        centre.setLayout(new BorderLayout());
        
        add(accueil);
        // Nous ajoutons le bouton utilisateur
        
        // Nous ajoutons une action sur le bouton utilisateur
            utilisateur.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    // Nous enlevons tout ce qu'il y avait au centre
                    centre.removeAll();
                    
                    Utilisateurs utilisateurs = new Utilisateurs();
                    
                    // Nous ajoutons utilisateur au centre
                    centre.add(utilisateurs, BorderLayout.CENTER);
                    principal.getContentPane().add(centre, BorderLayout.CENTER);
                    
                    principal.revalidate();
                }
            });
        
        add(utilisateur);
        
        // Nous ajoutons une action sur le bouton caisse
            caisse.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    // Nous enlevons tout ce qu'il y avait au centre
                    centre.removeAll();
                    
                    Caisse caisseA = new Caisse();
                    
                    // Nous ajoutons utilisateur au centre
                    centre.add(caisseA, BorderLayout.CENTER);
                    principal.getContentPane().add(centre, BorderLayout.CENTER);
                    
                    principal.revalidate();
                }
            });
        
        // Nous ajoutons le bouton de la caisse
        add(caisse);
        
        // Nous ajoutons une action sur le bouton itinéraire
            itineraire.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    // Nous enlevons tout ce qu'il y avait au centre
                    centre.removeAll();
                    
                    Itineraire itineraireI = new Itineraire();
                    
                    // Nous ajoutons utilisateur au centre
                    centre.add(itineraireI, BorderLayout.CENTER);
                    principal.getContentPane().add(centre, BorderLayout.CENTER);
                    
                    principal.revalidate();
                }
            });
        
        // Nous ajoutons le bouton de itineraire
        add(itineraire);
        
        // Nous ajoutons paramètre
        add(parametres);
        
        // Nous ajoutons le bouton aide
        add(aide);
        
        // Nous mettons une action sur le bouton quitter
            quitter.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    principal.dispose();
                }
            });
        
        // Nous ajoutons le bouton quitter
        add(quitter);
        
        // Nous créons de l'espace vide en bas
        add(Box.createVerticalGlue());
    }
}
