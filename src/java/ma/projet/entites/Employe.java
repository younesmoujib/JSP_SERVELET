/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entites;

import javax.persistence.Entity;

/**
 *
 * @author hp
 */

@Entity
public class Employe extends User {

    public Employe(String email, String password) {
        super(email, password);
    }
    
    
}
