/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.Persistence;

/**
 *
 * @author xboxm
 */
public class SchemaBuilder {
    public static void main(String[] args) {
        Persistence.generateSchema("com.mycompany_JPAEntityMappings1_jar_1.0-SNAPSHOTPU", null);
    }
}
