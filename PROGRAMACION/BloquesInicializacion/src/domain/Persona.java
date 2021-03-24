/*
 * Los bloque de inicializacion se llaman antes del constructor.
   dentro de estos bloques llama a los atributos estaticos
   se dividen en dos statico ---> se ejecuta uns sola vez, 
                     no estatico ---> se ejecuta cada vez que se crea  un objeto 
 */
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    /*
    **  Estatico
    */
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    /*
    **  No estatico
    */
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }
    
    public int getPersona() {
        return this.idPersona;
    }    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
