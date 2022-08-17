package mx.com.gm.sga.web;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.RowEditEvent;


@Named("personaBean")
@RequestScoped
public class PersonaBean {
    static Logger log = LogManager.getRootLogger();
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
        
    List<Persona> personas;
    
    public PersonaBean(){
        log.debug("Iniciando el Objeto Persona Bean" + this.personas);
        
    }
    
    @PostConstruct 
    public void inicializar(){
        // inicializamos las variable
        this.personas = personaService.listarPersonas();
        this.personaSeleccionada = new Persona();               
        log.debug("personas recuperadas en Manage Bean" + this.personas);
    }
    
    public void editListener ( RowEditEvent event) {
        
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
        
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void agregarPersona() {
        log.debug("Entro en Agregar");
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona() {
        log.debug("Entro en Eliminar");
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reiniciarPersonaSelaccionada(){
        this.personaSeleccionada = new Persona();
    }
    
}
