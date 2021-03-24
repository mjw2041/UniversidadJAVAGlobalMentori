
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")

public class GeneracionExcelServlet extends HttpServlet {
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Indicamos el tipo de respuesta al navegador       
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");

        /// para un uso mas profesional utilizar poi.apache.org
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        // desplegamos informacion al cliete
        PrintWriter out = response.getWriter();
        out.println("\tvalores");
        out.println("\t1");
        out.println("\t2");
        out.println("\t3");
        out.println("Total\t=SUMA(B2:B4)");
        out.close();                                                                    
    }
}






