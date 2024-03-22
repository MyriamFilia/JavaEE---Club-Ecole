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
public class Groupe {
    
    private int idGroupe ;
    private String nomGroupe ;
    private Etudiant createur ;
    
    public Groupe () {
        
    }

    public Groupe(int idGroupe, String nomGroupe, Etudiant createur) {
        this.idGroupe = idGroupe;
        this.nomGroupe = nomGroupe;
        this.createur = createur;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public Etudiant getCreateur() {
        return createur;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public void setCreateur(Etudiant createur) {
        this.createur = createur;
    }
    
    
    
    
    
    
    
    
}
