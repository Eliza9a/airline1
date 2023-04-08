/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

import com.mysql.cj.log.Log;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author airin
 */
public class CustomerInfo extends javax.swing.JFrame {


    private DefaultTableModel tableModel;
    private int selectedRow;

    /**
     * Creates new form CustomerInfo
     */
    public CustomerInfo() {
        initComponents();
        initCustomerInfo("select * from customer");
        selectedRow = -1;
    }

    public static int nextID(String sqlString){
        int result = 0;
        try (Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement("select max(ID) from '" + sqlString + "'");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            result = resultSet.getInt("max(ID)");
        } catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, e);
        }
        return ++result;
    }

    private void initCustomerInfo(String sqlStatement){
        try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sqlStatement);){
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int column = resultSetMetaData.getColumnCount();
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            while(resultSet.next()){
                Vector v = new Vector();

                for(int i=1; i<=column; i++){
                    v.add(resultSet.getString("CustomerID"));
                    v.add(resultSet.getString("CustomerName"));
                    v.add(resultSet.getString("CustomerEmail"));
                    v.add(resultSet.getString("CustomerContactNumber"));
                    v.add(resultSet.getString("CustomerAddress"));
                    v.add(resultSet.getString("PaymentInformation"));
                    v.add(resultSet.getString("CustomerType"));
                    v.add(resultSet.getDouble("DiscountPlan"));
                    v.add(resultSet.getString("PaymentID"));

                }
                tableModel.addRow(v);
            }
        } catch (SQLException | ClassNotFoundException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgR = new javax.swing.JPanel();
        bgL = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        filtre = new javax.swing.JComboBox<>();
        filtreInput = new javax.swing.JTextField();
        customTButton = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        bgL.setBackground(new java.awt.Color(121, 203, 203));

        title2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title2.setText("Information");

        addButton.setBackground(new java.awt.Color(112, 203, 203));
        addButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(112, 203, 203));
        editButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(112, 203, 203));
        searchButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon("src/main/java/search.png")); // NOI18N
        searchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(112, 203, 203));
        backButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        filtre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find by", "Find by ID", "Find by Name" }));

        filtreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreInputActionPerformed(evt);
            }
        });

        customTButton.setBackground(new java.awt.Color(112, 203, 203));
        customTButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        customTButton.setText("Customer's tickets");
        customTButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        customTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTButtonActionPerformed(evt);
            }
        });

        title1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title1.setText("Customer");

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLLayout.createSequentialGroup()
                                .addComponent(filtreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(37, 37, 37))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addGap(36, 36, 36)
                .addComponent(filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtreInput, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customTButton)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(74, 74, 74))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Address", "ContactNumber", "PaymentInfo", "CustomerType", "DiscountPlan", "PaymentID"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try ( Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer Values (?, '?', '?', '?', '?', '?', '?', '?', '?')");
            preparedStatement.setInt(1, nextID("customer"));
            preparedStatement.execute();
            initCustomerInfo("select * from customer");
        } catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try ( Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = null;

            preparedStatement = connection.prepareStatement("update customer set CustomerName = '"
                    + tableModel.getValueAt(selectedRow, 1)
                    + "', CustomerEmail = '"
                    + tableModel.getValueAt(selectedRow, 2)
                    + "', CustomerContactNumber = '"
                    + tableModel.getValueAt(selectedRow,3)
                    +"', CustomerAddress = '"
                    + tableModel.getValueAt(selectedRow, 4)
                    +"', PaymentInformation = '"
                    + tableModel.getValueAt(selectedRow, 5)
                    +"', CustomerType = '"
                    + tableModel.getValueAt(selectedRow, 6)
                    +"', DiscountPlan = '"
                    + tableModel.getValueAt(selectedRow, 7)
                    +"', PaymentId = '"
                    + tableModel.getValueAt(selectedRow, 8)
                    + "'where CustomerID = '"
                    + tableModel.getValueAt(selectedRow, 0)
                    + "'");

            preparedStatement.execute();
            initCustomerInfo("select * from customer");
        } catch ( ClassNotFoundException | SQLException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        try ( Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = null;
            if(filtreInput.getText().equals("")){
                initCustomerInfo("select * from customer");
            }
            else if (filtre.getSelectedItem().equals("Find by ID")){
                initCustomerInfo("select * from customer where CustomerID = '" + filtreInput.getText() + "'");
            }
            else if (filtre.getSelectedItem().equals("Find by Name")){
                initCustomerInfo("select * from customer where CustomerName = '" + filtreInput.getText() + "'");
            }
        } catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null ,e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        AdvisorMenu advisorMenu = new AdvisorMenu();
        advisorMenu.setVisible(true);
        advisorMenu.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    private void filtreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreInputActionPerformed

    }//GEN-LAST:event_filtreInputActionPerformed

    private void customTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTButtonActionPerformed

        if( CustomerTicket.customerID ==0){
            JOptionPane.showMessageDialog(null, "To view records \"SELECT CUSTOMER\")", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
        CustomerTicket customerTicket = new CustomerTicket();
        customerTicket.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_customTButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

            selectedRow = table.getSelectedRow();

                if(TicketBooking.isInstantiated) {
                    TicketBooking.customerID = (int) tableModel.getValueAt(selectedRow, 0);
                    this.dispose();
                }
                CustomerTicket.customerID= (int) tableModel.getValueAt(selectedRow,0);

        }//GEN-LAST:event_tableMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JButton customTButton;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> filtre;
    private javax.swing.JTextField filtreInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
