/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Paramètres extends JFrame {
    
    // Constructor
    public Paramètres() {
        super("Pramètres");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menuBarGauche = gauche();
        setJMenuBar(menuBarGauche);
        
        add(menuBarGauche, BorderLayout.WEST);
        
        setVisible(true);
    }
    
    // Le JMenuBar gauche de paramètre
    public JMenuBar gauche() {
            JMenuBar menuBar = new JMenuBar();
            
            JMenu apparenceEtComportement = new JMenu("Apparence et Comportement");
                JMenuItem apparence = new JMenuItem("Apparence");
                JMenuItem newUi = new JMenuItem("New UI");
                JMenuItem menuEtToolbars = new JMenuItem("Menu et Toolbars");
                JMenuItem systemSettings = new JMenuItem("Paramètres systeme");
                JMenuItem couleurs = new JMenuItem("Couleurs");
                    // Nous ajoutons
                    apparenceEtComportement.add(apparence);
                    apparenceEtComportement.add(newUi);
                    apparenceEtComportement.add(menuEtToolbars);
                    apparenceEtComportement.add(systemSettings);
                    apparenceEtComportement.add(couleurs);
                    
             menuBar.add(apparenceEtComportement);
        
        return menuBar;
    }
}
