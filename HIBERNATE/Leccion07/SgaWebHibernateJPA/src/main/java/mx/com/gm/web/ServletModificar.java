package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.servicio.ServicioAlumno;
import mx.com.gx.domain.Alumno;
import mx.com.gx.domain.Contacto;
import mx.com.gx.domain.Domicilio;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);

        System.out.println("alumno" + alumno);
        // request.setAttribute("alumno", alumno);

        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);

        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modificar = request.getParameter("Modificar");
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        if (modificar != null) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String nocalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNocalle(nocalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setTelefono(telefono);
            alumno.getContacto().setEmail(email);

           
            servicioAlumno.guardar(alumno);

            sesion.removeAttribute("alumno");
        } else {
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno );           
            servicioAlumno.eliminar(alumno);            
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
