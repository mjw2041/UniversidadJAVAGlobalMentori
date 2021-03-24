package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;

public class TestManejoPersona {

    public static void main(String[] args) {                
        Connection conexion = null;
        
        try {            
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() ) {
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(1);
            cambioPersona.setNombre("Pilar");
            cambioPersona.setApellido("Weihmuller");
            cambioPersona.setTelefono("12345");
            cambioPersona.setEmail("pp@email.com.ar");
            
            personaDAO.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();            
            nuevaPersona.setNombre("CARLOS");
            /* nuevaPersona.setApellido("RAMIREZ11111111111111111111111111111111111111111111");*/ /* Provoca el error */
            nuevaPersona.setApellido("RAMIREZ");
            nuevaPersona.setTelefono("12345");
            nuevaPersona.setEmail("CARLOS@email.com.ar");
            
            personaDAO.insertar(nuevaPersona);
            
            conexion.commit();
                                            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos el segmento Rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }        
    }

}
