package mx.com.gm.sga.cliente.cicloVidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import static mx.com.gm.sga.cliente.cicloVidaJPA.ActualizarObjetoJPA.log;
import mx.com.gm.sga.domain.Persona;

public class ActualizarObjetoSessionLarga {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // Iniciar Transaccion
        // Paso 1 iniciar una transaccion     
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Paso 2 Ejecutar el SQL de tipo SELECT 
        Persona persona1 = em.find(Persona.class, 33);
        log.debug("Objeto recuperado " + persona1);                

        // Paso 3. SetValue
        persona1.setEmail("perretc@info.com.ar");
        persona1.setTelefono("12214");
        
        // Paso 4 Termina la Transaccion
        tx.commit();
        
        //Objeto detached ya modificado
        log.debug("Objeto moficado " + persona1);

        // Cerramos en entity Manager
        em.close();
    }

}
