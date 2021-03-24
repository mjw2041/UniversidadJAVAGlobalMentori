
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset-UTF-8");
        
       
        
        /// Creamos o recuperamos el httpSession 
        HttpSession sesion = request.getSession();
        
        // Resuperamos la lista de articulos        
        List<String> articulos = ( List<String> ) sesion.getAttribute("articulos");
        
         // procesar el nuevo articulo recibo desde la pagina
        String articuloNuevo = request.getParameter("articulo");
        
        // Verificamos si la lista de articulo existe
        if ( articulos == null ){
            // Inicializamos la lista de articulos 
            articulos = new ArrayList<>(); 
            sesion.setAttribute("articulos", articulos);
        }
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
            /* Como estoy trabajando con objeto cualquier cambio en articulos se refleja en "articulos" de
               la httpSesion
            */            
        }
        /// Esta es la forma recomendada
        
        try (PrintWriter out = response.getWriter()) {
            /// Imprimimos la lista de articulos
            out.print("<h1> Lista de articulos </h1>" );
            out.print("<br/>" );
            /// Iteramos todos los articulos
            for ( String articulo: articulos) {
                out.print("<LI>" + articulo + "</LI>" );
            }
            // Agregamos un link para volver
            out.print("<br/>" );
            out.print("<a href='/EjemploCarritoCompra'> Regresamos al inicio </a>");
        }            
    }    
}
