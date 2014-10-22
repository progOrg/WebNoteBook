/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Connection.Creating;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ubby
 */
@WebServlet(name = "StertServlet", urlPatterns = {"/StertServlet"})
public class StertServlet extends DispatcherServlet {
  
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("loginname");  
        String password = request.getParameter("password");
        
            
            
        if(request.getParameter("login")!=null)// for index.jsp
        {
            super.forward("/main.jsp",login,password,request, response);
            super.forward("/logServlet",login,password,request, response);
        }
        // main.jsp
        if(request.getParameter("btnAdd")!=null)
           super.forward("/add.jsp",login,password,request, response); 
        
        if(request.getParameter("btnDelete")!=null)
            super.forward("/delete.jsp",login,password,request, response);
        
        if(request.getParameter("btnFound")!=null)
            super.forward("/main.jsp",login,password,request, response);
        
        // for add.jsp
        if(request.getParameter("btnAddUser")!=null)
        {   
            int id = Integer.valueOf(request.getParameter("id"));
            String name  = request.getParameter("name");
            String lastname = request.getParameter("lastname");
            int age = Integer.valueOf(request.getParameter("age"));
            String sex = request.getParameter("sex");
            String phonenumber = request.getParameter("phonenumber");
            
            
        Connection.Creating creating = new Connection.Creating();    
        ResultSet rs = creating.getResultSet();
          
            try {
                creating.addUserDB(id, name, lastname, age, sex, phonenumber);
                
            } catch (SQLException ex) {
                Logger.getLogger(StertServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            super.forward("/main.jsp",login,password,request, response);
        }
        if(request.getParameter("btnCancel")!=null)
            super.forward("/main.jsp",login,password,request, response);
        // end for add.jsp
        
        // For delete.jsp
        
        if (request.getParameter("btnDeleteUser")!=null){
            
            if(request.getParameter("idtodel") == null){
                
            
            }        
            
            int id = Integer.valueOf(request.getParameter("idtodel"));
            Connection.Creating creating = new Connection.Creating();
            try {
                creating.deleteUserDB(id);
                
            } catch (SQLException ex) {
                Logger.getLogger(StertServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            super.forward("/main.jsp", login, password, request, response);
        
        }
            
        
    }

   

}
