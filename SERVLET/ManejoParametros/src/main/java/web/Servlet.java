
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    protected void doPost ( HttpServletRequest request,  HttpServletResponse response ) throws IOException{
        /// Leer los parametros 
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        
        System.out.println("usuario = " + usuario);
        System.out.println("pass= " + pass);
        
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<body>");
        out.print("El Parametro usuario es: " + usuario);
        out.print("<br>");
        out.print("El Parametro password es: " + pass);
        out.print("</body>");
        out.print("</html>");
        out.close();
    
    };
}    
