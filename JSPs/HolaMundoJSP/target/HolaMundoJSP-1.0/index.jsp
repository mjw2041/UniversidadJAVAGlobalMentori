<%-- 
    Document   : index
    Created on : 03/03/2021, 23:22:26
    Author     : MWeihmul
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo JSP!</h1>
    </body>
    <ul>
        <li> <% out.print("Hola Mundo con Scriptlets"); %></li>
        <li> ${"Hola Mundo con expresionLanguage (EL)"} </li>
        <li> <%= "Hola Mundo con expresion" %></li>
        <li> <c:out value=" Hola mundo Esto JSTL" /> </li>
    </ul>
</html>
