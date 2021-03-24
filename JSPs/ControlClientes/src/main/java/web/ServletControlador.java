
package web;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override            
    protected void doGet(HttpServletRequest request , HttpServletResponse response) 
            throws ServletException, IOException {
        this.accionDefault(request, response);
    
    }
    
    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("clientes = " + clientes);
        request.setAttribute("clientes", clientes);
        request.setAttribute("totalCliente", clientes.size());
        request.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
        // Esta accion hace que se vuelva a repetir la accion
        // request.getRequestDispatcher("clientes.jsp").forward(request, response);
        // Esta accion se dirije a la pagina correspondiente
        response.sendRedirect("cliente.jsp");
        
        

    }
    
    private double calcularSaldoTotal( List<Cliente> clientes){
        int saldoTotal = 0;
        for ( Cliente cliente: clientes ){
            saldoTotal += cliente.getSaldo();
        }        
        return saldoTotal;
    }

    @Override  
    protected void doPost (HttpServletRequest request , HttpServletResponse response) 
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if ( accion != null) {
            switch(accion) {
                case "insertar":                    
                    System.out.println("insertar");
                    this.insetarCliente(request, response);
                    break;            
                
                default:
                    System.out.println("default");
                    this.accionDefault(request, response);
            }
        } else {
             this.accionDefault(request, response);
        }     
    }    
    
    private void insetarCliente (HttpServletRequest request , HttpServletResponse response) 
                throws ServletException, IOException {
            System.out.println("Hola llegue");
          // recuperar valores de cliente
           String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          String email = request.getParameter("email");
          String telefono = request.getParameter("telefono");
          double saldo = 0;
          String saldoString = request.getParameter("saldo");
          if ( saldoString != null && !"".equals(saldoString) ) {
              saldo = Double.parseDouble(saldoString);
          }
          
          // Creamos  el cliente
           Cliente cliente = new Cliente( nombre, apellido, email, telefono, saldo);
          // Insetarlo en la Base
           int registrosModificados = new ClienteDaoJDBC().insertar(cliente);
          System.out.println("registrosModificados = " + registrosModificados);
          this.accionDefault(request, response);          
    }    
}
