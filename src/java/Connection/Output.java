/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Papunitsky
 */
public class Output {
    
    public String userid;
    public String username;
    public String usersurname;
    public String userage;
    public String usersex;
    public String userphone;
    
    private String tableOfUsers; 
   
    /**
     * @return the tableOfUsers
     */
    public String getTableOfUsers() {
        Creating connectMySQL = new Creating();
        ResultSet rs = connectMySQL.getResultSet();
        try {
            String tmp = "";
            int count=0;
            while(rs.next())
            {
                    
                userid = rs.getString("USER_ID");
                username = rs.getString("USERNAME");
                usersurname = rs.getString("USERSURNAME");
                userage = rs.getString("USERAGE");
                usersex = rs.getString("USERSEX");
                userphone = rs.getString("USERPHONE");
                
                
                tableOfUsers =tmp+"<tr>"+"<td>"+userid+"</td>"+"<td>"+username+"</td>"
                        +"<td>"+usersurname+"</td>"+"<td>"+userage+"</td>"
                        +"<td>"+usersex+"</td>"+"<td>"+userphone+"</td>"+"</tr>";
                tmp = tableOfUsers;
                
                count++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return tableOfUsers;
    }

    /**
     * @param tableOfUsers the tableOfUsers to set
     */
    public void setTableOfUsers(String tableOfUsers) {
        
        this.tableOfUsers = tableOfUsers;
    }
    
    
    
    
}
