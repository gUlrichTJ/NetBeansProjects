/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author mgraciano
 */
public class AddUpdateDelete extends JPanel {
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterU = new BoutonImage("Ajouter utilisateur", "/home/mgraciano/NetBeansProjects/images/add1.png");
    BoutonImage modifierU = new BoutonImage("Modifier utilisateur", "/home/mgraciano/NetBeansProjects/images/update1.png");
    BoutonImage supprimerU = new BoutonImage("Supprimer utilisateur", "/home/mgraciano/NetBeansProjects/images/delete1.png");
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterI = new BoutonImage("Ajouter itinéraire", "/home/mgraciano/NetBeansProjects/images/add1.png");
    BoutonImage modifierI = new BoutonImage("Modifier itinéraire", "/home/mgraciano/NetBeansProjects/images/update1.png");
    BoutonImage supprimerI = new BoutonImage("Supprimer itinéraire", "/home/mgraciano/NetBeansProjects/images/delete1.png");
    
    // Nous créons les boutons ajouter, supprimer et modifier
    BoutonImage ajouterC = new BoutonImage("Ajouter caisse", "/home/mgraciano/NetBeansProjects/images/add1.png");
    BoutonImage modifierC = new BoutonImage("Modifier caisse", "/home/mgraciano/NetBeansProjects/images/update1.png");
    BoutonImage supprimerC = new BoutonImage("Supprimer caisse", "/home/mgraciano/NetBeansProjects/images/delete1.png");
    
    // Constructor pour l'utilisateur
    public AddUpdateDelete() {
        setLayout(new FlowLayout());
        
        add(ajouterU);
        add(modifierU);
        add(supprimerU);
    }
    
    // Constructeur pour l'itinéraire
    public AddUpdateDelete(int itineraire) {
        setLayout(new FlowLayout());
        
        add(ajouterI);
        add(modifierI);
        add(supprimerI);
    }
    
    // Constructeur pour la caisse
    public AddUpdateDelete(int caisse, int addUpdateDel) {
        setLayout(new FlowLayout());
        
        add(ajouterC);
        add(modifierC);
        add(supprimerC);
    }
}
