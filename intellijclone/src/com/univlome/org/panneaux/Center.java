/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.panneaux;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author mgraciano
 */
public class Center extends JPanel {
    
    // We create an instance of Panneau2Haut
   Panneau2Haut panneau2Haut = new Panneau2Haut();
    // Constructor
    public Center() {
        this.setLayout(new BorderLayout());
        this.add(panneau2Haut, BorderLayout.NORTH);
    }
}
