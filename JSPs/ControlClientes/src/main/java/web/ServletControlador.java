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
import javax.servlet.http.HttpSession;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("antes de accion **** ");
        String accion = request.getParameter("accion");
        //String accion = "editar";
        System.out.println("accion *** = " + accion);

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(request, response);                    
                    break;
                case "eliminar":
                    this.eliminarCliente(request, response);                    
                    break;    

                default:
                    System.out.println("default");
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("clientes = " + clientes);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("clientes", clientes);
        sesion.setAttribute("totalClientes", clientes.size());
        sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
        response.sendRedirect("clientes.jsp");

    }

    private double calcularSaldoTotal(List<Cliente> clientes) {
        int saldoTotal = 0;
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }

    private void editarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        // int idCliente = 1;
        Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
        System.out.println("cliente ***** = ");
        System.out.println("idcliente " + idCliente);
        System.out.println("cliente " + cliente);
        request.setAttribute("cliente", cliente);
        String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    System.out.println("insertar");
                    this.insetarCliente(request, response);
                    break;

                case "modificar":
                    System.out.println("insertar");
                    this.modificarCliente(request, response);
                    break;

                default:
                    System.out.println("default");
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    private void insetarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Hola llegue");
        // recuperar valores de cliente
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        // Creamos  el cliente
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);
        // Insetarlo en la Base
        int registrosModificados = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registrosModificados = " + registrosModificados);
        this.accionDefault(request, response);
    }

    private void modificarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Hola llegue");
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        // int idCliente = 1;
                
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        // Creamos  el cliente
        Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
        System.out.println("cliente = " + cliente);
        System.out.println("nombre = " + nombre);
        System.out.println("request.getParameter(\"apellido\"); = " + request.getParameter("apellido"));
        // Modificar registro en la Base
        int registrosModificados = new ClienteDaoJDBC().actualizar(cliente);
        System.out.println("registrosModificados = " + registrosModificados);
        this.accionDefault(request, response);
    }
    
    private void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Hola llegue... idCliente: " + request.getParameter("idCliente"));
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
                               
        // Creamos  el cliente
        Cliente cliente = new Cliente(idCliente);        
        // Eliminar registro en la Base
        int registrosModificados = new ClienteDaoJDBC().eliminar(cliente);        
        System.out.println("registrosModificados = " + registrosModificados);
        this.accionDefault(request, response);
    }
}
