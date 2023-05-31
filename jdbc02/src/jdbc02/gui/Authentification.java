/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc02.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mgraciano
 */
public class Authentification extends JFrame {
    
    JPanel panelGauche, panelCentre, panelBas;
    JTextField emailCentreAuth;
    JPasswordField passwordCentreAuth;
    
    // Construcutor
    public Authentification() {
        
        super("Authentification");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // Nous ajoutons le panel de gauche
        panelGauche = gaucheAuth();
        this.add(panelGauche, BorderLayout.WEST);
        
        // Nous ajoutons le centre
        panelCentre = centreAuth();
        this.add(panelCentre, BorderLayout.CENTER);
        
        // Nous ajoutons le bas
        panelBas =  boutonsDuBas();
        this.add(panelBas, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    // Nous créons une méthode qui sera à gauche et qui contiendra l'image
    public JPanel gaucheAuth() {
        JPanel panelAuth = new JPanel();
        panelAuth.setPreferredSize(new Dimension(150, 40));
        // Nous créons l'image qui sera à gauche
        ImageIcon authBus = new ImageIcon("/home/mgraciano/NetBeansProjects/images/busAuth.jpg");
        
        JLabel labelAuth = new JLabel(authBus);
        
        // Nous ajoutons le label au panel
        panelAuth.add(labelAuth);
        return panelAuth;
    }
    
    // Méthode pour le centre
    public JPanel centreAuth() {
        
        JPanel panelCentreAuth = new JPanel();
        panelCentreAuth.setBackground(Color.cyan);
        
        // Pour le email
        JLabel labelEmail = new JLabel("Entrez votre mail");
        labelEmail.setForeground(Color.BLACK);
        
        // Nous ajoutons le label à un panel
        JPanel panelTextEmail = new JPanel();
        panelTextEmail.setBackground(Color.CYAN);
        panelTextEmail.add(labelEmail);
        
        // La zone de saisie de l'email
        emailCentreAuth = new JTextField(20);
        JPanel panelEmail = new JPanel();
        panelEmail.setLayout(new GridLayout(2, 1));
        
        panelEmail.add(panelTextEmail);
        panelEmail.add(emailCentreAuth);
        
        // Pour le password
        
        // La zone de texte du password
        JLabel labelZonePassword = new JLabel("Entrez votre mot de passe");
        labelZonePassword.setForeground(Color.BLACK);
        
        JPanel passwordZone = new JPanel();

        passwordZone.add(labelZonePassword);
        passwordZone.setBackground(Color.CYAN);
        
        passwordCentreAuth = new JPasswordField(20);
        passwordCentreAuth.setPreferredSize(new Dimension(30, 30));
            
        // Nous créons un panel pour la zone de saisie de mot de passe
        JPanel zoneDeSaisiePassword = new JPanel();
        zoneDeSaisiePassword.setBackground(Color.CYAN);
        zoneDeSaisiePassword.add(passwordCentreAuth);
        
        JPanel panelPassword = new JPanel();
        //panelPassword.setBackground(Color.CYAN);
        panelPassword.setLayout(new GridLayout(2, 1));
        
        // Nous ajoutons la zone de saisie et le label au panelPasswor
        panelPassword.add(passwordZone);
        panelPassword.add(zoneDeSaisiePassword);
        
        panelCentreAuth.add(panelEmail);
        panelCentreAuth.add(panelPassword);
        
        return panelCentreAuth;
    }
    
    // Méthode pour les boutons d'en bas
    public JPanel boutonsDuBas() {
        JPanel deuxBoutons = new JPanel();
        deuxBoutons.setLayout(new FlowLayout());
        
        // Nous créons le premier bouton
        JButton seConnecter = new JButton("Se connecter");
        
            // Nous ajoutons une action sur le bouton se connecter
            seConnecter.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    String recupererEmail = emailCentreAuth.getText();
                    char[] recupererPassword = passwordCentreAuth.getPassword();
                    
                    // Nous verifions 
                    if (recupererEmail.equals("gracianomathey@gmail.com")) {
                        if (recupererPassword.equals("1234")) {
                            System.out.println("Connexion reussie");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Email ou mot de passe invalid");
                    }

                }
            });
        
        JButton quitter = new JButton("Quitter");
        
        // Nous ajoutons les deux boutons au panel deuxBoutons
        deuxBoutons.add(quitter, new FlowLayout(FlowLayout.LEFT));
        deuxBoutons.add(seConnecter, new FlowLayout(FlowLayout.RIGHT));
        
        
        return deuxBoutons;
    }
    
    // Pour le prompt
    /*private static void addPromptSupport(JTextField textField, String promptText) {
    textField.setText(promptText);
    textField.setForeground(UIManager.getColor("TextField.inactiveForeground"));
    
    textField.addFocusListener(new FocusListener() {
    @Override
    public void focusGained(FocusEvent e) {
    if (textField.getText().equals(promptText)) {
    textField.setText("");
    textField.setForeground(UIManager.getColor("TextField.foreground"));
    }
    }
    
    @Override
    public void focusLost(FocusEvent e) {
    if (textField.getText().isEmpty()) {
    textField.setText(promptText);
    textField.setForeground(UIManager.getColor("TextField.inactiveForeground"));
    }
    }
    });
    
    PlainDocument document = (PlainDocument) textField.getDocument();
    document.setDocumentFilter(new DocumentFilter() {
    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
    if (!textField.getText().equals(promptText)) {
    super.remove(fb, offset, length);
    }
    }
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
    if (!textField.getText().equals(promptText)) {
    super.replace(fb, offset, length, text, attrs);
    }
    }
    });
    }*/
    
}
