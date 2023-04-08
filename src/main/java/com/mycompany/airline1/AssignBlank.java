/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author airin
 */
public class AssignBlank extends javax.swing.JFrame {


    static int advisorID;
    boolean clicked = false;
    static String oldadvisor;
    String highestBlankAmount;
    /**
     * Creates new form AssignBlank
     */
    public AssignBlank() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sinceLabel = new javax.swing.JLabel();
        bgR = new javax.swing.JPanel();
        bgL = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        reassignButton = new javax.swing.JButton();
        blankLabel = new javax.swing.JLabel();
        agentLabel = new javax.swing.JLabel();
        BlankInput = new javax.swing.JComboBox<>();
        agent = new javax.swing.JButton();
        textInput = new javax.swing.JTextField();
        blankLabel1 = new javax.swing.JLabel();
        noInput = new javax.swing.JTextField();

        sinceLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        sinceLabel.setText("Since");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        bgL.setBackground(new java.awt.Color(121, 203, 203));

        title1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title1.setText("Assign Blank");

        confirmButton.setBackground(new java.awt.Color(112, 203, 203));
        confirmButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
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

        title2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title2.setText("to Advisor");

        reassignButton.setBackground(new java.awt.Color(112, 203, 203));
        reassignButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        reassignButton.setText("Reassign");
        reassignButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        reassignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reassignButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(reassignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title1)))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(title2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reassignButton)
                .addGap(18, 18, 18)
                .addComponent(confirmButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(74, 74, 74))
        );

        blankLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        blankLabel.setText("Select Blank");

        agentLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        agentLabel.setText("Select Advisor");

        BlankInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select type", "444", "440", "420", "101", "201", "451", "452" }));
        BlankInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlankInputActionPerformed(evt);
            }
        });

        agent.setBackground(new java.awt.Color(112, 203, 203));
        agent.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        agent.setText("Advisor List");
        agent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        agent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentMouseClicked(evt);
            }
        });
        agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentActionPerformed(evt);
            }
        });

        textInput.setText("Advisor: X Owns: Y Blanks");
        textInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInputActionPerformed(evt);
            }
        });

        blankLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        blankLabel1.setText("Number Of blanks to assign");

        noInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textInput)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRLayout.createSequentialGroup()
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blankLabel)
                            .addComponent(agentLabel)
                            .addComponent(blankLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BlankInput, 0, 209, Short.MAX_VALUE)
                            .addComponent(noInput))))
                .addGap(144, 144, 144))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgRLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentLabel)
                    .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BlankInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankLabel))
                .addGap(28, 28, 28)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blankLabel1))
                .addGap(54, 54, 54)
                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
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

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String quantity = noInput.getText();
        int blanks = Integer.parseInt(quantity);

        if(advisorID == 0){
            JOptionPane.showMessageDialog(null, "Please select an Advisor!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String s =  BlankInput.getSelectedItem().toString();
            int chosen = Integer.parseInt(s);

            String blankk = null;
            int initialBlanks = blanks;

            try (Connection connection = DbConnection.getConnection()){
                PreparedStatement preparedStatement = connection.prepareStatement("select * from BlankStock where StaffID is null");
                ResultSet resultSet = preparedStatement.executeQuery();

                while ( resultSet.next()) {
                    blankk = resultSet.getString("blankID");
                    char  a = blankk.charAt(0); char b = blankk.charAt(1); char c= blankk.charAt(2);
                    String digits = new StringBuilder().append(a).append(b).append(c).toString();
                    int stock = Integer.parseInt(digits);

                    if(chosen == stock && blanks !=0 ){
                        PreparedStatement preparedStatement1 = null;
                        preparedStatement1 = connection.prepareStatement("UPDATE BlankStock SET StaffID = '"+ advisorID + "'where blankID = '"+ blankk + "' ");
                        preparedStatement1.execute();

                        blanks--;
                    }
                }

                if (blanks == initialBlanks) {
                    JOptionPane.showMessageDialog(null, "All of the blanks are currently assigned. Reassign");

                }else if( blanks != 0) {
                    JOptionPane.showMessageDialog(null, "Not enough blanks, only assigned" + " "+ (initialBlanks)+ " "+ "blanks");
                }
                else if(blanks == 0){
                    JOptionPane.showMessageDialog(null, " "+ initialBlanks + " blanks assigned");
                }
                dispose();
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        OffManagerMenu offManagerMenu = new OffManagerMenu();
        offManagerMenu.setVisible(true);
        offManagerMenu.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    private void agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentActionPerformed

        AdvisorDetails advisorDetails = new AdvisorDetails();
        advisorDetails.setVisible(true);
    }//GEN-LAST:event_agentActionPerformed

    private void textInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInputActionPerformed

    private void noInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noInputActionPerformed
    }//GEN-LAST:event_noInputActionPerformed

    private void reassignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reassignButtonActionPerformed
        if (advisorID == 0)
        {
            JOptionPane.showMessageDialog(null, "To reassign select an Advisor", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String s = BlankInput.getSelectedItem().toString();
            int chosen = Integer.parseInt(s);
            String quantity = noInput.getText();
            int blanks = Integer.parseInt(quantity);

            try (Connection connection = DbConnection.getConnection()) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from BlankStock where StaffID = '" + oldadvisor + "'and BlankID like '" + s + "'and BlankSold = 0; ");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    if (blanks != 0) {
                        String blank = resultSet.getString(1);
                        PreparedStatement resultset2 = null;
                        resultset2 = connection.prepareStatement("update BlankStock Set StaffID ='" + advisorID + "' where StaffID = '" + oldadvisor + "'and BlankID like'" + blank + "'and BlankSold= 0;");
                        resultset2.execute();
                        blanks--;
                    }
                }
                if(blanks == 0)
                    JOptionPane.showMessageDialog(null, "Reassigned!");
                int x= Integer.parseInt( highestBlankAmount);
                if( blanks > x ){
                    JOptionPane.showMessageDialog(null, "Enter a number lower than the available stock");
                dispose();
                }

            } catch (SQLException | ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_reassignButtonActionPerformed

    private void agentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentMouseClicked
     clicked = true;
    }//GEN-LAST:event_agentMouseClicked

    private void BlankInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlankInputActionPerformed
        int s = BlankInput.getSelectedIndex();

        String blankType = BlankInput.getSelectedItem().toString();
        char a = blankType.charAt(0); char b = blankType.charAt(1); char c = blankType.charAt(2);
        String digits = new StringBuilder().append(a).append(b).append(c).toString();
        int blank = Integer.parseInt(digits);
        ArrayList advisorID = new ArrayList();
        ArrayList blankamount = new ArrayList();

        try ( Connection connection = DbConnection.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement("select StaffID, Count(*) from BlankStock where BlankID like '" + blank + " %' and BlankSold =0 and StaffID and not null GROUP BY StaffID ORDER BY COUNT (*) DESC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                advisorID.add(resultSet.getInt(1));
                System.out.println(resultSet.getInt(2));
                blankamount.add(resultSet.getInt(2));
            }

            oldadvisor = advisorID.get(0).toString();

            highestBlankAmount = blankamount.get(0).toString();

            PreparedStatement preparedStatement1 = null;
            ResultSet resultSet1 = null;
            preparedStatement1 = connection.prepareStatement("select Username from login where ID='" + oldadvisor + "'");
            resultSet1 = preparedStatement1.executeQuery();
            textInput.setText("Advisor: "+ resultSet1.getString("Username")+ " " + " Owns: "+ blankamount.get(0).toString()+ " "+"blanks");

        } catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_BlankInputActionPerformed

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
            java.util.logging.Logger.getLogger(AssignBlank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignBlank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignBlank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignBlank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignBlank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BlankInput;
    private javax.swing.JButton agent;
    private javax.swing.JLabel agentLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JLabel blankLabel;
    private javax.swing.JLabel blankLabel1;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField noInput;
    private javax.swing.JButton reassignButton;
    private javax.swing.JLabel sinceLabel;
    private javax.swing.JTextField textInput;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
