package com.mycompany.airline1;

import javax.swing.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author airin
 */


public class SystemAdminMenu extends javax.swing.JFrame {

    String path;
    
    /**
     * Creates new form SystemAdminMenu
     */
    public SystemAdminMenu() {
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

        line = new javax.swing.JPanel();
        bgL = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        saTitle = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        bgR = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DBButton = new javax.swing.JButton();
        BSButton = new javax.swing.JButton();
        ADButton = new javax.swing.JButton();
        BackupButton = new javax.swing.JButton();
        RestoreButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        line.setBackground(new java.awt.Color(0, 0, 0));
        line.setPreferredSize(new java.awt.Dimension(998, 526));

        bgL.setBackground(new java.awt.Color(112, 203, 203));

        logo.setIcon(new javax.swing.ImageIcon("src/main/java/appLogo.png")); // NOI18N


        saTitle.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        saTitle.setText("System Administrator");

        logoutButton.setBackground(new java.awt.Color(217, 141, 141));
        logoutButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        logoutButton.setText("LogOut");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(saTitle)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(saTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(47, 47, 47))
        );

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        DBButton.setBackground(new java.awt.Color(112, 203, 203));
        DBButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        DBButton.setText("Database");
        DBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBButtonActionPerformed(evt);
            }
        });

        BSButton.setBackground(new java.awt.Color(112, 203, 203));
        BSButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        BSButton.setText("Blank Stock");
        BSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSButtonActionPerformed(evt);
            }
        });

        ADButton.setBackground(new java.awt.Color(112, 203, 203));
        ADButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        ADButton.setText("Advisor Details");
        ADButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADButtonActionPerformed(evt);
            }
        });

        BackupButton.setBackground(new java.awt.Color(112, 203, 203));
        BackupButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        BackupButton.setText("BackUp");
        BackupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupButtonActionPerformed(evt);
            }
        });

        RestoreButton.setBackground(new java.awt.Color(112, 203, 203));
        RestoreButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        RestoreButton.setText("Restore");
        RestoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RestoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(121, 121, 121)
                        .addComponent(BSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(ADButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(DBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BackupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(RestoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bgR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBButtonActionPerformed
        BlankStock blankstock = new BlankStock();
        blankstock.setVisible(true);
        blankstock.setDefaultCloseOperation(BlankStock.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_DBButtonActionPerformed

    private void BSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSButtonActionPerformed
        StockReport stockreport = new StockReport();
        stockreport.setVisible(true);
        stockreport.setDefaultCloseOperation(StockReport.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_BSButtonActionPerformed

    private void ADButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADButtonActionPerformed
        AdvisorDetails advisordetails = new AdvisorDetails();
        advisordetails.setVisible(true);
        advisordetails.setDefaultCloseOperation(AdvisorDetails.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_ADButtonActionPerformed

    private void BackupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupButtonActionPerformed

        String path = System.getProperty("user.dir");
        LocalDate localDate = LocalDate.now();

        String pathname = path + "\\Database Backup" + localDate + " ";

        try {
            InputStream inputStream = new FileInputStream(""+path+"\\in2018g10.db");

            try{
                OutputStream outputStream = new FileOutputStream(pathname);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0){
                    outputStream.write(buffer, 0, length);
                }

                outputStream.flush();
                outputStream.close();
                inputStream.close();
            } catch (FileNotFoundException e){
                Logger.getLogger(SystemAdminMenu.class.getName()).log(Level.SEVERE, null, e);
            } catch (IOException e){
                Logger.getLogger(SystemAdminMenu.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (FileNotFoundException e){
            Logger.getLogger(SystemAdminMenu.class.getName()).log(Level.SEVERE, null, e);
        }
        JOptionPane.showMessageDialog(null, "Backup was successful");

    }//GEN-LAST:event_BackupButtonActionPerformed

    private void RestoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog((this));
        LocalDate date = LocalDate.now();

        try{
            File file = fileChooser.getSelectedFile();
            path = file.getName();

          //  Connection connection  = DriverManager.getConnection( "jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/" + path + "" +  "in2018g10_d"+ "X4XtM3KT");
            JOptionPane.showMessageDialog(null, "Restored successfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_RestoreButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADButton;
    private javax.swing.JButton BSButton;
    private javax.swing.JButton BackupButton;
    private javax.swing.JButton DBButton;
    private javax.swing.JButton RestoreButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel line;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel saTitle;
    // End of variables declaration//GEN-END:variables
}