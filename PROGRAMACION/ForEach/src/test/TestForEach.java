/**
 *   No se puede usar la palabra var cuaando defino un arreglo 
 */
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,7,8,9,};
        for (int edad: edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas [] = { new Persona("Maxi"), new Persona ("Caro"), new Persona ("Santi")};
        
        for ( Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
