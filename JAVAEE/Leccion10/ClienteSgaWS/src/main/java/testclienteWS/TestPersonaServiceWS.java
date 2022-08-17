
package testclienteWS;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWS;
import java.util.List;


public class TestPersonaServiceWS {
    public static void main(String[] args) {
       PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
       
        System.out.println("Ejecutando Servicio listar persona ws");
        
        List<Persona> personas = personaService.listarPersonas();
        
        for ( Persona persona: personas) {
            System.out.println("Persona idPersona: " + persona.getIdpersona() + " Nombre: " + persona.getNombre() +
                      " Apellido: " + persona.getApellido() + " Email " + persona.getEmail() + " Telefono " + persona.getTelefono() );
        }
        
        System.out.println("finalizo Servicio listar persona ws");
       
    }
    
}
