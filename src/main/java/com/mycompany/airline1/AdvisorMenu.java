/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

import javax.swing.*;

/**
 *
 * @author airin
 */
public class AdvisorMenu extends javax.swing.JFrame {



    /**
     * Creates new form AgentMenu
     */
    public AdvisorMenu() {
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
        title = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        bgR = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cutomInfoButton = new javax.swing.JButton();
        ticketsButton = new javax.swing.JButton();
        refundButton = new javax.swing.JButton();
        flightsButton1 = new javax.swing.JButton();
        currencyExButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        line.setBackground(new java.awt.Color(0, 0, 0));
        line.setPreferredSize(new java.awt.Dimension(998, 526));

        bgL.setBackground(new java.awt.Color(112, 203, 203));

        logo.setIcon(new javax.swing.ImageIcon("src/main/java/appLogo.png")); // NOI18N

        title.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        title.setText("Travel Advisor");

        logoutButton.setBackground(new java.awt.Color(217, 141, 141));
        logoutButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        logoutButton.setText("LogOut");
        logoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(bgLLayout.createSequentialGroup()
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(46, 46, 46))
        );

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        cutomInfoButton.setBackground(new java.awt.Color(112, 203, 203));
        cutomInfoButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        cutomInfoButton.setText("Customer Information");
        cutomInfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        cutomInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutomInfoButtonActionPerformed(evt);
            }
        });

        ticketsButton.setBackground(new java.awt.Color(112, 203, 203));
        ticketsButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        ticketsButton.setText("Ticket Sale");
        ticketsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        ticketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsButtonActionPerformed(evt);
            }
        });

        refundButton.setBackground(new java.awt.Color(112, 203, 203));
        refundButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        refundButton.setText("Refund");
        refundButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        refundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundButtonActionPerformed(evt);
            }
        });

        flightsButton1.setBackground(new java.awt.Color(112, 203, 203));
        flightsButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        flightsButton1.setText("Flights ");
        flightsButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        flightsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightsButton1ActionPerformed(evt);
            }
        });

        currencyExButton.setBackground(new java.awt.Color(112, 203, 203));
        currencyExButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        currencyExButton.setText("Currency Exchange Rates");
        currencyExButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        currencyExButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyExButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(121, 121, 121)
                        .addComponent(ticketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(flightsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutomInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currencyExButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(refundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flightsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cutomInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2))
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(currencyExButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ticketsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void cutomInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutomInfoButtonActionPerformed
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setVisible(true);
        customerInfo.setDefaultCloseOperation(StockReport.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_cutomInfoButtonActionPerformed

    private void ticketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsButtonActionPerformed
        Tickets tickets = new Tickets();
        tickets.setVisible(true);
        tickets.setDefaultCloseOperation(Tickets.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_ticketsButtonActionPerformed

    private void refundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundButtonActionPerformed
        Refund refund = new Refund();
        refund.setVisible(true);
        refund.setDefaultCloseOperation(Refund.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_refundButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
        l.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void flightsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightsButton1ActionPerformed
        Flights flights = new Flights();
        flights.setVisible(true);
        flights.setDefaultCloseOperation(Flights.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_flightsButton1ActionPerformed

    private void currencyExButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyExButtonActionPerformed
        ExchangeR exchange = new ExchangeR();
        exchange.setVisible(true);
        exchange.setDefaultCloseOperation(ExchangeR.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_currencyExButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdvisorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvisorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvisorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvisorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvisorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JButton currencyExButton;
    private javax.swing.JButton cutomInfoButton;
    private javax.swing.JButton flightsButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel line;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton refundButton;
    private javax.swing.JButton ticketsButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
