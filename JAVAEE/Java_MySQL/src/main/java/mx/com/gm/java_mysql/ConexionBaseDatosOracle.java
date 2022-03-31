/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.java_mysql;

import java.sql.*;

/**
 *
 * @author MWeihmul
 */
public class ConexionBaseDatosOracle {
    
     public static void main(String[] args) throws SQLException {
        listarRegistros();
    }
     
     static void listarRegistros() throws SQLException{
        Connection conectar = DriverManager.getConnection(
             "jdbc:oracle:thin:@\\db01desa.lasegunda.com.ar:1521:DESA.lasegunda.com.ar",                
             "ops$mweihmul",
             "mweihmul"
             );
             System.out.println("Conexion Exitosa");  
/*             
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
*/  
             conectar.close();

    }
    
}
