/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entites.Client;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ma.projet.util.utills;
import static ma.projet.util.utills.MD5;

/**
 *
 * @author hp
 */
public class ClientService implements IDao<Client> {

   
    @Override
    public boolean create(Client o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
             o.setPassword(MD5(o.getPassword()));
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delete(Client o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
           
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(Client o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Client> findAll(Client o) {
        List<Client> clients = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            clients = session.createQuery("from Client").list();
            tx.commit();
            return clients;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return clients;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Client findById(int id) {
        Client client = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            client = (Client) session.get(Client.class, id);
            tx.commit();
            return client;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return client;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
     public Client findByEmail(String email) {
        Client client = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
          client = (Client)session.createQuery("from Client c where c.email= :email").setParameter("email", email).uniqueResult();
            tx.commit();
            return client;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return client;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        
    }
    
}
