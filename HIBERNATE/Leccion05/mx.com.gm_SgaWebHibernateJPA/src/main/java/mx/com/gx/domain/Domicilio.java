package mx.com.gx.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Domicilio implements Serializable {
    private static final long serialVersionUID = 1L;
       
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_domicilio")   
    private Integer idDomicilio;   
    
    private String calle;    
    
    @Column(name="no_calle")   
    private String nocalle;    
    
    private String pais;

    public Domicilio() {
    }

    public Domicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public String getPais() {
        return pais;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNocalle(String nocalle) {
        this.nocalle = nocalle;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "idDomicilio=" + idDomicilio + ", calle=" + calle + ", nocalle=" + nocalle + ", pais=" + pais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idDomicilio);
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
        final Domicilio other = (Domicilio) obj;
        if (!Objects.equals(this.idDomicilio, other.idDomicilio)) {
            return false;
        }
        return true;
    }
    
    
       
}
