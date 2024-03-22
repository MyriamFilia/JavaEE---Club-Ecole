/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.Etudiant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author filia
 */
public class EtudiantDao {
    
    public static void insertEtudiant ( Etudiant e )throws SQLException {
        
        String sql = "INSERT INTO etudiant (nom , login , password) VALUES (? , ? , ? )"   ;
        
        //récupération de la connexion à la base de donnée
        Connection connexion = AccessBd.getConnection();
        
        // 
        PreparedStatement prepare = connexion.prepareStatement(sql);
        //
        prepare.setString(1, e.getNom());
        prepare.setString(2, e.getLogin());
        prepare.setString(3, e.getPassword());
        prepare.execute(); // pour envoyer dans la base
        
    }
    
    
    public static Etudiant getByLoginAndPassword (String login , String password)throws SQLException {
        
        Etudiant e = null;
        
        String sql = "SELECT * FROM etudiant WHERE login = ? AND password = ?" ;
        
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql) ;
        prepare.setString(1, login);
        prepare.setString(2, password);
        
        ResultSet rs = prepare.executeQuery();
        
        if (rs.next()) {
            e = new Etudiant();
            e.setIdentifiant(rs.getInt("idetudiant"));
            e.setLogin(rs.getString("login"));
            e.setNom(rs.getString("nom"));
        }
        return e;
    }
    
}
