
package test;

import domain.Persona;


public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("persona.toString() = " + persona.toString());
        System.out.println("persona.getNombre() = " + persona.getNombre());
    }
    
}
