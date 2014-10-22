<%-- 
    Document   : index
    Created on : 25.09.2014, 9:30:52
    Author     : ubby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/buttons.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход в Notebook</title>
    </head>
    <body>
        <div class = "head">
        <h1>Введите логин и пароль</h1>
        </div>
        <div class="form">
        <form action="stertServlet" method = "POST">
        <table border="0">
            
            <tbody>
                <tr>
                    <td>Login:</td>
                    <td><input class ="textField" type="text" name="loginname"/></input></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input class ="textField" type="password" name="password"/></input></td>
                </tr>
                <tr>
                    <td><input class ="button" type="submit" name="login" value="Login"/></td>
                    <td></td>
                </tr>
                
            </tbody>
        </table>
        </form>
        </div>
        
        
        
        
    </body>
</html>
