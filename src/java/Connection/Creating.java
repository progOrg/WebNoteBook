/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static Connection.MySQLConnection.getDBConnection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mynotebook
 */
public class Creating {
    
    public String userid;
    public String username;
    public String usersurname;
    public String userage;
    public String usersex;
    public String userphone;
    int rowCount;
    
    
    
   
    private static void createDB() throws ClassNotFoundException{
      
    Connection dbConnection = null;
    Statement statement = null;
    
    String createDatabaseQyery =
            "CREATE DATABASE notebook CHARACTER SET utf8 COLLATE utf8_general_ci";
    try {
            
            Class.forName("com.mysql.jdbc.Driver");
                        
            String url = "jdbc:mysql://localhost/mysql";
            
            dbConnection = (Connection) DriverManager.getConnection(url, "root", "012345");
            statement = (Statement) dbConnection.createStatement();
            
            statement.executeUpdate(createDatabaseQyery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //позакрываем теперь все
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
    
    
    
    
    private static void createDbUserTable() throws SQLException {
    Connection dbConnection = null;
    Statement statement = null;
 
    String createTableSQL = "CREATE TABLE users("
            + "USER_ID NUMERIC(5) NOT NULL, "
            + "USERNAME VARCHAR(20) NOT NULL, "
            + "USERSURNAME VARCHAR(20) NOT NULL, "
            + "USERAGE NUMERIC(5) NOT NULL, "
            + "USERSEX VARCHAR(20) NOT NULL, "
            + "USERPHONE VARCHAR(20) NOT NULL, "
            + "PRIMARY KEY (USER_ID) "
            + ")";
 
    try {
        dbConnection = getDBConnection();
        statement = (Statement) dbConnection.createStatement();
 
                // выполнить SQL запрос
        statement.execute(createTableSQL);
        System.out.println("Table \"users\" is created!");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    } finally {
        if (statement != null) {
            statement.close();
        }
        if (dbConnection != null) {
            dbConnection.close();
        }
    }
}
    
    
    public void addUserDB(int usrid, String usrname,String usrsurname,
           int usrage,String usrsex,String usrphone) throws SQLException
   {
           
       
   Connection dbConnection = null;
   Statement statement = null;
    
   String insertTableSQL =
   "INSERT INTO notebook.users"+" "
    + "(`USER_ID`, `USERNAME`, `USERSURNAME`,`USERAGE`, `USERSEX`, `USERPHONE`)"+ 
    "VALUES"+" (" +usrid+", '"+usrname+"', '"+usrsurname+
    "', "+usrage+",'"+usrsex+"','"+usrphone+"' )";
   
   try {
        dbConnection = getDBConnection();
        statement = (Statement) dbConnection.createStatement();
 
                // выполнить SQL запрос
        statement.execute(insertTableSQL);
        System.out.println("User is add");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    } finally {
        if (statement != null) {
            statement.close();
        }
        if (dbConnection != null) {
            dbConnection.close();
        }
    }
      
   }
    
   
   public void deleteUserDB(int usrid) throws SQLException
   {
   Connection dbConnection = null;
   Statement statement = null;
   
   String deleteTableSQL = "DELETE FROM `users` WHERE USER_ID ="+usrid;
   try {
    dbConnection = getDBConnection();
    statement = (Statement) dbConnection.createStatement();
 
    // выполняем запрос delete SQL
    statement.execute(deleteTableSQL);
    System.out.println("Record is deleted from DBUSER table!");
    } catch (Exception e) {
    System.out.println(e.getMessage());
    }finally {
        if (statement != null) {
            statement.close();
        }
        if (dbConnection != null) {
            dbConnection.close();
        }
        }
   }
  // 
   public ResultSet getResultSet(){
   
   Connection dbConnection = null;
   Statement statement = null;
   ResultSet rs = null;
   String[] idArray;
   
   String sqlCommand = "select * from users";
       try {
    dbConnection = getDBConnection();
    statement = (Statement) dbConnection.createStatement();
 
    // выполняем запрос delete SQL
    rs =  statement.executeQuery(sqlCommand);
    System.out.println("Rs Ok!");
    }catch(SQLException e){
           
      System.out.println(e.getMessage());
   
   }
       return rs;
   }

   
   
   
   
   
   
   
   
   
   
}
    
   

