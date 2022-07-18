package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gx.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // definimos la variable 
        Contacto contacto = null;
        
        // recuperamos el objeto
        // 1. trasitivo
        contacto = em.find(Contacto.class, 3);
        
        // modificamos el objeto
        contacto.setEmail("clara@hotmail.com");
        
        em.getTransaction().begin();
        
        // 2. persistente
        // em.persist(contacto);
        em.merge(contacto);
        em.getTransaction().commit();
        
        
        // detached
        System.out.println("contacto = " + contacto); 
    }
}
