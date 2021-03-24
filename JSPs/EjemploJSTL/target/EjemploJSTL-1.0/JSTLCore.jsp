<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core ( JSP Standard Tag Library)</h1>
        <!-- Manipulacion de Variables -->
        <!-- Se define la varible  -->
        <c:set var="nombre" value="Ernesto" />
        <!-- Se muestra en el nevagador  -->
        Variable nombre: <c:out value="${nombre}"/>
       
        <!-- Variable con codigo HTML  -->                     
        Variable nombre: <c:out value="<h4> Hola Mundo </h4>" escapeXml="false"/>
        <!-- Uso de If  -->                     
        <br/>
        <c:set var="bandera" value="true" />
        
        <c:if test="${bandera}">
            La bandera es verdadera        
        </c:if>        
        <br/>
        <!-- Uso Swirch  -->                     
        <c:if test="${param.opcion != null}">    
              <c:choose>
                  <c:when test="${param.opcion == 1}">
                      </br>
                      Opcion 1 Seleccionada
                  </c:when>
                      
                  <c:when test="${param.opcion == 2}">
                      </br>
                      Opcion 2 Seleccionada
                  </c:when>
                      
                  <c:when test="${param.opcion == 3}">
                      </br>
                      Opcion 3 Seleccionada
                  </c:when>                      
                  <c:otherwise> 
                      </br>
                      Se selecciono otra opcion: ${param.opcion}                           
                  </c:otherwise>    
              </c:choose>
                      
        </c:if>
        <!-- Interacion  -->                     
        <% 
            String nombres[] = {"Juan", "Pedro", "Oscar"};
            request.setAttribute("nombres", nombres);            
        %>            
        <!-- Se tiene que compartir para usarla --> 
        <br/>
        Lista de Nombre 
        <br/>
        <ul>
            <c:forEach var ="persona" items="${nombres}">
                <li>
                    Nombre: ${persona}
                </li>
            </c:forEach>
        </ul>
        <a href="index.jsp" > Volver Pagina de inicio </a>
    </body>
</html>
