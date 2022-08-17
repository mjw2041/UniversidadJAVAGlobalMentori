
package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteAsociacionesJPA {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona>  personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        // Cerramos la coleccion
        em.close();        
        // Imprimir los objetos de tipo persona
        for ( Persona persona: personas) {
             log.debug("Objeto recuperado " + persona);
             for ( Usuario usuario: persona.getUsuarioCollection() ) {
                 log.debug("Usuario recuperado " + usuario);
             }
        }
    }
}
