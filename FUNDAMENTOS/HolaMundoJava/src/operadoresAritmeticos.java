import java.util.Scanner;

public class operadoresAritmeticos {
    /*       
       La funcion main nos permite ejecutar el programa 
    */
    public static void main ( String args []) {

          /**
           *  Clase 23 Operadores Aritmerico
           *  Se puede definir varias variable separadas por coma, 
           *  no se puede utilizar var.
           *  Cuando el resultado de la division se guarda en varuable int
           *  se guarda sin los valores de la coma, realiza un trunc
          */
          
          int a=3, b=2;
          
          var resultado = a+ b;
          
          var resultadoFloat = 3.5;
                                                
          System.out.println("resultado suma = " + resultado);
          
          resultado = a - b;
          
          System.out.println("resultado resta = " + resultado);
          
          resultado = a * b;
          
          System.out.println("resultado multiplicacion = " + resultado);
          
          resultado = a / b;
          
          System.out.println("resultado division = " + resultado);
          
          resultadoFloat = 3D / b;
          
          System.out.println("resultado division Float = " + resultadoFloat);
          
          resultado = a % b;
          
          System.out.println("resultado modulo = " + resultado);
          
          /* Verifica si una variable es par */
          
          if ( a % 2 == 0) {
              System.out.println("Es par");
          } else {
              System.out.println("Es Impar");
          }          
    }
}