
package mx.com.gm.sga.test;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // Inicia la Transaccion 
        tx.begin();
        
        // No se debe especificar el ID por que es incremental
        Persona persona1 = new Persona("Maria", "Gutierrez", "mgutierrez@email.com", "1112141");
        log.debug("Objeto a Persistir" + persona1);
        
        // Persistimos el objeto en la Base de Datos
        em.persist(persona1);
        
        // commit
        tx.commit();
        log.debug("Objeto Persistido" + persona1);
        em.close();
    }
    
}
