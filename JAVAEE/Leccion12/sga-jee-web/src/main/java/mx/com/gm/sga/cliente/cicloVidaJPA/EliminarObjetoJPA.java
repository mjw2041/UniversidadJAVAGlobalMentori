package mx.com.gm.sga.cliente.cicloVidaJPA;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {

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

        //Objeto en estado detachable 
        log.debug("Objeto recuperado " + persona1);
        
        // Paso 4 Inicia Transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        // Paso 5. Ejecutamos SQL de un delete
        em.remove(em.merge(persona1));
        
        // Paso 6 Cerramos la transaccion
        tx2.commit();
                      
        //Objeto detached ya modificado
        log.debug("Objeto moficado " + persona1);

        // Cerramos en entity Manager
        em.close();
    }
}
