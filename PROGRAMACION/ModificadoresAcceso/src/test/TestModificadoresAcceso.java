
package test;

import paquete1.Clase1;
import paquete1.Clase111;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        // Clase1 clase2 = new Clase1("Hola"); /* Es protected */
        // System.out.println("clase1.atributoPublico = " + clase2.atributoProtected /* Es protected */);
        // clase2.Imprimir("Protected");  /* Es protected */
        
        System.out.println(" *** clase hija *** ");
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        System.out.println(" *** clase privada *** ");
        Clase111 clase111 = new Clase111("Hola");
        System.out.println("clase111 = " + clase111);        
                
    }
    
}
