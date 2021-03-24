
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades [] [] = new int [3] [5]; /* Definicion de matrices [renglones] [matrices] */
        System.out.println("edades = " + edades);
        
        edades [0] [0] = 5; /* Se asigna un valor a la posicion 0,0; */
        edades [0] [1] = 7; /* Se asigna un valor a la posicion 0,0; */
        System.out.println("edades [0] [0] = " + edades [0] [0]); /* Muestro el valor de la posicion 0,0 */
        System.out.println("edades [0] [1] = " + edades [0] [1]);
        /*  Iterar una Matrice, mostrar todo los elementos */
        System.out.println(" Muestro toda la matriz" );
        for ( int renglon = 0; renglon  < edades.length; renglon ++ ) {
            for ( int columna = 0; columna < edades[renglon].length; columna ++ ) {
                System.out.println("edades " + "[" + renglon +"]" + "[" + columna + "]" +" = " + edades[renglon][columna]);
            }           
        }
        
        String frutas [] [] = { {"Naranjas" , "Limon" }, { "Fresas", "Zarzamoras" , "Mora"}}; /* Forma Simplificada */
        
        System.out.println(" Muestro toda la matriz" );
        Imprimir (frutas);
                         
        Persona personas[][] = new Persona[2][3]; /* Crear una matriz de Objetos */
        personas [0][0] = new Persona("Juan");
        System.out.println("personas [0] [0] = " + personas[0] [0]);        
        System.out.println(" Muestro toda la matriz" );
        Imprimir (personas);
    }
    
    public static void Imprimir( Object matriz[] []) {
        for ( int renglon = 0; renglon  < matriz.length; renglon ++ ) {
            for ( int columna = 0; columna < matriz[renglon].length; columna ++ ) {
                System.out.println("edades " + "[" + renglon +"]" + "[" + columna + "]" +" = " + matriz[renglon][columna]);
            }           
        }      
    }
}
