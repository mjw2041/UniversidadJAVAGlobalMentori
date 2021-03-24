<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplos Scriptlet</title>
    </head>
    <body>
        <h1>JSP con Scriptlet</h1>
        <%--Scriptles para enviar para el navagador --%>
        <%
            out.print("Saludos desde un Scriptles");
        %>
        <br>
        <%--Scriptles para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la apliacion   " + nombreAplicacion  );
        %>
        <br>
        <%--Scriptles con codigo condicionado --%>
        <%
            if(session != null && session.isNew()) {
            out.print("Nombre de la apliacion" + nombreAplicacion  );
        %>
        <br>
        la sesion SI es nueva 
        <%
            } else if(session != null) {                            
        %>
        <br>
        la sesion NO es nueva 
        <%
            }
        %>              
        <a href="index.html"> Regresar al inicio </a>
    </body>
</html>
