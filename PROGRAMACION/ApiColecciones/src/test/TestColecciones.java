/***
 *  List:  es un array que puede crecer ideterminadamente, el lugar del array 
 *         donde el tamaño es fijo. La lista mantiene el orden.
 *         Se puede duplicar los elementos
 * 
 *   
 *  Set: es parecido a una List con la diferencia que no mantiene el orden, 
 *       no se puede duplicar los elementos
 * 
 *   Map: es una estructura de tipo llave valor
 *  
 *  
 */
package test;

import java.util.*;


public class TestColecciones {
    public static void main(String[] args) {
        /* List */
        
        List miLista = new ArrayList(); /* Definicion de lista */
        
        miLista.add("Lunes");  /* Agregar valores a la lista */
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
                
        miLista.forEach(elemento -> { /* Recorrer la lista forma reducida funcion de flecha */            
            System.out.println("elemento de la lista = " + elemento); /* Mostar elemento de la lista */
        });    
        
        for ( Object elemento: miLista) { /* Recorrer la lista */
            System.out.println("elemento de la lista = " + elemento); /* Mostar elemento de la lista */
        }   
        
        /* Set */
        
        Set miSet = new HashSet(); /* Definir un SET */
        
        miSet.add("Lunes"); /* Agregar Valores */
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");                                      
        
        imprimir(miSet);
        
        Map miMapa = new HashMap(); /* Definicion de Mapa */
        miMapa.put("Valor1","Juan" ); /* Agregar Valores */
        miMapa.put("Valor2","Maria" ); 
        miMapa.put("Valor3","Rosario" ); 
        
        String elemento = ( String )miMapa.get("Valor1"); /* Acceder al valor */
        
        System.out.println("elemento del mapa = " + elemento);
        
        /* keySet() --- Devuelve todo el set de valores*/
        
        imprimir(miMapa.keySet()); /* Imprimir el set */
        
        imprimir(miMapa.values()); /* Imprimir el set */
        
        
        
    }
    
    public static void imprimir ( Collection colecciones) {
        colecciones.forEach(elemento -> { /* Recorrer la lista forma reducida funcion de flecha */            
            System.out.println("elemento de la lista = " + elemento); /* Mostar elemento de la lista */
        });    
    }
    
}
