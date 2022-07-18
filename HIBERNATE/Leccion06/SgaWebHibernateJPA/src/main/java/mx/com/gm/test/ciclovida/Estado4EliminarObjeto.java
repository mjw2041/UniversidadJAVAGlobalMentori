package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gx.domain.Contacto;

public class Estado4EliminarObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        // definimos la variable 
        Contacto contacto = null;

        // recuperamos el objeto
        // 1. trasitivo
        contacto = em.find(Contacto.class, 3);
              
        em.getTransaction().begin();

        // 2. persistente
        em.remove(em.merge(contacto));
        em.getTransaction().commit();

        // 3.Trasitivo
        System.out.println("contacto = " + contacto);
    }
}
