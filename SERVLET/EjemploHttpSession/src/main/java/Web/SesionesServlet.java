
package Web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SesionesServlet", urlPatterns = {"/SesionesServlet"})
public class SesionesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset-UTF-8");
        /* Crea y devuelve la sesion si no existe la escribe */
        HttpSession sesion = request.getSession();
        
        String respuesta = "Hola";
        
        
        /// Pedir el contadorVisita 
        Integer contadorVisita = (Integer) sesion.getAttribute("contadorVisita");
        
        if ( contadorVisita == null ) {
            contadorVisita = 1;            
            respuesta = "Bienvenido por primera vez";
        } else {
            contadorVisita++;            
            respuesta = "*** Bienvenido nuevamente **** ";
        }
        
        // agregar el nuevo valor a la sesion
        sesion.setAttribute("contadorVisita", contadorVisita);

        PrintWriter out = response.getWriter();
        out.print("Respuesta: " + respuesta );
        out.print("<br/>");
        out.print(" Id: " +  sesion.getId());
        out.print("<br/>");
        out.print("no de acceso al recurso " +  contadorVisita);
        out.close();
                                            
    }   
}