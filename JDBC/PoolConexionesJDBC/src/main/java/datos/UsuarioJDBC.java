
package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;


public class UsuarioJDBC {
    private static final String SQL_SELECT = "SELECT idusuario, usuarioNombre, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario ( usuarioNombre, password ) VALUES( ?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET  usuarioNombre = ?, password = ? WHERE idUsuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idUsuario = ?";
    
    public List<Usuario> seleccionar () {
        Connection conn = null;
        PreparedStatement smtm = null;        
        ResultSet rs = null;
        Usuario usuario = null;
        List <Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            smtm     = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            while(rs.next()){
                int idUsuario = rs.getInt("idusuario");
                String usuarion = rs.getString("usuarioNombre");
                String password = rs.getString("password");                    
                usuario = new Usuario (idUsuario, usuarion, password);
                usuarios.add(usuario);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }        
        return usuarios;        
    }                
    
    public int insertar(Usuario usuario) {
        System.out.println("1");
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;        
        try {
            conn = Conexion.getConnection();            
            smtm = conn.prepareCall(SQL_INSERT);            
            smtm.setString(1, usuario.getUsuarioNombre());            
            smtm.setString(2, usuario.getPassword());                        
            registros = smtm.executeUpdate();            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar ( Usuario usuario) {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            smtm = conn.prepareCall(SQL_UPDATE);
            smtm.setString(1,usuario.getUsuarioNombre());
            smtm.setString(2,usuario.getPassword());            
            smtm.setInt(3, usuario.getIdUsuario());
            registros = smtm.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {           
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }                
        return registros;
    }
    
    public int eliminar ( Usuario usuario) {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            smtm = conn.prepareCall(SQL_DELETE);            
            smtm.setInt(1, usuario.getIdUsuario());
            registros = smtm.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {           
                Conexion.close(smtm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }                
        return registros;
    }
}
