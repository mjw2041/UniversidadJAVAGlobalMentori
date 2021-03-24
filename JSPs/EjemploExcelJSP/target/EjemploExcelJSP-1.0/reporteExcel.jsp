<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
    
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reposte Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            
            <tr>
                <th> 1. Fundamentos de Java</th>
                <th> Aprenderemos la sintaxis de JAVA</th>
                <th><%= Conversiones.format( new Date()) %></th>
            </tr>
            
            <tr>
                <th> 2. Programacion con Java</th>
                <th> Pondremos en preactica los conceptos aprendidos</th>
                <th><%= Conversiones.format( new Date()) %></th>
            </tr>
        </table>
    </body>|
</html>
