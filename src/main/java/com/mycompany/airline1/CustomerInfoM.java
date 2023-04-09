/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

/**
 *
 * @author airin
 */
public class CustomerInfoM extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInfoM
     */
    public CustomerInfoM() {
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

        bgR = new javax.swing.JPanel();
        bgL = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        customTButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        filtre = new javax.swing.JComboBox<>();
        filtreInput = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        bgL.setBackground(new java.awt.Color(121, 203, 203));

        title1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title1.setText("Customer");

        customTButton.setBackground(new java.awt.Color(112, 203, 203));
        customTButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        customTButton.setText("Customer's tickets");
        customTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(112, 203, 203));
        searchButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon("src/main/java/search.png")); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(112, 203, 203));
        backButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        filtre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        filtreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreInputActionPerformed(evt);
            }
        });

        title2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        title2.setText("Information");

        javax.swing.GroupLayout bgLLayout = new javax.swing.GroupLayout(bgL);
        bgL.setLayout(bgLLayout);
        bgLLayout.setHorizontalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLLayout.createSequentialGroup()
                        .addComponent(filtreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(customTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(title2)
                        .addComponent(filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(35, 35, 35))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtreInput)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(customTButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 830, Short.MAX_VALUE))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void customTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customTButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        OffManagerMenu offManagerMenu = new OffManagerMenu();
        offManagerMenu.setVisible(true);
        offManagerMenu.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    private void filtreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtreInputActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInfoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInfoM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JButton customTButton;
    private javax.swing.JComboBox<String> filtre;
    private javax.swing.JTextField filtreInput;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}