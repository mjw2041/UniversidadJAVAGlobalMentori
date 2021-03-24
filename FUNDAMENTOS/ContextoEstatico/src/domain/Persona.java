/*
   Los atributos y metodos estaticos son referenten a la clase
   this se usa para los atributos que no son estaticos y el nombre
   de clase para los estaticos
*/

package domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersona = 0;    

    public Persona( String nombre) {
           Persona.contadorPersona++;
           this.idPersona = Persona.contadorPersona;
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
    
    public int getContadorPersona (){
        return this.contadorPersona;
    }
    
    public void setContadorPersona ( int contadorPersona ){
        Persona.contadorPersona = contadorPersona;
    }

    @Override  /// Significa que estoy sobreescribiendo ( @Override ) ///
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

        
}    


