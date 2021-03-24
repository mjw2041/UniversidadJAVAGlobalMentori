/**
 *   En una lista puedo decir que la misma va a ser por ejemplo de String
 *   colocando <String> ( notacion pico diamante ).
 *   Otra ventaja es que no es necesario la conversion, se puede rescatar con 
 *   la sentencia get
 */
package test;

import java.util.*;


public class TestColeccionesGenericas {
    public static void main(String[] args) {
        /* List */
        
        List<String> miLista = new ArrayList<>(); /* Definicion de lista */
        
        miLista.add("Lunes");  /* Agregar valores a la lista */
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        String ele = miLista.get(0);
        System.out.println("ele = " + ele);
        
        imprimir(miLista);
                              
        /* Set */
        
        Set<String> miSet = new HashSet<>(); /* Definir un SET */
        
        miSet.add("Lunes"); /* Agregar Valores */
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");                                      
        
        imprimir(miSet);
        
        Map<String , String>  miMapa = new HashMap<>(); /* Definicion de Mapa */
        miMapa.put("Valor1","Juan" ); /* Agregar Valores */
        miMapa.put("Valor2","Maria" ); 
        miMapa.put("Valor3","Rosario" ); 
        miMapa.put("Valor3","Carlos" );  /* Se va a sustituir Carlos por Rosario */
        
        String elemento = miMapa.get("Valor1"); /* Acceder al valor */
        
        System.out.println("elemento del mapa = " + elemento);
        
        /* keySet() --- Devuelve todo el set de valores*/
        
        imprimir(miMapa.keySet()); /* Imprimir el set */
        
        imprimir(miMapa.values()); /* Imprimir el set */
        
        
        
    }
    
    public static void imprimir ( Collection<String> colecciones) {
        colecciones.forEach(elemento -> { /* Recorrer la lista forma reducida funcion de flecha */            
            System.out.println("elemento de la lista = " + elemento); /* Mostar elemento de la lista */
        });    
        
        for ( String elemento: colecciones) {
            System.out.println("elemento = " + elemento);
        }
    }
    
}
