/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;
import java.awt.HeadlessException;
import net.proteanit.sql.DbUtils;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm extends javax.swing.JFrame {
    private ArrayList<Employee> employees;
    public EmployeeForm() {
        initComponents();
        employees = Employee.fetchEmployee();
        SelectSeller();
    }
    
    public void SelectSeller(){
        String[] columnNames = {"ID", "Name", "Password", "Gender", "Salary", "Nummber", "Address"};
        String[][] data = new String[employees.size()][];
        for(int i=0; i<employees.size();i++){
         Employee e = employees.get(i);
         data[i] = new String[]{String.valueOf(e.getId()),e.getName(),e.getPass(),e.getGender(),e.getSalary(),e.getPhoneNumber(),e.getAddress()};
        }
        SellerTable.setModel(new DefaultTableModel(data,columnNames));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sellName_field = new javax.swing.JTextField();
        manageEmployees = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sellId_field = new javax.swing.JTextField();
        sellPass_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox<>();
        add_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        employeeList = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sellSalary_field = new javax.swing.JTextField();
        sellPhone_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sellAddress_field = new javax.swing.JTextField();
        refresh_btn = new javax.swing.JButton();
        close_label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        products_label = new javax.swing.JLabel();
        admin_label = new javax.swing.JLabel();
        cat_label = new javax.swing.JLabel();
        memberships_label = new javax.swing.JLabel();
        logout_label = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 125, 42));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(249, 125, 42));
        jLabel3.setText("EMPLOYEE ID");

        sellName_field.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellName_field.setForeground(new java.awt.Color(249, 125, 42));
        sellName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellName_fieldActionPerformed(evt);
            }
        });

        manageEmployees.setBackground(new java.awt.Color(255, 255, 255));
        manageEmployees.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        manageEmployees.setForeground(new java.awt.Color(249, 125, 42));
        manageEmployees.setText("MANAGE EMPLOYEES");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(249, 125, 42));
        jLabel5.setText("NAME");

        sellId_field.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellId_field.setForeground(new java.awt.Color(249, 125, 42));
        sellId_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellId_fieldActionPerformed(evt);
            }
        });

        sellPass_field.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellPass_field.setForeground(new java.awt.Color(249, 125, 42));
        sellPass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellPass_fieldActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(249, 125, 42));
        jLabel7.setText("PASSWORD");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(249, 125, 42));
        jLabel8.setText("GENDER");

        GenderCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(249, 125, 42));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(249, 125, 42));
        add_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");
        add_btn.setBorderPainted(false);
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
        });
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(249, 125, 42));
        edit_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Edit");
        edit_btn.setBorderPainted(false);
        edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btnMouseClicked(evt);
            }
        });
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        delete_btn.setBackground(new java.awt.Color(249, 125, 42));
        delete_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setBorderPainted(false);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(249, 125, 42));
        clear_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.setBorderPainted(false);
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
        });
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        SellerTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        SellerTable.setRowHeight(25);
        SellerTable.setSelectionBackground(new java.awt.Color(249, 125, 42));
        SellerTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        employeeList.setBackground(new java.awt.Color(255, 255, 255));
        employeeList.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        employeeList.setForeground(new java.awt.Color(249, 125, 42));
        employeeList.setText("EMPLOYEES LIST");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(249, 125, 42));
        jLabel10.setText("SALARY");

        sellSalary_field.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellSalary_field.setForeground(new java.awt.Color(249, 125, 42));
        sellSalary_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellSalary_fieldActionPerformed(evt);
            }
        });

        sellPhone_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellPhone_fieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 125, 42));
        jLabel1.setText("PHONE#");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 125, 42));
        jLabel2.setText("ADDRESS");

        refresh_btn.setBackground(new java.awt.Color(249, 125, 42));
        refresh_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        refresh_btn.setForeground(new java.awt.Color(255, 255, 255));
        refresh_btn.setText("Refresh");
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(employeeList)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(delete_btn)
                        .addGap(43, 43, 43)
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refresh_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sellPhone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellName_field)
                                    .addComponent(sellId_field))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sellSalary_field, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(GenderCb, 0, 169, Short.MAX_VALUE)
                                .addComponent(sellPass_field, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                            .addComponent(sellAddress_field, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(280, Short.MAX_VALUE)
                    .addComponent(manageEmployees)
                    .addGap(255, 255, 255)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellId_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(sellName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellPhone_field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refresh_btn)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellPass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellSalary_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellAddress_field, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeeList)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(manageEmployees)
                    .addContainerGap(508, Short.MAX_VALUE)))
        );

        close_label.setBackground(new java.awt.Color(255, 255, 255));
        close_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        close_label.setForeground(new java.awt.Color(255, 255, 255));
        close_label.setText("X");
        close_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(close_label)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(close_label)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(249, 125, 42));

        products_label.setBackground(new java.awt.Color(255, 255, 255));
        products_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        products_label.setForeground(new java.awt.Color(255, 255, 255));
        products_label.setText("PRODUCTS");
        products_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                products_labelMouseClicked(evt);
            }
        });

        admin_label.setBackground(new java.awt.Color(255, 255, 255));
        admin_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        admin_label.setForeground(new java.awt.Color(255, 255, 255));
        admin_label.setText("ADMIN");
        admin_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_labelMouseClicked(evt);
            }
        });

        cat_label.setBackground(new java.awt.Color(255, 255, 255));
        cat_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cat_label.setForeground(new java.awt.Color(255, 255, 255));
        cat_label.setText("CATEGORIES");
        cat_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat_labelMouseClicked(evt);
            }
        });

        memberships_label.setBackground(new java.awt.Color(255, 255, 255));
        memberships_label.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        memberships_label.setForeground(new java.awt.Color(255, 255, 255));
        memberships_label.setText("MEMBERSHIPS");
        memberships_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberships_labelMouseClicked(evt);
            }
        });

        logout_label.setBackground(new java.awt.Color(255, 255, 255));
        logout_label.setFont(new java.awt.Font("Century Gothic", 2, 20)); // NOI18N
        logout_label.setForeground(new java.awt.Color(255, 255, 255));
        logout_label.setText("LOGOUT");
        logout_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberships_label)
                    .addComponent(cat_label)
                    .addComponent(products_label)
                    .addComponent(admin_label)
                    .addComponent(logout_label))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(memberships_label)
                .addGap(27, 27, 27)
                .addComponent(cat_label)
                .addGap(26, 26, 26)
                .addComponent(products_label)
                .addGap(26, 26, 26)
                .addComponent(admin_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout_label)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellName_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellName_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellName_fieldActionPerformed

    private void sellId_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellId_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellId_fieldActionPerformed

    private void sellPass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellPass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellPass_fieldActionPerformed

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_btnActionPerformed

    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        if (sellId_field.getText().isEmpty() || sellName_field.getText().isEmpty() || sellPass_field.getText().isEmpty() || sellAddress_field.getText().isEmpty() || sellPhone_field.getText().isEmpty() || sellSalary_field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        } else {
            try {
                Connection Con = Database.getInstance().getConnection();
                Statement St = Con.createStatement();
                String query = "INSERT INTO SELLERTBL " + "VALUES(" + Integer.valueOf(sellId_field.getText()) + ", '" + sellName_field.getText() + "', '"
                        + sellPass_field.getText() + "', '" + GenderCb.getSelectedItem().toString() + "', '" + sellSalary_field.getText() + "', '" + sellPhone_field.getText()
                        + "', '" + sellAddress_field.getText() + "')";
                St.executeUpdate(query);
                employees = Employee.fetchEmployee();
                SelectSeller();
            } catch (HeadlessException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_add_btnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)SellerTable.getModel();
        int Myindex = SellerTable.getSelectedRow();
        sellId_field.setText(model.getValueAt(Myindex, 0).toString());
        sellName_field.setText(model.getValueAt(Myindex, 1).toString());
        sellPass_field.setText(model.getValueAt(Myindex, 2).toString());
        GenderCb.setSelectedItem(model.getValueAt(Myindex, 3));
        sellSalary_field.setText(model.getValueAt(Myindex, 4).toString());
        sellPhone_field.setText(model.getValueAt(Myindex, 5).toString());
        sellAddress_field.setText(model.getValueAt(Myindex, 6).toString());
    }//GEN-LAST:event_SellerTableMouseClicked

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        sellId_field.setText("");
        sellName_field.setText("");
        sellPass_field.setText("");
        sellSalary_field.setText("");
        sellPhone_field.setText("");
        sellAddress_field.setText("");
    }//GEN-LAST:event_clear_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        if(sellId_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Enter The Employee To Be Deleted");
        else{
            try{
               Connection Con = Database.getInstance().getConnection();
               String SID = sellId_field.getText();
               String Query = "Delete from SELLERTBL where SELLERID="+SID;
               Statement st = Con.createStatement();
               st.executeUpdate(Query);
               employees = Employee.fetchEmployee();
               SelectSeller();
               JOptionPane.showMessageDialog(this, "Employee Deleted Successfully!");
            }catch (HeadlessException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }            
    }//GEN-LAST:event_delete_btnMouseClicked

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        if(sellId_field.getText().isEmpty() || sellName_field.getText().isEmpty() || sellPass_field.getText().isEmpty() || sellAddress_field.getText().isEmpty() || sellPhone_field.getText().isEmpty() || sellSalary_field.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Missing Information!");
        else{
            try{
               Connection Con = Database.getInstance().getConnection();
               String Query ="Update SELLERTBL set SELLERNAME='" + sellName_field.getText()+"'"+",SELLPASS='"+sellPass_field.getText()+"'"+",SELLGENDER='"+GenderCb.getSelectedItem().toString()+"'"+",SELLERSALARY='"+sellSalary_field.getText()+"'"+
                       ",SELLERNUMBER='"+sellPhone_field.getText()+"'"+",SELLERADDRESS='"+sellAddress_field.getText()+"'"+"where SELLERID="+sellId_field.getText();
               Statement st = Con.createStatement();
               st.executeUpdate(Query);
               employees = Employee.fetchEmployee();
               SelectSeller();
               JOptionPane.showMessageDialog(this, "Employee Updated!");
        }   catch (HeadlessException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Wrong Input");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }     
    }//GEN-LAST:event_edit_btnMouseClicked

    private void close_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_labelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_labelMouseClicked

    private void sellSalary_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellSalary_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellSalary_fieldActionPerformed

    private void sellPhone_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellPhone_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellPhone_fieldActionPerformed

    private void admin_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_labelMouseClicked
        new UpdateAdminForm().setVisible(true);
    }//GEN-LAST:event_admin_labelMouseClicked

    private void products_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_products_labelMouseClicked
        new ProductsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_products_labelMouseClicked

    private void cat_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat_labelMouseClicked
        new CategoryForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cat_labelMouseClicked

    private void memberships_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberships_labelMouseClicked
        new CustomerForm().setVisible(true);
    }//GEN-LAST:event_memberships_labelMouseClicked

    private void logout_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_labelMouseClicked
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_labelMouseClicked

    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseClicked
        employees = Employee.fetchEmployee();
        SelectSeller();
    }//GEN-LAST:event_refresh_btnMouseClicked

    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JTable SellerTable;
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel admin_label;
    private javax.swing.JLabel cat_label;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel close_label;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel employeeList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout_label;
    private javax.swing.JLabel manageEmployees;
    private javax.swing.JLabel memberships_label;
    private javax.swing.JLabel products_label;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTextField sellAddress_field;
    private javax.swing.JTextField sellId_field;
    private javax.swing.JTextField sellName_field;
    private javax.swing.JTextField sellPass_field;
    private javax.swing.JTextField sellPhone_field;
    private javax.swing.JTextField sellSalary_field;
    // End of variables declaration//GEN-END:variables
}
