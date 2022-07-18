
package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gx.domain.Contacto;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // 1. estado transitivo
        Contacto  contacto = new Contacto();
        contacto.setEmail("xx@xx.com.es");
        contacto.setTelefono("12252");
        
        
        // 2. persistismo el objecto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        // 3. detached ( separado )
        System.out.println("contacto " + contacto);
                     
    }
}
