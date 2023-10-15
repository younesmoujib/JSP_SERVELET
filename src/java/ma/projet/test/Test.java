/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entites.Client;
import ma.projet.entites.Employe;
import ma.projet.services.ClientService;
import ma.projet.services.EmployeService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        EmployeService pe=new EmployeService();
        ClientService cs=new ClientService();
        Client c =cs.findByEmail("younes@gmail.com");
        System.out.println(c);
        
        
    }
}
