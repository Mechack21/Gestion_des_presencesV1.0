/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connexions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MECHACK
 */
public class ConnexionC {
  private Connection meconnecter;
    private Statement Dbd;
    public ResultSet reponse;
    String chemin = "jdbc:sqlserver://PEDRO\\MUTOKASERVER:1433;databaseName=GestionPresences";
    String utilisateur = "sa";
    String motDePasse = "123456";  
    
    public ConnexionC() {
        try {
            meconnecter = DriverManager.getConnection(chemin, utilisateur, motDePasse);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void mise_a_jour(String requete) {
        try {
            Dbd = meconnecter.createStatement();
            int test = Dbd.executeUpdate(requete);
            if (test == 1) {
                System.out.println("Operation reussie");
            } else if (test == 0) {
                System.out.println("Echec operation");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Selection(String requete1) {
        try {
            Dbd = meconnecter.createStatement();
            reponse = Dbd.executeQuery(requete1);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
