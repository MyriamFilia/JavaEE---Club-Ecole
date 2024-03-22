/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Etudiant;
import fr.esic.model.Groupe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author filia
 */
public class GroupeDao {
    //avoir tout les groupes de la personne connectée : les groupes créés ???
    
     public static List<Groupe> groupeCree ( Etudiant e )throws SQLException {
        List<Groupe> list = new ArrayList();
        String sql = "SELECT * FROM groupe WHERE id_admin_groupe = ? "   ;
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);

        prepare.setInt(1, e.getIdentifiant());
        ResultSet rs = prepare.executeQuery();
        
        while (rs.next()) {
             Groupe g = new Groupe() ;
             list.add(g);
        }
        
        return list ;
        
    }
    //tous les groupe où il est membre ???
     public static List<Groupe> groupeOuMembre( Etudiant e )throws SQLException {
        
        List<Groupe> list = new ArrayList();
        String sql = "SELECT g.* , e.nom as createur FROM groupe g INNER JOIN etudiant e ON g.idCreateur = e.idetudiant WHERE idgroupe IN (SELECT g.idgroupe FROM groupe g WHERE g.idCreateur = ? UNION SELECT m.idgroupe FROM membre m WHERE m.idetudiant = ?)"  ;
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);

        prepare.setInt(1, e.getIdentifiant());
        prepare.setInt(2, e.getIdentifiant());
        ResultSet rs = prepare.executeQuery();
        
        while (rs.next()) {
             Groupe g = new Groupe() ;
             g.setIdGroupe(rs.getInt("idgroupe"));
             g.setNomGroupe(rs.getString("nomGroupe"));
             Etudiant c = new Etudiant ();
             c.setNom(rs.getString("createur"));
             g.setCreateur(c);
             list.add(g);
        }
         
        return list ;
    }
     
     
     //creer un groupe 
    
     public static void createGroup ( Groupe g )throws SQLException {
         
        String sql = "INSERT INTO groupe (nomGroupe , idCreateur) VALUES (? , ? )"   ;
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, g.getNomGroupe());
        prepare.setInt(2, g.getCreateur().getIdentifiant());

        prepare.execute(); // pour envoyer dans la base
        
    }
     
     
     
     //supprimer un groupe ou il est createur 
     
     public static void deleteGroupe (Groupe g)throws SQLException {
         
         String sql = "DELETE FROM groupe WHERE idCreateur = ? AND idgroupe = ?" ;
         Connection connexion = AccessBd.getConnection();
         PreparedStatement prepare = connexion.prepareStatement(sql);
         prepare.setInt(1, g.getCreateur().getIdentifiant());
         prepare.setInt(2, g.getIdGroupe());
         
         prepare.execute();
     }
     
     public static Groupe chercheGroupe (int id)throws SQLException {
         
         Groupe g = null;
         
         String sql = "SELECT * FROM groupe WHERE id = ?" ;
         Connection connexion = AccessBd.getConnection();
         PreparedStatement prepare = connexion.prepareStatement(sql);
         prepare.setInt(1, id);

         ResultSet rs = prepare.executeQuery();
        
            
            g = new Groupe();
            g.setIdGroupe(rs.getInt("idgroupe"));
            g.setNomGroupe(rs.getString("nomgroupe"));
            
        
        return g;
     }
     

}
