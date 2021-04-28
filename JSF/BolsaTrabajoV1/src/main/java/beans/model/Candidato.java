
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named 
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";
    private String apellido;
    private String salarioDeseado;
    
    public Candidato() {
        
        this.setNombre("Introduce tu nombre");
    }
    
    public String getNombre() {
        return this.nombre;
    }

      
    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        
    }

    public String getSalarioDeseado() {
        return this.salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        
    }
    
    
    
}

