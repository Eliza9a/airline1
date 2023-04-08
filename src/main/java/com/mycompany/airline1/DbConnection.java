/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airline1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author airin
 */
class DbConnection {

  //  static String SQLCon = "jdbc:mysql://smcse-stuproj00.city.ac.uk:3306", "in2018g10_d", "X4XtM3KT";

    public static Connection getConnection() throws ClassNotFoundException {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g10", "in2018g10_d", "X4XtM3KT");
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            return connection;

        } catch (SQLException e) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }


}