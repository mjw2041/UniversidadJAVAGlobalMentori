package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class TestManejoPersona {

    public static void main(String[] args) {                
        Connection conexion = null;
        
        try {            
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() ) {
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO>  personas = personaDao.seleccionar();
            
            for( PersonaDTO persona: personas){
                System.out.println("personas = " + persona);
            }
        
                                            
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
