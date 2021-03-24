
package aritmetica;

import excepciones.RunTimeException;


public class Aritmetica2 {
    public static int division( int numerador, int denominador ) 
              throws RunTimeException {
        if ( denominador == 0 ) {
            throw new RunTimeException ( "Division por cero"); 
        }
        
        return numerador / denominador;
    }
}

