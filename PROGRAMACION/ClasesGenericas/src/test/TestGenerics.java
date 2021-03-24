
package test;

import generico.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15); 
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoInt_2 = new ClaseGenerica("Hola");
        objetoInt_2.obtenerTipo();
    }
    
}
