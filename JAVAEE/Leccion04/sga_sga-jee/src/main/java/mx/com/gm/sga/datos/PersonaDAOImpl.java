
package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;

@Stateless 
public class PersonaDAOImpl implements PersonaDAO {
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersona() {        
        return  em.createNamedQuery("Persona.findAll").getResultList();
    }
   
    @Override
    public Persona findPersonaById(Persona persona) {        
        return em.find(Persona.class, persona.getIdpersona());        
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from persona p where p.email =: ");               
        return (Persona) query.getSingleResult();        
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));
    }
    
}
