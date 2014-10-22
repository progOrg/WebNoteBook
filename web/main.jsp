<%-- 
    Document   : main
    Created on : 25.09.2014, 10:53:35
    Author     : ubby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/buttons.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Главная страница</title>
    </head>
    <%
        String login = request.getParameter("loginname");  
        String password = request.getParameter("password");      
        if(login==null)
        login="";
        if(password==null)
        password="";
        session.setAttribute("loginname",login);
        session.setAttribute("password",password);
    %>
    
    <body>
        <div class = "head">
        <h1>Вы зашли как <%= login%></h1>
        </div>
        <div class="form">
        <form action="stertServlet" method="POST">
            <table border="0">
              
                <tbody>
                    <tr>
                        <td><input class ="button" type="submit" name="btnAdd" value="Добавить контакт"/></td>
                    </tr>
                    <tr>
                        <td><input class ="button" type="submit" name="btnDelete" value="Улалить контакт"/></td>
                    </tr>
                    <tr>
                        <td><input class ="button" type="submit" name="btnFound" value="Поиск контакта"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
        </div>
        <div class="tableOfContacts">
            <table border="1" cellspacing="2" cellpadding="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Имя</th>
                        <th>Фамилия</th>
                        <th>Возраст</th>
                        <th>Пол</th>
                        <th>Номер телефона</th>
                    </tr>
                </thead>
                <tbody>
                    <jsp:useBean id="getUsers" scope="session" class="Connection.Output" />
                <jsp:setProperty name="getUsers" property="tableOfUsers"/>
                <jsp:getProperty name="getUsers" property="tableOfUsers"/>
                </tbody>
            </table>

        </div>
    </body>
</html>
