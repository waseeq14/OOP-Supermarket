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

/**
 *
 * @author HP
 */
public class Category {
    private int catId;
    private String desc;
    private String name;

    public Category(int catId, String desc, String name) {
        this.catId = catId;
        this.desc = desc;
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Category> fetchCat(){
        ArrayList<Category> cat = new ArrayList<>();
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
           ResultSet Rs = St.executeQuery("Select * from CATEGORYTBL");
           while(Rs.next()){
               int cId = Rs.getInt(1);
               String name = Rs.getString(2);
               String desc = Rs.getString(3);
               cat.add(new Category(cId,desc,name));
           }
           return cat;
    }catch(SQLException e){
       e.printStackTrace();
    }
    return cat;
}
}
