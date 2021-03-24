
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Maximiliano", 12000, true);
        System.out.println("persona.nombre = " + persona.getNombre());        
        System.out.println("persona.sueldo = " + persona.getSueldo());
        System.out.println("persona.eliminado = " + persona.isEliminado());
        System.out.println("persona = " + persona );
        persona.setNombre("Carolina");
        System.out.println("persona.nombre  ( despues de modificarlo )= " + persona.getNombre());
        System.out.println("persona = " + persona.toString()  );
                
    }
    
}
