package mx.com.gm.sga.cliente.cicloVidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {

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

        // Paso 4  setValue (nuevoValor)
        persona1.setApellido("Perret");

        // Paso 5 Inicia Transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        // Paso 6 Modificamos el objeto
        em.merge(persona1);

        // Paso 7 Termina la transaccion 2
        tx2.commit();

        //Objeto detached ya modificado
        log.debug("Objeto moficado " + persona1);
        
        // Cerramos en entity Manager
        em.close();
    }
}
