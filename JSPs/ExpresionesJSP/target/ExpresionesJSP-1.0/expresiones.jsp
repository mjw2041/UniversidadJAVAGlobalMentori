

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JPS con Expresiones!</h1>
        concatenacion: <%= "Saludo" + " " + "JSP" %>      
        <br>
        Operaciones Matematioca <%= 2* 3 / 2 %>
        <br>
        Sesion id: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html"> Regressar al Index </a>
    </body>
</html>
