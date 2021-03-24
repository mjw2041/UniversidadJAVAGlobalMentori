
package datos;

import domain.PersonaDTO;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDaoJDBC implements PersonaDAO{
    
    private Connection conexionTransacional;
    
    
    private static final String SQL_SELECT = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona ( nombre, apellido, email, telefono ) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";
         /* en el values se pone ? por cada campo que se quiera insertr */
    
    public PersonaDaoJDBC() {
        
    }
    
    public PersonaDaoJDBC( Connection conexionTransacional) {
        this.conexionTransacional = conexionTransacional;        
    }
    
    
    
    @Override
    public List<PersonaDTO> seleccionar () throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;        
        ResultSet rs = null;
        PersonaDTO persona = null;
        List <PersonaDTO> personas = new ArrayList<>();
        
        try {
            conn = this.conexionTransacional != null ? this.conexionTransacional: Conexion.getConnection();
            smtm     = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            while(rs.next()){
                int idPersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new PersonaDTO (idPersona, nombre, apellido, email,telefono);
                personas.add(persona);
                
            }        
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(smtm);
                if ( this.conexionTransacional == null) {
                    Conexion.close(conn);
                }    
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }        
        return personas;        
    }            
    
    /* Insertar */
    public int insertar ( PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;
        
        try {
            conn = this.conexionTransacional != null ? this.conexionTransacional: Conexion.getConnection();
            smtm = conn.prepareCall(SQL_INSERT);
            smtm.setString(1,persona.getNombre());
            smtm.setString(2,persona.getApellido());
            smtm.setString(3,persona.getEmail());
            smtm.setString(4,persona.getTelefono());
            registros = smtm.executeUpdate();
                    
        } finally {
            try {           
                Conexion.close(smtm);
                 if ( this.conexionTransacional == null) {
                    Conexion.close(conn);
                }  
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }                
        return registros;
    }
    
    public int actualizar ( PersonaDTO persona) {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;
        
        try {
            conn = this.conexionTransacional != null ? this.conexionTransacional: Conexion.getConnection();
            smtm = conn.prepareCall(SQL_UPDATE);
            smtm.setString(1,persona.getNombre());
            smtm.setString(2,persona.getApellido());
            smtm.setString(3,persona.getEmail());
            smtm.setString(4,persona.getTelefono());
            smtm.setInt(5, persona.getIdPersona());
            registros = smtm.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {           
                Conexion.close(smtm);
                 if ( this.conexionTransacional == null) {
                    Conexion.close(conn);
                }  
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }                
        return registros;
    }
    
    public int eliminar ( PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        int registros = 0;
        
        try {
            conn = this.conexionTransacional != null ? this.conexionTransacional: Conexion.getConnection();
            smtm = conn.prepareCall(SQL_DELETE);            
            smtm.setInt(1, persona.getIdPersona());
            registros = smtm.executeUpdate();
                    
        } finally {
            try {           
                Conexion.close(smtm);
                 if ( this.conexionTransacional == null) {
                    Conexion.close(conn);
                }  
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }                        
        }                
        return registros;
    }
    
}
