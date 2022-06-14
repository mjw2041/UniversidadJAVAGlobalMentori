
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class ServicioPersona {
    
    private PersonaDAO personaDAO;
    
    public ServicioPersona() {
        this.personaDAO = new PersonaDAO();
    }
    public List<Persona> listarPersona () {
        return this.personaDAO.listar();
    }
    
}
