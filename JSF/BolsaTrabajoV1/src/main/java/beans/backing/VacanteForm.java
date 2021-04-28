
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacanteForm {
    @Inject
    private Candidato candidato;       
    
    public VacanteForm(){        
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
         
    }
    
    public String enviar() {
        if ( this.candidato.getNombre().equals("Juan")) {
            System.out.println("Hola");
            if ( this.candidato.getApellido().equals("Perez")) {    
                String msg = "Gracias pero Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }             
            return "exito";
        } else {            
            return "fallo";
        }
    }        
}
