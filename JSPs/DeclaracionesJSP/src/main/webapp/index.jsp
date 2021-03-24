
<%--  --%>
<%! 
    // declaramos una variable con su metodo get

    private String usuario = "Alberto";
   
    public String getUsuario() {
        return this.usuario;
    }
  
    // Declaramo otra variable 

    private int contadorvisita = 1;

%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Uso de declaraciones cn JSPs</title>
    </head>
    <body>
        <h1>Uso de declaraciones cn JSPs</h1>
        Valor del usuario por medio de un atributo: <%= this.usuario %>
        <br>
        Valor usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        Valor usuario por medio del metodo: <%= this.contadorvisita++ %>
                
    </body>
</html>
