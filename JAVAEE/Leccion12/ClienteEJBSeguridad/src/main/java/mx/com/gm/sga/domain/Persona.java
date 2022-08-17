
package mx.com.gm.sga.domain;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long Serializable = 1L;
            
    private int idpersona;
    private String nombre;
    private String apellido;
    private String Email;
    private String Telefono;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Persona() {
    }

    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", Email=" + Email + ", Telefono=" + Telefono + '}';
    }

   
    
    
    
}
