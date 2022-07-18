package mx.com.gm.test.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gx.domain.Alumno;
import mx.com.gx.domain.Contacto;
import mx.com.gx.domain.Domicilio;

public class PersistenciaCascadaTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Dorrego");
        domicilio.setNocalle("125");
        domicilio.setPais("ARG");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("mjw@gmail.com");
        contacto.setTelefono("125");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Santiago");
        alumno.setApellido("Weihmüller");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
                      
    }
}
