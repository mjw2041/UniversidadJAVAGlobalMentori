
package domain;


public class testArreglosObject {
    
    public static void main(String[] args) {
        Persona personas[] = new Persona[3]; /* Definicion de Arreglos de Objetos */
        
        personas [0] = new Persona("Maxi"); /* Creacion de los objetos */
        personas [1] = new Persona("Caro");
        
        System.out.println("personas = " + personas); 
        
        System.out.println("personas[0] = " + personas[0].toString()); /* Acceder al Objeto y mostrar los valores*/
        System.out.println("personas[1] = " + personas[1].toString()); /* Acceder al Objeto y mostrar los valores*/
        
        for ( int i = 0; i < personas.length; i++ ) {
            System.out.println("personas[" + i + "]" + " = " + personas[i]);
        }
        
    }
    
}
