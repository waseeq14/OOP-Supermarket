/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String category;

    public Product(int id, String name, int quantity, double price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public static ArrayList<Product> fetchProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("Select * from PRODUCTTBL");
            
            while (Rs.next()) {
                int pId = Rs.getInt(1);
                String pName = Rs.getString(2);
                int pQty = Rs.getInt(3);
                double pPrice = Rs.getDouble(4);
                String pCat = Rs.getString(5);
                
                products.add(new Product(pId, pName, pQty, pPrice, pCat));
            }
            
            return products;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
     
    public static ArrayList<Product> fetchProductsbyCat(String cat) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("Select * from PRODUCTTBL where PRODCAT='"+cat+"'");
            while (Rs.next()) {
                int pId = Rs.getInt(1);
                String pName = Rs.getString(2);
                int pQty = Rs.getInt(3);
                double pPrice = Rs.getDouble(4);
                String pCat = Rs.getString(5);
                
                products.add(new Product(pId, pName, pQty, pPrice, pCat));
            }
            
            return products;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public static ArrayList<String> fetchCategories() {
        ArrayList<String> categories = new ArrayList<>();
        try {
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("SELECT DISTINCT PRODCAT from PRODUCTTBL");
            while (Rs.next()) {
                categories.add(Rs.getString(1));
            }
            
            return categories;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
    
    public static ArrayList<Product> fetchByName(String name){
        ArrayList<Product> p = new ArrayList<>();
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("SELECT * FROM PRODUCTTBL WHERE PRODNAME='"+name+"'");
            while(Rs.next()){
                int pId = Rs.getInt(1);
                String pName = Rs.getString(2);
                int pQty = Rs.getInt(3);
                double pPrice = Rs.getDouble(4);
                String pCat = Rs.getString(5);
                p.add(new Product(pId, pName, pQty, pPrice, pCat));
            }
            return p;
    }catch(SQLException e){
        e.printStackTrace();
    }
        return p;
}
}
