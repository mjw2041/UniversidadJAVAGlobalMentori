<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>        
        <title><s:text name = "bienvenido.titulo"/></title>
    </head>
    <body>
        <h1><title><s:text name = "bienvenido.titulo"/></title></h1>
        <h2>
            <s:text name = "bienvenido.mensaje"/>
            <br/>
            <s:text name = "form.usuario"/> : <s:property value="usuario"/>
            <br/>
            <s:text name = "form.password"/> : <s:property value="password"/>
            <br/>
            <a href="<s:url action="login"/>"><s:text name = "bienvenido.regresar"/></a>
        </h2>
    </body>
</html>
