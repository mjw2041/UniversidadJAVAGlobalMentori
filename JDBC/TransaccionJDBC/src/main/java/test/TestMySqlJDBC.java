
package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver"); /* Esta linea ya no es obligatoria */
            Connection conexion = DriverManager.getConnection(url, "root", "admin");            
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {  
                System.out.print("id Persona: " + resultado.getInt("idpersona") );
                System.out.print(" Nombre: " + resultado.getString("nombre") );
                System.out.print(" Apellido: " + resultado.getString("apellido") );
                System.out.print(" email: " + resultado.getString("email") );
                System.out.println(" telefono: " + resultado.getString("telefono") );
                
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }        
}
