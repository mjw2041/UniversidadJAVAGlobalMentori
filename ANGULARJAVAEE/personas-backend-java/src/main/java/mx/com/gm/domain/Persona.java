package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries ({
    @NamedQuery(name="persona.encontrarTodasPersonas", query="SELECT p FROM Persona p ORDER BY p.idpersona")
})
public class Persona implements Serializable{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona")
    private int idPersona;
    
    private String nombre;

    public Persona() {
    }

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
