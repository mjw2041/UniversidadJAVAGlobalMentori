<%-- 
    Document   : procesaFormulario
    Created on : 07/03/2021, 13:33:16
    Author     : MWeihmul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Procesa Formulario</h1>
        Usuario: <%= request.getParameter("usuario") %>;
        <br>
        <br>
        Password <%= request.getParameter("password") %>;
        <br>
        <br>
        <a href="index.html"> Volver al Inicio </a>
    </body>
</html>
