/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Customer extends Person {
    private int id;
    private String memberStatus;
    private Date validTill;

    public Customer(int id, String memberStatus, Date validTill, String name, String gender, String phoneNumber, String address) {
        super(name, gender, phoneNumber, address);
        this.id = id;
        this.memberStatus = memberStatus;
        this.validTill = validTill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }
    
    public static ArrayList<Customer> fetchCustomer() {
        ArrayList<Customer> cus = new ArrayList<>();
        try {
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("Select* From CUSTOMERSTBL");
            while (Rs.next()) {
                int id = Rs.getInt(1);
                String name = Rs.getString(2);
                String gender = Rs.getString(3);
                String number = Rs.getString(4);
                String address = Rs.getString(5);
                Date validTill = Rs.getDate(6);
                String status = Rs.getString(7);
                cus.add(new Customer(id, status, validTill, name, gender, number, address));
            }
            return cus;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cus;
    }
    public static ArrayList<Customer> fetchByName(String name){
        ArrayList<Customer> cus = new ArrayList<>();
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("SELECT* FROM CUSTOMERSTBL WHERE CUSNAME = '"+name+"'");
            while(Rs.next()){
                int id = Rs.getInt(1);
                String namee = Rs.getString(2);
                String gender = Rs.getString(3);
                String number = Rs.getString(4);
                String address = Rs.getString(5);
                Date validTill = Rs.getDate(6);
                String status = Rs.getString(7);
                cus.add(new Customer(id, status, validTill, namee, gender, number, address));
            }
            return cus;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return cus;
    }
    
    public static boolean datePassed(Date date1){
       Date Todaydate = Date.valueOf(LocalDate.now());
        return Todaydate.compareTo(date1)>0;
    }
    public static boolean idExists(int id){
        ArrayList<Customer> cus = fetchCustomer();
        for(Customer c:cus){
            if(c.getId()==id)
                return true;
        }
        return false;
    }
}
