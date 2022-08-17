
package mx.com.gm.sga.cliente.cicloVidaJPA;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;


public class PersistirObjectoJPA {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // Inicia la trasaccion 
        // Paso 1 Crea nuevo Objeto
        // Objeto en estado trasitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "13135566");
        
        // Paso 2. Inicia Transaccion
        tx.begin();
        
        // Paso 3. Ejecuta SQL
        em.persist(persona1);
        log.debug("Objeto persistido aun sin commit: " + persona1);
        
        // Paso 4. commit/rollback
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto persistido estado detached **** : " + persona1);
        
        // Cerramos en entityManager
        em.close();                                      
    }
}
