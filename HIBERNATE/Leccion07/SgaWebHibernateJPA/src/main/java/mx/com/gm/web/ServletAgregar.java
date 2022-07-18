
package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.servicio.ServicioAlumno;
import mx.com.gx.domain.Alumno;
import mx.com.gx.domain.Contacto;
import mx.com.gx.domain.Domicilio;


@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet{
     protected void doPost ( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String nombre = request.getParameter("nombre");
         String apellido = request.getParameter("apellido");
         String calle = request.getParameter("calle");
         String nocalle = request.getParameter("noCalle");
         String pais = request.getParameter("pais");
         String email = request.getParameter("email");
         String telefono = request.getParameter("telefono");
         
         Domicilio domicilio = new Domicilio();
         domicilio.setCalle(calle);
         domicilio.setNocalle(nocalle);
         domicilio.setPais(pais);
         
         Contacto contacto = new Contacto();
         contacto.setTelefono(telefono);
         contacto.setEmail(email);
                  
         Alumno alumno = new Alumno();
         alumno.setNombre(nombre);
         alumno.setApellido(apellido);
         alumno.setDomicilio(domicilio);
         alumno.setContacto(contacto);
         
         ServicioAlumno  servicioAlumno = new ServicioAlumno();
         servicioAlumno.guardar(alumno);
         
         request.getRequestDispatcher("/index.jsp").forward(request, response);
      
         
     }
}
