<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Persona con Struts 2</title>
    </head>
    <body>
        <h1>Persona con Structs 2</h1>
        <s:form>
            <s:textfield name="nombre"/>                
            <s:submit value="Enviar"/>
        </s:form>
        <div>
            Nombre Proporcionado <s:property value="nombre"/>     
        </div>    
    </body>
</html>
