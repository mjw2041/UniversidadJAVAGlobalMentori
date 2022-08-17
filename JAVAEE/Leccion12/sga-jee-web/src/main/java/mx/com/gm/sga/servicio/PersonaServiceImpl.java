package mx.com.gm.sga.servicio;

import java.util.List;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.*;
import javax.inject.Inject;
import javax.jws.WebService;
import mx.com.gm.sga.datos.PersonaDAO;
import mx.com.gm.sga.domain.Persona;

@Stateless
@WebService(endpointInterface="mx.com.gm.sga.servicio.PersonaServiceWS")
@DeclareRoles({"ROLE_ADMIN", "ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWS {
    
    @Inject
    private PersonaDAO personaDAO;
    
    @Resource
    private SessionContext contexto;
    
    
    @Override
    public List<Persona> listarPersonas() {
        
        return personaDAO.findAllPersona();
    }
    
    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDAO.findPersonaById(persona);
    }
    
    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDAO.findPersonaByEmail(persona);
    }
    
    @Override
    public void registrarPersona(Persona persona) {
        personaDAO.insertPersona(persona);
        
    }
       
    
    public void modificarPersona(Persona persona) {
        try {
            personaDAO.updatePersona(persona);
        } catch (Throwable t) {
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }        
    }
       
    @Override
    @RolesAllowed("ROLE_ADMIN")
    public void eliminarPersona(Persona persona) {
        personaDAO.deletePersona(persona);
    }    
    
}
