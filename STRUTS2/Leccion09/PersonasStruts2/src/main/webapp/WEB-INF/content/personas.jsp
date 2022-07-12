<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Persona</title>
        <s:head/>
    </head>
    <body>
        <h1>Formulario de Persona(OGNL)</h1>
        <s:form>
            <s:textfield label="Nombre" name="persona.nombre" />
            <s:textfield label="Calle" name="persona.domicilio.calle" />
            <s:textfield label="No Calle" name="persona.domicilio.numeroCalle" />
            <s:textfield label="Pais" name="persona.domicilio.pais" />
            <s:submit value="Enviar"/>            
        </s:form>
        
        <h2> Valores Proporcionados: </h2>
        <h3> Nombre: <s:property value="persona.nombre"/> </h3>
        <h3> Calle: <s:property value="persona.domicilio.calle"/> </h3>
        <h3> No Calle: <s:property value="persona.domicilio.numeroCalle"/> </h3>
        <h3> Pais: <s:property value="persona.domicilio.pais"/> </h3>
        
        <br/>
        <s:if test="persona.nombre != null">
            <s:if test = "persona.nombre == 'admin'">
                Es un usuario administrador
            </s:if>
            <s:else>
                El usuario no es administrador
            </s:else>    
        </s:if>
    </body>
</html>
