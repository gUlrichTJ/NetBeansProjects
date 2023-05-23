/*
 *
*/
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import jdbc02.entite.Utilisateur;
import jdbc02.service.UtilisateurService;
import jdbc02.service.UtilisateurServiceImpl;

/**
 * 
 *
 * @author akouv
 */
public class UtilisateurForm extends JFrame {
    
    
    private Utilisateur model;
    
    private UtilisateurService service = new UtilisateurServiceImpl();  // Mauvaise façon de faire
    
    JButton valider = new JButton("Valider");

    
    // Constructor
    public UtilisateurForm() {
        super("Fenetre");
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        // Pour tout ce qui est au centre
        JPanel centre = new JPanel();
        centre.setLayout(new GridLayout(3, 2));
        centre.setBorder(new LineBorder(Color.yellow, 3));
        
        // Ce que nous mettrons au centre
        JLabel id = new JLabel("ID");
        JTextField textFieldId = new JTextField();
        
        JLabel nom = new JLabel("Nom");
        JTextField textFieldNom = new JTextField();
        
        JLabel prenom = new JLabel("Prenom");
        JTextField textFieldPrenom = new JTextField();
        
        // Nous ajoutons tout au centre
        centre.add(id);         centre.add(textFieldId);
        centre.add(nom);        centre.add(textFieldNom);
        centre.add(prenom);     centre.add(textFieldPrenom);
        
        JPanel bas = new JPanel();
        bas.setLayout(new BorderLayout());
        bas.setBorder(new LineBorder(Color.red, 2));
        
        // Nous ajoutons une action sur le bouton valider
        this.valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                service.ajouter(model);
            }
        });
        
        // Nous ajoutons une action sur le textFieldId
        textFieldId.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                model.setNom(nom.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                model.setNom(nom.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        // Nous ajoutons le bouton valider au bas de la fenetre
        bas.add(valider, BorderLayout.EAST);
        
        // Nous ajoutons le centre au frame
        this.add(centre, BorderLayout.CENTER);
    
        // Nous ajoutons le bas au frame
        this.add(bas, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
}
