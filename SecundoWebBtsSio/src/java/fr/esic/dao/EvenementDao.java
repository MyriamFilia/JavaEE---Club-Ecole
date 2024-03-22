/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Etudiant;
import fr.esic.model.Evenement;
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
public class EvenementDao {
    
     //creer un evenement
    
     public static void createEvenement ( Evenement e )throws SQLException {
         
        String sql = "INSERT INTO evenement (nomEvenement , descriptionEvenement , idgroupe) VALUES (? , ? , ? )"   ;
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, e.getNomEvenement());
        prepare.setString(2, e.getDescriptionEvenement());
        prepare.setInt(3, e.getIdGroupe());

        prepare.execute(); // pour envoyer dans la base
        
    }
    
     
      //tous les evenement d'un Groupe
     
     public static List<Evenement> evenements ( Groupe g )throws SQLException {
        
        List<Evenement> list = new ArrayList();
        String sql = "SELECT * FROM evenement WHERE idgroupe = ?"  ;
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);

        prepare.setInt(1, g.getIdGroupe());

        ResultSet rs = prepare.executeQuery();
        
        while (rs.next()) {
             Evenement e = new Evenement();
             e.setIdEvenement(rs.getInt("idEvenement"));
             e.setNomEvenement(rs.getString("nomEvenement"));
             e.setDescriptionEvenement(rs.getString("descriptionEvenement"));
             e.setIdGroupe(rs.getInt("idgroupe"));
             
             list.add(e);

        }
         
        return list ;
    }
}
