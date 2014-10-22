<%-- 
    Document   : add
    Created on : 25.09.2014, 12:28:46
    Author     : ubby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/buttons.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавить контакт</title>
    </head>
    <%
    String login=(String) session.getAttribute("loginname");
    if(login==null)
        login="";
    %>
    <body>
        <div class = "head">
        <h1>Введите данные пользователя <%= login%></h1>
        </div>
        <div class="form">
        <form class="form" action="" method="POST">
        <table border="0">
             <tbody>
            <tr>
                    <td>ID:</td>
                    <td><input class ="login" type="text" name="id"/></td>
            </tr>
           
                <tr>
                    <td>Имя:</td>
                    <td><input class ="login" type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Фамилия:</td>
                    <td><input class ="login" type="text" name="lastname"/></td>
                </tr>
                <tr>
                    <td>Возраст:</td>
                    <td><input class ="login" type="text" name="age"/></td>
                </tr>
                <tr>
                    <td>Пол:</td>
                    <td><input class ="login" type="text" name="sex"/></td>
                </tr>
                <tr>
                    <td>Номен телефона:</td>
                    <td><input class ="login" type="text" name="phonenumber"/></td>
                </tr>
                <tr>
                    <td><input class ="button" type="submit" name="btnAddUser" value="Добавить контакт"/></td>
                    <td><input class ="button" type="submit" name="btnCancel" value="Отмена"/></td>
                </tr>
            </tbody>
        </table>
        </form>
        </div>
    </body>
</html>
