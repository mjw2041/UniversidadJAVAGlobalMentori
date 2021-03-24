/**
 *   con la palabra final se usa para definir constantes
 * 
 */
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        /*miVariable = 12;*/  /* Es no se puede hacer porque es una constante */
        
        System.out.println("Persona.MI_CONSTANTE = " + Persona.MI_CONSTANTE);
        
        final Persona persona  = new Persona();
        
        /*persona = new Persona();*/ /* Esto no se puede hacer porque es una clase final */
        persona.setNombre("Maxi");
        
        System.out.println("persona.nombre = " + persona.getNombre());
        persona.setNombre("Caro");
        System.out.println("persona.nombre = " + persona.getNombre());
        
        
        
        
    }
}
