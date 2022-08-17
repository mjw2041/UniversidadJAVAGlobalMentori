
package mx.com.gm.sga.cliente.criteria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class PruebaApiCriteria {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        // Query utilizando el API de Criteria
        // 1. Consulta de todas las personas
        log.debug("\n1. Consulta de todas las personas");
        // Paso 1 El objeto EntityManager crea una instancia CriteriaBuilder
        cb = em.getCriteriaBuilder();
        
        // Paso 2 Se crea un objeto Criteria Builder
        criteriaQuery = cb.createQuery(Persona.class);
        
        // Paso 3 Creamos el objeto raiz de query
        fromPersona = criteriaQuery.from(Persona.class);
        
        // Paso 4 seleccionamos lo necesario del from 
        criteriaQuery.select(fromPersona);
        
        // Paso 5 Creamos el query typesafe 
        query = em.createQuery(criteriaQuery);
        
        // Paso 6 Ejecutamos la consulta
        personas = query.getResultList();
        mostrarPersonas(personas);
        
        // 2-a Consulta de la persona con id = 1
        // jpql = select p FROM persona p WHERE p.idpersona = 1
        log.debug("\n2-a Consulta de la Persona con id = 34");
        cb = em.getCriteriaBuilder();               
        criteriaQuery = cb.createQuery(Persona.class);               
        fromPersona = criteriaQuery.from(Persona.class);              
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idpersona"), 34));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug(persona);                                      
        
        // 2-b Consulta de la persona con id = 1
        log.debug("\n2-b Consulta de la Persona con id = 34");
        cb = em.getCriteriaBuilder();               
        criteriaQuery = cb.createQuery(Persona.class);               
        fromPersona = criteriaQuery.from(Persona.class);              
        criteriaQuery.select(fromPersona);
        
        // La clase Predicate permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<Predicate>();
        
        // Verificamos si tenemos criterios para agregar
        Integer idPersonaParam = 32;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idpersona" );
        criterios.add(cb.equal(fromPersona.get("idpersona"),parameter));
        
        if (criterios.isEmpty()) {
            throw new RuntimeException("sin criterios");
        } else if (criterios.size() == 1)  {
            criteriaQuery.where(criterios.get(0));
        } else {
            criteriaQuery.where(criterios.toArray( new Predicate[0]));
        }
        query = em.createQuery(criteriaQuery);
        query.setParameter("idpersona", idPersonaParam);
        
        // Se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);
        
        
    }
    
     private static void mostrarPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            log.debug(persona);
        }
    }    
    
}
