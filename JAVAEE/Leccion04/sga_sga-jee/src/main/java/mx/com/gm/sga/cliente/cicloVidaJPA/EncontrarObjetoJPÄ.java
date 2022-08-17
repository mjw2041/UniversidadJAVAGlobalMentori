package mx.com.gm.sga.cliente.cicloVidaJPA;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncontrarObjetoJPÄ {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // Iniciar Transaccion
        // Paso 1 iniciar una transaccion     
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Paso 2 Ejecutar el SQL de tipo SELECT 
        Persona persona1 = em.find(Persona.class, 33);
        
        // Paso 3 Termina la transaccion 
        tx.commit();
        log.debug("Objeto recuperado " + persona1);
        
        // Cerramos en entity Manager
        em.close();
    }

}
