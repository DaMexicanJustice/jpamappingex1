/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Address;
import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author xboxm
 */
public class Tester {
    public static void main(String[] args) {
        test();
    }
    
    public static void test() {
       EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PU", null);
       
       Customer c = new Customer();
       
       c.setFIRSTNAME("Michael");
       c.setLASTNAME("Veilis");
       
       Address a1 = new Address();
       Address a2 = new Address();
       
       a1.setCity("København");
       a1.setStreet("Stræde 111");
       a2.setCity("Ærø");
       a2.setStreet("Kiks 7");
       
       c.addAddress(a1);
       c.addAddress(a2);
       
       
       EntityManager em = emfactory.createEntityManager();
       em.getTransaction().begin();
      
       em.persist(a1);
       em.persist(a2);
       em.persist(c);
       
       em.getTransaction().commit();
       em.close();
       emfactory.close();
       
    }
}
