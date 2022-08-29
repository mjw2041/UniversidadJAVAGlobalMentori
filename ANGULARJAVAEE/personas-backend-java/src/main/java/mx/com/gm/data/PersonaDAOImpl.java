
package mx.com.gm.data;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

 

@Stateless
public class PersonaDAOImpl implements PersonaDAO{    
    
    @PersistenceContext (unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> encontrarTodasPersonas() {
        return em.createNamedQuery("persona.encontrarTodasPersonas").getResultList();
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public void insertarPersona(Persona persona) {
        em.persist(persona);
        em.flush();
    }

    @Override
    public void actualizarPersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        em.merge(persona);
        em.remove(persona);
    }
    
}
