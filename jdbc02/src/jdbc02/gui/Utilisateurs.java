/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author mgraciano
 */
public class Utilisateurs extends JPanel {
    
    AddUpdateDelete addUpdateDelete = new AddUpdateDelete();
    // Constructor
    public Utilisateurs() {
        
        setLayout(new BorderLayout());
        // Nous définissons l'entete
        String[] enteteDuTableau = {"ID", "Noms", "Prenoms", "Adresse",
            "Profession", "Âge", "Sexe"};
        // Nous définissons les données du tableau
        Object[][] donnees = {
            {"1", "MATHEY-APOSSAN", "Ulrich G", "grm@gmail.com", "Développeur", "20", "M"},
            {"2", "MATHEY-APOSSAN", "Urielle G", "grum@gmail.com", "Avocate", "22", "F"},
            {"3", "Moko", "Eunice G", "Adétikopé", "Juriste", "18", "F"},
            {"4", "GOMADO", "Akouto Yayra", "El-Shaddaï", "Enseignante", "21", "F"},
            {"5", "MOUSSA", "Abibou", "abmo01@gmail.com", "Biochimiste", "21", "M"},
            {"6", "PEKETI", "K. Rébecca", "Gblenkomé", "Économiste", "21", "F"},
            {"7", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"8", "SOKEL", "Roland", "Zanguéra", "Développeur", "19", "M"},
            {"9", "AKPABLA", "K. Gildas", "Gblenkomé", "Chauffeur", "44", "M"},
            {"10", "AYOKI", "E. Ella", "Doumassesse", "Infirmière", "17", "F"},
            {"11", "KOUMA", "Kokou. Felix", "Adétikopé", "Mécanicien", "24", "M"},
            {"12", "DÉKADJÈVI", "Solange", "USA", "Boxeuse", "30", "F"},
            {"13", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"14", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
            {"15", "HOUNGO", "K. Felix", "Gbossimé", "Chauffeur", "34", "M"},
        };
        
        // Nous créons un JTable dans lequel nous mettons les données
        JTable tabUtilisateurs = new JTable(donnees, enteteDuTableau);
        
        // Nous mettons le tableau dans un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabUtilisateurs);
        JPanel tabPanel = new JPanel();
        tabPanel.setLayout(new BorderLayout());
        tabPanel.setBorder(new LineBorder(Color.blue, 1));
        tabPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Nous ajoutons les boutons ajouter, modifier et supprimer
        tabPanel.add(addUpdateDelete, BorderLayout.SOUTH);
        
        add(tabPanel);
    }
}
