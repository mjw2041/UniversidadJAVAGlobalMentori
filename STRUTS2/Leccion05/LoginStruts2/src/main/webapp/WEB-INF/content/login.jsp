<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="Titulo"/></title>
    </head>     
        <h1><s:property value="Titulo"/></h1>
        <s:form>            
            <s:textfield key="form.usuario"  name = "usuario"/>                   
            <s:password key="form.password" name="password"/>                            
            <s:submit key="form.boton" name="submit"/>
        </s:form>
        <br/>
        <div>            
            <s:property value="valores"/> 
            <br/>            
            <s:property value="Titulo"/>:<s:property value="usuario"/>     
            <br/>
            <s:textfield value="FormPassword"/>: <s:property value="password"/>     
        </div>    
    
</html>
