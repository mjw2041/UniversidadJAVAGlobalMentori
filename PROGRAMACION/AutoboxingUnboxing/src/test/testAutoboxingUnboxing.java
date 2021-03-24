/**
 *   Cada tipo primitivo tiene una cada envolvente
 *   int ---> integer
 *   long ---> Long
 *   float ---> Float
 *   double ---> Double
 *   boolean ---> Boolean
 *   byte ---> Byte
 *   char ---> Char
 *   short ---> Short
 */
package test;

public class testAutoboxingUnboxing {
    public static void main(String[] args) {
        /* Definicion de una variable como objeto 
        ** Esto se llama Autoboxing 
        */
        Integer entero = 10; /* Autoboxing 
        System.out.println("entero = " + entero);            /** Esto es un nro  */
        System.out.println("entero.toString = " + entero.toString()); /** Esto es una cadena  */
        System.out.println("entero.toString = " + entero.doubleValue()); /** Lo convierte a double */
        
        /**
         *  Convertir una variable objeto a una tipo primitivo se llama unboxing
         */
        
        int enteroint = entero; /* Unboxing */
        System.out.println("enteroint = " + enteroint);
        
        
        
    }
}
