
package mx.com.gm.java_mysql;

import java.sql.*;

public class ConexionBaseDatos {
    public static void main(String[] args)  throws SQLException {
        listarRegistros();
        insertarRegistro("Hola desde JAVA", "SW");
        listarRegistros();
        modificarRegistro("anulado", "SW", 3);
        listarRegistros();
        eliminarRegistro( 6);
        listarRegistros();
    }
    
    static void listarRegistros() throws SQLException{
        Connection conectar = DriverManager.getConnection(
             "jdbc:mysql://localhost/mensaje_db?serverTimezone=UTC",
             "root",
             "admin"
             );
             System.out.println("Conexion Exitosa");  
             
             String sql = "SELECT * FROM mensaje";
             
             PreparedStatement ps = conectar.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while ( rs.next()) {
                 int id = rs.getInt("mensajes_id");
                 String mensaje = rs.getString("mensajes");                         
                 String autor = rs.getString("autor");                         
                 String fecha = rs.getString("fecha");                                          
                 System.out.printf("%d %s %s %s \n", id, mensaje, autor, fecha);  
             }
             
             rs.close();
             ps.close();
             conectar.close();
    }
    
    static void insertarRegistro ( String mensaje, String autor ) throws SQLException{
        Connection conectar = DriverManager.getConnection(
             "jdbc:mysql://localhost/mensaje_db?serverTimezone=UTC",
             "root",
             "admin"
             );
             System.out.println("Conexion Exitosa");  
             
             String sql = "insert into mensaje ( mensajes, autor, fecha )" +
                          "value ( ?,  ?, current_TIME() );";
             
             PreparedStatement ps = conectar.prepareStatement(sql);
             ps.setString(1, mensaje);
             ps.setString(2, autor);
             ps.executeUpdate();
                                                   
             ps.close();
             conectar.close();
    }
    
    static void modificarRegistro ( String mensaje, String autor, int numeroMensaje  ) throws SQLException{
        Connection conectar = DriverManager.getConnection(
             "jdbc:mysql://localhost/mensaje_db?serverTimezone=UTC",
             "root",
             "admin"
             );
             System.out.println("Conexion Exitosa");  
             
             String sql = " UPDATE mensaje" + 
                          " SET mensajes = ? ," +
                          "autor = ? " +
                          "WHERE mensajes_id = ? ";
             
             PreparedStatement ps = conectar.prepareStatement(sql);
             ps.setString(1, mensaje);
             ps.setString(2, autor);
             ps.setInt(3, numeroMensaje);
             ps.executeUpdate();
             
                                                   
             ps.close();
             conectar.close();
    }
    
    static void eliminarRegistro ( int numeroMensaje  ) throws SQLException{
        Connection conectar = DriverManager.getConnection(
             "jdbc:mysql://localhost/mensaje_db?serverTimezone=UTC",
             "root",
             "admin"
             );
             System.out.println("Conexion Exitosa");  
             
             String sql = " DELETE FROM mensaje WHERE mensajes_id = ? ";
             
             PreparedStatement ps = conectar.prepareStatement(sql);
             ps.setInt(1, numeroMensaje);
             ps.executeUpdate();
             
             ps.close();
             conectar.close();
    }
}
