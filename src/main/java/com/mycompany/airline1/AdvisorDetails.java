/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

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
public class AdvisorDetails extends javax.swing.JFrame {


    private DefaultTableModel tableModel;
    private int selectedRow;
    static  boolean select = false;

    /**
     * Creates new form AgentDetails
     */
    public AdvisorDetails() {
        initComponents();
        initAdvisorDetails("select * from login where UserType = 'Travel Advisor'");
        selectedRow = -1;
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
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        advisorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        bgR.setBackground(new java.awt.Color(204, 255, 255));
        bgR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bgRMouseMoved(evt);
            }
        });

        bgL.setBackground(new java.awt.Color(112, 203, 203));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Agent Details");

        addButton.setBackground(new java.awt.Color(112, 203, 203));
        addButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(112, 203, 203));
        updateButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
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

        title.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title.setText("Advisor Details");

        selectButton.setBackground(new java.awt.Color(112, 203, 203));
        selectButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        selectButton.setText("Select");
        selectButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(32, 32, 32)
                .addComponent(updateButton)
                .addGap(29, 29, 29)
                .addComponent(selectButton)
                .addGap(29, 29, 29)
                .addComponent(backButton)
                .addGap(64, 64, 64))
        );

        advisorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Name", "Email", "Contact Number", "Address"
            }
        ));
        advisorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advisorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(advisorTable);

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Advisor advisor = new Advisor();
        advisor.setVisible(true);
        dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        SystemAdminMenu systemAdminMenu = new SystemAdminMenu();
        systemAdminMenu.setVisible(true);
        systemAdminMenu.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try(Connection connection = DbConnection.getConnection()) {
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("update login set UserType = '"
                    + tableModel.getValueAt(selectedRow, 1)
                    + "', Username= '"
                    + tableModel.getValueAt(selectedRow, 2)
                    + "', Email= '"
                    + tableModel.getValueAt(selectedRow, 3)
                    + "', ContactNumber= '"
                    + tableModel.getValueAt(selectedRow, 4)
                    + "', Address= '"
                    + tableModel.getValueAt(selectedRow, 5)
                    + "' where ID = '"
                    + tableModel.getValueAt(selectedRow, 0) + "'"
            );

            preparedStatement.execute();
            initAdvisorDetails("select * from login where UserType = 'Travel Advisor'");

        } catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void initAdvisorDetails(String sqlStatement) {

        try( PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(sqlStatement);){

            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int column = resultSetMetaData.getColumnCount();

            tableModel = (DefaultTableModel) advisorTable.getModel();
            tableModel.setRowCount(0);

            while(resultSet.next()){
                Vector v = new Vector();

                for(int i= 1; i<= column; i++){
                    v.add(resultSet.getString("ID"));
                    v.add(resultSet.getString("UserType"));
                    v.add(resultSet.getString("Username"));
                    v.add(resultSet.getString("Email"));
                    v.add(resultSet.getString("ContactNumber"));
                    v.add(resultSet.getString("Address"));

                }
                tableModel.addRow(v);
            }
        } catch (SQLException | ClassNotFoundException e){
            Logger.getLogger(CustomerInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void advisorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advisorTableMouseClicked
        selectedRow = advisorTable.getSelectedRow();
    }//GEN-LAST:event_advisorTableMouseClicked

    private void bgRMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgRMouseMoved
        if(Advisor.buttonPressed() == true){
            initAdvisorDetails("select * from login where UserType = 'Travel Advisor'");
        }
    }//GEN-LAST:event_bgRMouseMoved

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        select = true;
        dispose();
    }//GEN-LAST:event_selectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdvisorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvisorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvisorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvisorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvisorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable advisorTable;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}