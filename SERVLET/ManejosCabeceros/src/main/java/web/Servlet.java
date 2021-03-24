
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")  

public class Servlet extends HttpServlet {
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod(); /* Devuelve el tipo de metodo */
        String uri = request.getRequestURI(); /* Dev URI */
        out.print("<html>");
        out.print("<header>");
        out.print("<title> Header HTTP </title>");                      
        out.print("</header>");
        
        out.print("<body>");
        out.print("<h1> Header HTTP </h1>");
        out.print("<br>");
        out.print("Metodo HTTP" + metodoHttp);
        out.print("<br>");
        out.print("URI Solicitada" + uri);
        
        /* Imprimir todos los cabeceros */
        Enumeration cabeceros = request.getHeaderNames();
        out.print("<br>" );
        while(cabeceros.hasMoreElements()) {
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + ":</b>");
            out.print(request.getHeader(nombreCabecero) );
            out.print("<br>" );
        }
        out.print("</body>");
        
        
                
        out.print("</html>");
        
        out.close();
        
    }
}
