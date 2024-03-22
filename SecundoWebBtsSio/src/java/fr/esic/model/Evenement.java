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
public class Evenement {
    
    private int idEvenement ;
    private String nomEvenement ;
    private String descriptionEvenement ;
    private int idGroupe ; 

    public Evenement() {
    }

    public Evenement(int idEvenement, String nomEvenement, String descriptionEvenement, int idGroupe) {
        this.idEvenement = idEvenement;
        this.nomEvenement = nomEvenement;
        this.descriptionEvenement = descriptionEvenement;
        this.idGroupe = idGroupe;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getNomEvenement() {
        return nomEvenement;
    }

    public void setNomEvenement(String nomEvenement) {
        this.nomEvenement = nomEvenement;
    }

    public String getDescriptionEvenement() {
        return descriptionEvenement;
    }

    public void setDescriptionEvenement(String descriptionEvenement) {
        this.descriptionEvenement = descriptionEvenement;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }
    
    
    
}
