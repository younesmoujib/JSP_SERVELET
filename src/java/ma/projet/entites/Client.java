/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entites;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author hp
 */
@Entity
public class Client extends User {
    private String nom;
    private String prenom;
    private Date datenaissance ;

    public Client(String nom, String prenom, Date datenaissance, String email, String password) {
        super(email, password);
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
    }

    public Client() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", datenaissance=" + datenaissance + '}';
    }

  
    
    
    
    
    
    
}
