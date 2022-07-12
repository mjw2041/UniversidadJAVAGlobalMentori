
package mx.com.gx.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto implements Serializable{
     private static final long serialVersionUID = 1L;
       
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_contacto")   
    private Integer IdContacto;
    
    private String telefono;
    
    private String email;

    public Contacto() {
    }

    public Contacto(Integer IdContacto) {
        this.IdContacto = IdContacto;
    }

    public Integer getIdContacto() {
        return IdContacto;
    }

    public void setIdContacto(Integer IdContacto) {
        this.IdContacto = IdContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacto{" + "IdContacto=" + IdContacto + ", Telefono=" + telefono + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.IdContacto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        return true;
    }
    
    
}
