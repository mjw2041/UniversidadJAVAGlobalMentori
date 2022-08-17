
package mx.com.gm.sga.datos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.gm.sga.domain.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{
       
    @PersistenceContext(unitName="SgaPU")    
    EntityManager em;

    @Override 
    public List<Usuario> findAllUsuario() {
        return  em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario persona) {
        return em.find(Usuario.class, persona.getIdUsuario());        
    }

    
    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }
    
}
