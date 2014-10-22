<%-- 
    Document   : delete
    Created on : 29.09.2014, 10:29:19
    Author     : ubby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class = "head">
        <h1>Введите ID пользователя</h1>
        </div>
        </div>
        <div class="form">
        <form class="form" action="" method="POST">
        <table border="0">
             <tbody>
            <tr>
                    <td>ID:</td>
                    <td><input class ="login" type="text" name="idtodel"/></td>
            </tr>
           
                
                <tr>
                    <td><input class ="button" type="submit" name="btnDeleteUser" value="Удалить контакт"/></td>
                    <td><input class ="button" type="submit" name="btnCancel" value="Отмена"/></td>
                </tr>
    </body>
</html>
