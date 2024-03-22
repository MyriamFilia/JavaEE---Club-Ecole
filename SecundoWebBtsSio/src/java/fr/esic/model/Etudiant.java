/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.model;

/**
 *
 * @author filia
 */
public class Etudiant {
    
    private int identifiant;
    private String nom;
    private String login;
    private String password;
    
    public Etudiant(){
    }
 
    public Etudiant(int identifiant, String nom, String login, String password) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.login = login;
        this.password = password;
    }
 
    public int getIdentifiant() {
        return identifiant;
    }
 
    public String getNom() {
        return nom;
    }
 
    public String getLogin() {
        return login;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public void setLogin(String login) {
        this.login = login;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
