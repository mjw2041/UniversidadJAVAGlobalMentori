<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Modificar Alumno</h1>
        <form name="form1" action ="${pageContext.request.contextPath}/ServletModificar" method="POST">
            <input type ="hidden" name ="idAlumno" value="${alumno.idAlumno}"/>
            Nombre: <input text ="text" name ="nombre" value="${alumno.nombre}"/>            
            <br/>
            Apellido: <input type ="text" name ="apellido" value="${alumno.apellido}"/>
            <br/>
            <br/>
            Datos Domicilio:
            <br/>
            Calle: <input type ="text" name ="calle" value="${alumno.domicilio.calle}"/>
            <br/>
            No. Calle: <input type ="text" name ="noCalle" value="${alumno.domicilio.nocalle}"/>
            <br/>
            Pais: <input type ="text" name ="pais" value="${alumno.domicilio.pais}"/>
            <br/>
            <br/>
            Datos Contacto
            Email: <input type ="text" name ="email" value="${alumno.contacto.email}"/>
            <br/>
            Telefono: <input type ="text" name ="telefono" value="${alumno.contacto.telefono}"/>
            <br/>
            <input type="submit" name ="Modificar" value ="Modificar"/>
            <input type="submit" name ="Eliminar" value ="Eliminar"/>
            
        </form>
        
        
    </body>
</html>
