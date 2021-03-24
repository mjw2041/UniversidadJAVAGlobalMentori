/**
 *  El paso por referencia se da unicamente en los objetos
*/

package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.nombre = "Maximiliano";
        persona1.apellido = "Weihmuller";
        
        System.out.println("persona1 = " + persona1.nombre + " " + persona1.apellido);                                        
        cambiaValor(persona1);
        System.out.println("persona1 ( despues del llamado cambiar Valor) = " + persona1.nombre + " " + persona1.apellido);                                        
        
        persona2 = cambiaValorFuncion(persona1);
        System.out.println("persona2 ( despues del llamado cambiar Valor Funcion) = " + persona2.nombre + " " + persona2.apellido);                                        
    }
    
    public static void cambiaValor( Persona persona) {
        System.out.println("persona ( dentro de cambia Valor )= " + persona.nombre + " " + persona.apellido);                                        
        persona.nombre = "Carolina";
        persona.apellido = "Perret";
        System.out.println("persona1 ( despues del cambio de valor ) = " + persona.nombre + " " + persona.apellido);                                        
        
        return;
                
    }
    
    public static Persona cambiaValorFuncion( Persona persona) {
        System.out.println("persona ( dentro de cambia Valor )= " + persona.nombre + " " + persona.apellido);                                        
        persona.nombre = "Carolina";
        persona.apellido = "Perret";
        System.out.println("persona1 ( despues del cambio de valor ) = " + persona.nombre + " " + persona.apellido);                                        
        
        return persona;
                
    }
    
}
