<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="Titulo"/></title>
    </head>    
    <body>
        <h1><s:property value="FormTitulo"/></h1>
        <s:form>            
            <s:textfield key="form.usuario"  name = "usuario"/>                   
            <s:password key="form.password" name="password"/>                            
            <s:submit key="form.boton" name="submit"/>
        </s:form>
        <br/>
        <div>            
            <s:property value="FormValores"/> 
            <br/>             
            <s:property value="FormUsuario"/> : <s:property value="usuario"/>     
            <br/>            
            <s:property value="FormPassword"/> : <s:property value="Password"/>     
        </div>    
    </body>
</html>
