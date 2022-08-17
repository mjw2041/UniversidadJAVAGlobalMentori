
package mx.gm.com.sga.cliente;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            log.debug("Hola");
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            log.debug("Iniciando Prueba Manejo Trasaccional Persona Service");
            // Buscar una objeto Persona 
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(34));
            log.debug("Persona " + persona1);
            persona1.setApellido("Cambio");
            personaService.modificarPersona(persona1);
            log.debug("Objeto modificado" + persona1);
            log.debug("fin de prueba");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
