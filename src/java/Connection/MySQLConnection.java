/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mynotebook
 */
public class MySQLConnection {
    
    
    
    
    
    
    
    public static Connection getDBConnection() {
    
    Connection dbConnection = null;
    String DB_CONNECTION = "jdbc:mysql://localhost/notebook";
    String DB_USER = "root";
    String DB_PASSWORD = "012345";
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    try {
        dbConnection = (Connection) DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
        return dbConnection;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return dbConnection;
}
    
    
    
    
}
