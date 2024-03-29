/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author airin
 */
public class TicketBooking extends javax.swing.JFrame {

    public static boolean isInstantiated;
    public static int customerID;
    private long blankNumber;
    static boolean typeBlank;
    private int blankAllowance;
    int itinSelectedRow;
    int flighSelectedRow;
    boolean delayedPayment;
    private String discountType;
    private double exchangeRate;
    private double commissionRate;
    private double price;
    private CardPayment cardPayment;
    DefaultTableModel tableModelItin, tableModelFli;

    /**
     * Creates new form TicketBooking
     */
    public TicketBooking() {
        initComponents();
       /* initFlightTable();
        isInstantiated = true;
        delayedPayment = false;
        price = 0;
        exchangeRate = 0;
        //exchangeRatejLabel.setVisible(true);
       // exchangeRateAmmountjLabel.setVisible(true);*/
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
        backButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        CurrencyComboBox = new javax.swing.JComboBox<>();
        paymentComboBox = new javax.swing.JComboBox<>();
        selectCustomerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itinTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        commissionInput = new javax.swing.JTextField();
        discountInput = new javax.swing.JTextField();
        priceButton = new javax.swing.JButton();
        amountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgR.setBackground(new java.awt.Color(204, 255, 255));

        bgL.setBackground(new java.awt.Color(112, 203, 203));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Agent Details");

        backButton.setBackground(new java.awt.Color(112, 203, 203));
        backButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        title.setText("Ticket Booking");

        saveButton.setBackground(new java.awt.Color(112, 203, 203));
        saveButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        CurrencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currency", "USD", "Other" }));

        paymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Method", "Cash", "Card" }));

        selectCustomerButton.setBackground(new java.awt.Color(112, 203, 203));
        selectCustomerButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        selectCustomerButton.setText("Select Customer");
        selectCustomerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        selectCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCustomerButtonActionPerformed(evt);
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
                        .addGap(24, 24, 24)
                        .addGroup(bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(CurrencyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectCustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addGroup(bgLLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(title)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLLayout.setVerticalGroup(
            bgLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(selectCustomerButton)
                .addGap(18, 18, 18)
                .addComponent(paymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CurrencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(35, 35, 35))
        );

        itinTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Departure", "Destination", "Departure Time", "Arrival Time", "Flight Number", "Price", "Customer ID"
            }
        ));
        itinTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itinTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itinTable);

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Departure", "Destination", "Departure Time", "Arrival Time", "Flight No", "Price"
            }
        ));
        flightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(flightTable);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Taxes");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Other");

        commissionInput.setText("Commission");

        discountInput.setText("%Discount");

        priceButton.setBackground(new java.awt.Color(112, 203, 203));
        priceButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        priceButton.setText("Price");
        priceButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 255), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));
        priceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                priceButtonMousePressed(evt);
            }
        });
        priceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceButtonActionPerformed(evt);
            }
        });

        amountLabel.setText("Amount");

        javax.swing.GroupLayout bgRLayout = new javax.swing.GroupLayout(bgR);
        bgR.setLayout(bgRLayout);
        bgRLayout.setHorizontalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRLayout.createSequentialGroup()
                .addComponent(bgL, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commissionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(priceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(amountLabel)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        bgRLayout.setVerticalGroup(
            bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgRLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(amountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(commissionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bgRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(bgRLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(priceButton)))
                .addContainerGap(38, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       /* if (amountLabel.getText().length() > 0) {
            try (Connection connection = DbConnection.getConnection()) {

                PreparedStatement preparedStatement;
                //write to itinerary table
                while (tableModelItin.getRowCount() > 0) {
                    preparedStatement = connection.prepareStatement("insert into Itinerary values(?,?,?,?,?,?,?,?)");
                    preparedStatement.setInt(1, CustomerInfo.nextID("Itinerary"));//ID
                    preparedStatement.setString(2, (String) tableModelItin.getValueAt(0, 0));//Flight Departure
                    preparedStatement.setString(3, (String) tableModelItin.getValueAt(0, 1));//Flight Destination
                    preparedStatement.setString(4, (String) tableModelItin.getValueAt(0, 2));//Flight Arrival Time
                    preparedStatement.setString(5, (String) tableModelItin.getValueAt(0, 3));//Fligght Departure Time
                    preparedStatement.setInt(6, (int) tableModelItin.getValueAt(0, 4));//Flight Number
                    preparedStatement.setLong(7, blankNumber);//Blank Number
                    preparedStatement.setInt(8, (int) tableModelItin.getValueAt(0, 6));//Customer

                    tableModelItin.removeRow(0);

                    preparedStatement.execute();

                }

                //All statements will be commited as a transaction when commit() is called
                connection.setAutoCommit(false);

                //write to payment table
                preparedStatement = connection.prepareStatement("insert into Payment (BlankNumber,DelayedPayment,ExchangeRate,"
                        + "commissionRate,date,taxes,isRefunded) values(?,?,?,?,?,?,?)");
                preparedStatement.setLong(1, blankNumber);
                preparedStatement.setBoolean(2, delayedPayment);
                preparedStatement.setDouble(3, exchangeRate);
                preparedStatement.setDouble(4, commissionRate);
                preparedStatement.setString(5, LocalDate.now().toString());//date
                preparedStatement.setDouble(6, Double.valueOf(commissionInput.getText()));//taxes
                preparedStatement.setBoolean(7, false);//is refunded
                preparedStatement.execute();
                //add card details if card option is selected
                if (paymentComboBox.getSelectedItem().toString().equals("CARD")) {
                    preparedStatement = connection.prepareStatement("update Payment set type = '"
                            + cardPayment.getCardNo() + "',"
                            + " Name = '" + cardPayment.getCardHldrName() + "',"
                            + " ExpDate = '" + cardPayment.getCardExpDate() + "'"
                            + " where BlankNumber = '" + blankNumber + "'"
                    );
                    preparedStatement.execute();

                } else {//write to payment if cash paymment is being used
                    preparedStatement = connection.prepareStatement("update Payment set Type = 'cash' where BlankNumber = '" + blankNo + "'");
                    preparedStatement.execute();
                }
                //if blank is 444 or 420 or 440 write to otherTaxes inside payment
                if (typeBlank == 444 | typeBlank == 420 | typeBlank == 440) {
                    preparedStatement = connection.prepareStatement("update Payment set otherTaxes = '"
                            + Double.valueOf(discountInput.getText())
                            + "' where BlankNumber = '" + blankNumber + "'");
                    preparedStatement.execute();
                }
                //change this blank to sold in Blank
                preparedStatement = connection.prepareStatement("update BlankStock set BlankSold = 1 where BlankID = '" + blankNo + "'");
                preparedStatement.execute();

                //If customer has flexible discount and is under 20% rise it with 0.01% for each sell
                if(discountType.equals("Flexible") & getDiscount() < 20){
                    preparedStatement = connection.prepareStatement("update customer set DiscountRate = " + (getDiscount()+ 0.01) + " where CustomerID = " + custID + "");
                    preparedStatement.execute();
                }

                connection.commit();
                connection.setAutoCommit(true);
                JOptionPane.showMessageDialog(null,
                        "Ticket successfully booked",
                        "Info",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TicketBooking.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,
                        "This booking was not successful");
            }
            customerID = 0;

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "First calculate the price",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
*/
    }//GEN-LAST:event_saveButtonActionPerformed



    private void itinTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itinTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_itinTableMouseClicked

    private void flightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightTableMouseClicked

    }//GEN-LAST:event_flightTableMouseClicked

    private void selectCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCustomerButtonActionPerformed
        CustomerInfo cr = new CustomerInfo();
        cr.setVisible(true);
        cr.setDefaultCloseOperation(cr.DISPOSE_ON_CLOSE);
       // amountLabel.setText(Long.toString(findNextBlankNo()));
        //if the blank is not 444 or 440 or 420 don't allow writing into "Other" text field
      /*  if (typeBlank == 444 | typeBlank == 420 | typeBlank == 440) {
            discountInput.setEditable(true);
        } else {
            discountInput.setEditable(false);
        }*/
    }//GEN-LAST:event_selectCustomerButtonActionPerformed


    private void priceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceButtonActionPerformed
    }//GEN-LAST:event_priceButtonActionPerformed

    private void priceButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceButtonMousePressed
/*
        double discount = getDiscount();
        double discountVal;//amount to be deducted from the final price

        //prevent from making calculation with null values
        // if flyght has not been chosen yet
        if (tableModelItin == null) {
            JOptionPane.showMessageDialog(null,
                    "Please select flight/s",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        }//If currency is not set send message to the user
        else if (CurrencyComboBox.getSelectedItem().toString().equals("CURRENCY")) {
            JOptionPane.showMessageDialog(null,
                    "Please select currency",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            //if local is set but taxes is empty
            if (CurrencyComboBox.getSelectedItem().toString().equals("LOCAL") && taxesTextField.getText().length() <= 0) {//to add check if the input is correct type and reject letters
                JOptionPane.showMessageDialog(null,
                        "Please fill the \"TAXES\" field!",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                //if USD is set but other is empty
            } else if (CurrencyComboBox.getSelectedItem().toString().equals("USD") && (taxesTextField.getText().length() <= 0)) {
                JOptionPane.showMessageDialog(null,
                        "Please fill the \"OTHER\" and \"TAXES\" fields!",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }//if local is set - calculate total price of all (flights * commission) + taxes
            else if (CurrencyComboBox.getSelectedItem().toString().equals("LOCAL")) {

                double taxes = Double.valueOf(taxesTextField.getText());
                double finalPrice = (price * getCommissionRate()) + taxes;

                //for debugging purposes
//                System.out.println("INSIDE LOCAL");
//                System.out.println("price: " + price);
//                System.out.println("commission: " + getCommissionRate());
//                System.out.println("taxes: " + taxes);
                //if the blank is international add other taxes
                if (typeBlank == 444 || typeBlank == 420 || typeBlank == 440) {
                    if (otherTextField.getText().length() > 0) {//if "other" text field is filled get it's value
                        double otherTaxes = Double.valueOf(otherTextField.getText());
                        finalPrice += otherTaxes;
//                        System.out.println("Other Taxes: " + otherTaxes);
//                        System.out.println("Final Price: " + finalPrice);

                        if (discount > 0) {
                            discountVal = (finalPrice * discount) / 100;
                            finalPrice -= discountVal;
//                            System.out.println("discountt: " + discount);
//                            System.out.println("price after discount: " + finalPrice);
                        }

                        amountLabel.setText(String.valueOf(new BigDecimal(finalPrice).setScale(2, RoundingMode.HALF_UP)));
                    } else {//else ask the user to fill this field
                        JOptionPane.showMessageDialog(null,
                                "Please fill the \"OTHER\" text field!",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                } else {//if the blank is not international
                    if (discount > 0) {
                        discountVal = (finalPrice * discount) / 100;
                        finalPrice -= discountVal;
//                        System.out.println("discountt: " + discount);
//                        System.out.println("price after discount: " + finalPrice);
                    }
                    //else add only taxes
                    //the final price is only displayed and not recorded in the DB but all parts of the price
                    //are recorded which allow us to calculate it later for the reports and other purposes
                    amountLabel.setText(String.valueOf(new BigDecimal(finalPrice).setScale(2, RoundingMode.HALF_UP)));
                    //System.out.println("final price: " + finalPrice);
                }

                //If currency set to USD apply esxcange rate to the price
            } else if (CurrencyComboBox.getSelectedItem().toString().equals("USD")) {
                //  System.out.println("INSIDE USD");

                double taxes = Double.valueOf(taxesTextField.getText());
                double otherTaxes = Double.valueOf(otherTextField.getText());
                double totalTaxes = taxes + otherTaxes;
                // final price
                double priceBeforeExchRate = ((price * getCommissionRate()) + totalTaxes);
                // for debugging purposes
//                System.out.println("price: " + price);
//                System.out.println("taxes: " + taxes);
//                System.out.println("other taxes: " + otherTaxes);
//                System.out.println("exchange rate: " + exchangeRate);
//                System.out.println("commission: " + getCommissionRate());

                if (discount > 0) {
                    discountVal = (priceBeforeExchRate * discount) / 100;
                    priceBeforeExchRate -= discountVal;
//                    System.out.println("discountt: " + discount);
//                    System.out.println("price before Exchange rate - discoint: " + priceBeforeExchRate);
                }

                double finalPrice = priceBeforeExchRate * exchangeRate;
//                System.out.println("final price: " + finalPrice);
                //the final price is only displayed and not recorded in the DB but all parts of the price
                //are recorded which allow us to calculate it later for the reports and other purposes
                amountLabel.setText(String.valueOf(new BigDecimal(finalPrice).setScale(2, RoundingMode.HALF_UP)));
            }
        }
*/
    }//GEN-LAST:event_priceButtonMousePressed

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CurrencyComboBox;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgL;
    private javax.swing.JPanel bgR;
    private javax.swing.JTextField commissionInput;
    private javax.swing.JTextField discountInput;
    private javax.swing.JTable flightTable;
    private javax.swing.JTable itinTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> paymentComboBox;
    private javax.swing.JButton priceButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectCustomerButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
