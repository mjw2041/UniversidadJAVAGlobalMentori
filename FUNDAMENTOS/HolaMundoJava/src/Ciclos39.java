/**
 *  Clase 39 
 *  Ciclo While
 *  while (condicion) {
 *      Sentancia
 *  }
 * 
 *  do {
 *      Sentancia    
 *  } while ( condicion )
 * 
 *   for ( variable; condicion; incremento ) {
 *          Sentencias
 *   };
 * 
 *   break: permite romper un ciclo FOR
 *   continue: no ejecuta las linea de abajo del FOR, pero continua iterando
 * 
 *   break <nombre etiquta>: permite ir a la etiqueta
 *   continue <nombre etiqueta>: permite ir a la etiqueta
 * 
 *   <nombre etiqueta>: 
 * 
 */

public class Ciclos39 {
        public static void main ( String args []) {
            var contador = 0;        
            System.out.println("Ciclo While ");
            while (contador < 3) {
                System.out.println("contador = " + contador);
                contador++;
            }    
            
            contador = 0;
            
            System.out.println("Ciclo DO While ");
            
            do{
             System.out.println("contador = " + contador);
             contador ++;
            } while( contador < 3 );
            
            System.out.println("Ciclo FOR break");
            /**
             *  Imprimer el primer numero par 
             */
            for ( int i = 0; i < 3; i++) {
                if ( i % 2 == 0 ) {
                    System.out.println("i = " + i);                        
                    break; 
                };    
            }
            
             /**
             *  Imprimer los nro impares
             */
            System.out.println("Ciclo FOR continue");
            for ( int i = 0; i < 10; i++) {
                if ( i % 2 == 0 ) {                    
                    continue; 
                };    
                System.out.println("i = " + i);                        
            }
                        
        };     
        
        
}
