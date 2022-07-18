
package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedireccionar")
public class ServletRediccionar extends HttpServlet {
     protected void doGet ( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.getRequestDispatcher("/WEB-INF/agregarAlumno.jsp").forward(request, response);
     }
}
