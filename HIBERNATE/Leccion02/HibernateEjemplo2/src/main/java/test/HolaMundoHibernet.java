
package test;

import java.util.List;

import javax.persistence.*;
import mx.com.gm.domain.Persona;
public class HolaMundoHibernet {
    public static void main(String[] args) {
        System.out.println("Entro");
        
        String hql = "select p from Persona p";
        System.out.println(hql);                
        
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("E");        
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for ( Persona p:personas) {
            System.out.println("Peraona: " + p);
            
        }        
    }
}
