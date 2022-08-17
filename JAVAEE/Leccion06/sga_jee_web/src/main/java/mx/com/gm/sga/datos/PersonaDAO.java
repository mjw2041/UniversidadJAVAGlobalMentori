
package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

 
public interface PersonaDAO {
    
    public List<Persona> findAllPersona();
    
    public Persona findPersonaById(Persona persona);
    
    public Persona findPersonaByEmail(Persona persona);
    
    public void insertPersona ( Persona persona);
    
    public void updatePersona ( Persona persona);
    
    public void deletePersona ( Persona persona);
    
    
}
