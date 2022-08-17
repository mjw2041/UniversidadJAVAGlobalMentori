
package mx.com.gm.sga.cliente.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PersistenciaCascadeJPA {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
               
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        // Paso 1. Creo un nuevo objeto
        // Objeto en estado Trasitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "HHernandez@emal.com", "121141");
        
        // Crear el objeto   
        Usuario usuario1 = new Usuario("hhernandez", "123", persona1);
        
        // Paso 3 Persistimos 
        em.persist(usuario1);
        
        // Paso 4 commit 
        tx.commit();
        
        
        // Objetos en estado detached
         log.debug("Objeto insetado persona1" + persona1);
         log.debug("Objeto insetado usuario1" + usuario1);
        
        
        
    }
}
