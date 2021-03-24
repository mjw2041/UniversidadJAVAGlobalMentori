<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliege de variables </title>
    </head>
    <body>
        <h1>Despliege de variables</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance de session
        <br/>
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br/>
        
        <a href="${pageContext.request.contextPath}/index.jsp"> Volver al inicio </a>
    </body>
</html>
