/*
 *
 */
package jdbc02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc02.entite.Utilisateur;
import jdbc02.util.SingletonConnexion;

/**
 *
 * @author akouv
 */
public class UtilisateurDaoImpl implements UtilisateurDao {

    Connection connexion = null;
    Statement statement = null;
    PreparedStatement preparedStatement;
    String sql;
    
    @Override
    public void ajouter(Utilisateur utilisateur) {
        try {
            connexion = SingletonConnexion.getInstance();
            sql = "insert into utilisateurs(id, identifiant, mot_de_passe, nombre_connexion) "
                    + "values(5, 'hello', 'hello', 5);";
            preparedStatement = connexion.prepareStatement(sql);
            
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, utilisateur.getIdentifiant());
            preparedStatement.setString(3, utilisateur.getMotDePasse());
            
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Utilisateur modifier(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public Utilisateur trouver(int id) {
        return null;
    }

    @Override
    public Utilisateur trouver(String identifiant) {
        return null;
    }

    @Override
    public List<Utilisateur> lister() {
        return null;
    }

    @Override
    public void supprimer(int id) {

    }

    @Override
    public void supprimer(Utilisateur utilisateur) {

    }
    
}
