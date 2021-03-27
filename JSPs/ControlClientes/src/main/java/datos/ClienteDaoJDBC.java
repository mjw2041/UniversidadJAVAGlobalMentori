
package datos;

import dominio.Cliente;
import java.sql.*;
import java.util.*;


public class ClienteDaoJDBC {
    private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellido," + 
            "email, telefono, saldo FROM cliente";
    
    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellido, " + 
            "email, telefono, saldo FROM cliente WHERE id_cliente = ?";
    
    private static final String SQL_INSERT = "INSERT INTO cliente( nombre, apellido ,email, telefono, saldo)"
               + "VALUES (?,?,?,?,?)";
    
    private static final String SQL_UPDATE = "UPDATE cliente" + 
              " SET nombre = ?, apellido = ?, email = ?, telefono = ?, saldo = ? WHERE id_cliente = ? " ;
    
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ?";
    
    public List<Cliente> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            
            conn = Conexiones.getConnection();
            stmt = conn.prepareCall(SQL_SELECT);
            rs = stmt.executeQuery();
            while ( rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");                
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                Double saldo = rs.getDouble("saldo");
                
                cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
                clientes.add(cliente);
                        
            }
            
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {
            Conexiones.close(rs);
            Conexiones.close(stmt);
            Conexiones.close(conn);                        
        }
        return clientes;            
    }    
    
    public Cliente encontrar ( Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;  
        System.out.println("Entro a encontrar " + cliente.getIdCliente());
        try {
            
            conn = Conexiones.getConnection();
            System.out.println("Paso 1 ");
            stmt = conn.prepareCall(SQL_SELECT_BY_ID);
            System.out.println("Paso 2 ");
            stmt.setInt(1, cliente.getIdCliente());
            System.out.println("Paso 3 ");
            rs = stmt.executeQuery();            
            System.out.println("Paso 4 ");           
            // rs.absolute(1);
            System.out.println("Paso 4 ");
            
            // String nombre = rs.getString("nombre");
            // String apellido = rs.getString("apellido");            
            // String email = rs.getString("email");
            // String telefono = rs.getString("telefono");
            // Double saldo = rs.getDouble("saldo");
            
            // cliente.setNombre(nombre);
            // cliente.setApellido(apellido);            
            // cliente.setEmail(email);
            // cliente.setTelefono(telefono);
            // cliente.setSaldo(saldo);
            while ( rs.next()) {                
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");                
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                Double saldo = rs.getDouble("saldo");
                
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);            
                cliente.setEmail(email);
                cliente.setTelefono(telefono);
                cliente.setSaldo(saldo);
                
                System.out.println("Paso 5 ");                                        
            }
                                                   
                                               
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {
            Conexiones.close(rs);
            Conexiones.close(stmt);
            Conexiones.close(conn);                        
        }
        return cliente;        
    }
    
    public int insertar ( Cliente cliente ) {
        Connection conn = null;
        PreparedStatement stmt = null;        
        int rows = 0; 
        try {
            
            conn = Conexiones.getConnection();
            stmt = conn.prepareCall(SQL_INSERT);
            stmt.setString(1,cliente.getNombre());
            stmt.setString(2,cliente.getApellido());            
            stmt.setString(3,cliente.getEmail());
            stmt.setString(4,cliente.getTelefono());
            stmt.setDouble(5,cliente.getSaldo());
            
            
            rows = stmt.executeUpdate();
                                                   
                                               
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {            
            Conexiones.close(stmt);
            Conexiones.close(conn);                        
        }
        return rows;                
    }
    
    public int actualizar ( Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;        
        int rows = 0; 
        try {
            
            conn = Conexiones.getConnection();
            stmt = conn.prepareCall(SQL_UPDATE);
            stmt.setString(1,cliente.getNombre());
            stmt.setString(2,cliente.getApellido());            
            stmt.setString(3,cliente.getEmail());
            stmt.setString(4,cliente.getTelefono());
            stmt.setDouble(5,cliente.getSaldo());
            stmt.setDouble(6,cliente.getIdCliente());
            
            rows = stmt.executeUpdate();
                                                   
                                               
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {            
            Conexiones.close(stmt);
            Conexiones.close(conn);                        
        }
        return rows;                        
    }
    
    public int eliminar ( Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;        
        int rows = 0; 
        try {            
            conn = Conexiones.getConnection();
            stmt = conn.prepareCall(SQL_DELETE);            
            stmt.setInt(1,cliente.getIdCliente());
            
            rows = stmt.executeUpdate();
                                                   
                                               
        } catch (SQLException ex) {
             ex.printStackTrace(System.out);
        } finally {            
            Conexiones.close(stmt);
            Conexiones.close(conn);                        
        }
        return rows;                        
    }
}
