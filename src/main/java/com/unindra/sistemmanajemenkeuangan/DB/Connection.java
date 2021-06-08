/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unindra.sistemmanajemenkeuangan.DB;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author amanda
 */
public class Connection {
    
    private static java.sql.Connection mysqlconfig;
    
    public static java.sql.Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_digital_impact";  
            String user = "amanda"; 
            String pass = "@0Secret."; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Connection Failed "+e.getMessage());  
        }
        
        return mysqlconfig;
    }    
}
