package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();        
        Persona persona = new Persona();
        /*
        personaDAO.listar();
        */
        
        /**
         *  Alta Persona
         * 
         */
        
        /*
        persona.setNombre("Carolina");
        persona.setApellido("Perret");
        
        persona.setEmail("PerretC@hotmail.com");
        persona.setTelefono("123456");       
        personaDAO.insertar(persona);                        
        personaDAO.listar();
        */
        
                
        /**
         *  Mdodificar Persona
         * 
         */        
                
        persona.setIdPersona(24);
        persona = personaDAO.buscarPersonaPorId(persona);
        System.out.println(" ******* persona Encontrada = " + persona);
        
        persona.setApellido("Weihmuller");
        persona.setEmail("MWeihmuller@email.com");        
        personaDAO.modificar(persona);        
        personaDAO.listar();
        
        
         /**
         *  Mdodificar Persona
         * 
         */        
         persona.setIdPersona(24);
         personaDAO.eliminar(persona);
         personaDAO.listar();
    }
}

