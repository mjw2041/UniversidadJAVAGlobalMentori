/*
  Se debe definir la cantidad de elementos del arreglo 
* edades.length -->  tamaño del arreglo   
  los nombre de los arreglos van en plural
*/
package test;


public class TestArreglos {
    
    public static void main(String[] args) {
        int edades[]  = new int[3]; /* Definicion de Arreglos, [cantidad de elementos]*/  
        System.out.println("edades = " + edades); /* esto muestra la direccion de memora donde se guarda el arreglo*/
        edades[0] = 10; /* Modifico el primer valor del arreglo */
        System.out.println("edades[0] = " + edades[0]); 
        
        /* Muestro todos los valores */
        for ( int i = 0; i < edades.length; i++ ) {
            System.out.println("edades " + i +" = " + edades[i]);
        }
        
        String frutas[] = { "Manzana", "Sandia", "Melon"}; /* Asignarles los valores en el momento de la creacion*/
        
        for ( int i = 0; i < frutas.length; i++ ) {
            System.out.println("fruta " + i +" = " + frutas[i]);
        }
    }
}
