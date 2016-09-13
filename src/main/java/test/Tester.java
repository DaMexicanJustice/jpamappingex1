/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author xboxm
 */
public class Tester {
    public static void main(String[] args) {
        
    }
    
    public static void test() {
       EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.mycompany_JPAEntityMappings1_jar_1.0-SNAPSHOTPU");
       
    }
}
