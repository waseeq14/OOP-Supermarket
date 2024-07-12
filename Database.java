/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.client.am.SqlException;


public class Database {
    private static String databaseUrl = "jdbc:derby:C:/Users/HP/OneDrive/Desktop/OOP project/Derby/super";
    
    private static Database instance;
    
    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }
    
    private Connection connection; 
    
    private Database() {
        try {
            connection = DriverManager.getConnection(databaseUrl);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection() {
        return connection;
    }      
}
