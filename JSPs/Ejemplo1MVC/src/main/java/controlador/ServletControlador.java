
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          // 1. Prcesamos los parametros
          
          // 2. Creamos los javaBeans
          
          Rectangulo rec = new Rectangulo(3,4);
          
          // 3. Agregamos ek javabean a algun alcance
          request.setAttribute("mensaje", "Saludos desde el Servlet");
          
          // 3.1 Generamos una variable a nivel del session 
          HttpSession sesion = request.getSession();
          sesion.setAttribute( "rectangulo", rec);
          
          // 4. Redireccionar a la vista seleccionada
          
          RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
          rd.forward(request, response);
          
          
    }
    
}
