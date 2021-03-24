
package WEB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ContadorVisitasServlet", urlPatterns = {"/ContadorVisitasServlet"})

public class ContadorVisitasServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Declaramos una variable Contador 
        int contador = 0;
        
        /// Revisamos si ya existe la cookies
        // Obtenemos el arreglo de cookies
          Cookie[] cookies = request.getCookies();
          
          // Buscamos si ya existe una cookie 
          // llmamada recurrente
          
          if ( cookies != null ) {
              for ( Cookie c: cookies ) {
                  if (c.getName().equals("contadorVisitas") ) {
                      // Busco el Valor de la cookie 
                      contador = Integer.parseInt(c.getValue());
                      break;                      
                  }
              }
         }
         /// Incrementamos el valor 
         contador++;
         /// Agregamos la respuesta al nevegador 
         Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
         /// La cookie se almacenara en el cliente por una hora. 
         c.setMaxAge(3600);
         /// La agrega si existe la remplaza
         response.addCookie(c);
         
         /// Mandamos el mensaje al navegado
         response.setContentType("text/html; charset-UTF-8");
         PrintWriter out = response.getWriter();
         out.print("Contador de Visitas: " + contador);
         out.close();
        
         
    }
}
