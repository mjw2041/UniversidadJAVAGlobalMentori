
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo") /* path con el que se accede al servlet*/
public class HolaMundo extends HttpServlet{
    
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html/charset= UTF 8"); 
        /* Indicamos que tipo de mensaje respondemos y el juego de caracteres */
        PrintWriter out = response.getWriter();
        out.print("Hola mundo desde Servlet **** ");
    }
    
}
