

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBeans</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBeans!</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectagulo" scope="session" />
        Modificamos los valores
        <br/>
        <br/>
        <% 
           int baseValor = 5;
           int alturaValor = 30;
        %>    
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
        
        Nuevo Valor de Base <%=baseValor%>
        <br/>
        Nuevo Valor de Altura <%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp"> Volver al inicio </a>
    </body>
</html>
