/**
 *  una paquete esticos tiene que llamar a funciones esticas
 *  Dentro de un contexto statico no se puede utiliza la palabra this
*/ 
package test;

import domain.Persona;


public class PersonaPrueba {
    
    int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carolina");
        
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Maximiliano");
        System.out.println("persona1 = " + persona2);
        Imprimir( persona1);
        /// this.contador = 10; No se puede
        
    }
    
    public static void  Imprimir ( Persona persona) {
        System.out.println("persona ( desde Imprimir ) = " + persona);
    }    
    
    public int getContador () {
        return this.contador;
    }
}
