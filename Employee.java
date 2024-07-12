/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Employee extends Person {
    private int id;
    private String salary;
    private String pass;
    
    public Employee(String name, String gender, String phoneNumber, String address, int id, String salary, String pass){
        super(name, gender, phoneNumber, address);
        this.id = id;
        this.salary = salary;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nSalary: " +salary;
    }
    
    public static boolean login(String name, String password) {
        String Query = "select * from SELLERTBL where SELLERNAME= '" + name +"'and SELLPASS='"+password+"'";
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery(Query);
            return Rs.next();            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public static boolean loginAdmin(String name, String password){
        String Query = "select * from ADMINTBL where ADMINNAME='"+name+"'and ADMINPASS='"+password+"'";
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery(Query);
            return Rs.next();            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static ArrayList<Employee> fetchEmployee(){
        ArrayList<Employee> employee = new ArrayList<>();
        try{
            Connection Con = Database.getInstance().getConnection();
            Statement St = Con.createStatement();
            ResultSet Rs = St.executeQuery("Select* From SELLERTBL");
            
            while(Rs.next()){
                int id = Rs.getInt(1);
                String name = Rs.getString(2);
                String pass = Rs.getString(3);
                String gender = Rs.getString(4);
                String  salary = Rs.getString(5);
                String number = Rs.getString(6);
                String address = Rs.getString(7);
                employee.add(new Employee(name,gender,number,address,id,salary,pass));
            }
            return employee;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return employee;
    }
    
    
}
