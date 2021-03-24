/*
 *  Operacdores de IgualdadClase 27  
 *   == Operador de Igualdad
 *   != Operador de desigualdad  
 *   .equals(cadena) ---> Evalua Igualdad en las cadenas
 */

public class OperadoresRelacionales27 {
     public static void main ( String args []) {
       int a = 3, b = 2;
       
       boolean c = ( a == b), d = ( a != b );
       
       System.out.println("c = " + c);
       
       System.out.println("d = " + d);                    
       
       var cadena = "Hola";
       var cadena2 = "Adios";
       
       boolean e = cadena.equals(cadena2);
       System.out.println("e = " + e);
       
 /*
 *  Operacdores Relacionales Clase 28 
 *   > Mayor
 *   < Menor
 *   >= Mayor Igual 
 *   <= Menor Igual
 */
     
      boolean mayor = ( a > b );
      System.out.println("mayor = " + mayor);
      
      boolean menor = ( a < b );
      System.out.println("menor = " + menor);       
      
      boolean mayorIgual = ( a >= b );
      System.out.println("mayor igual = " + mayorIgual);
      
      boolean menorIgual = ( a <= b );
      System.out.println("menorIgual = " + menorIgual);       
      
      if ( a % 2 ==  0) {
          System.out.println("Es par");
      } else {
          System.out.println("Es impar");
      }
      
      int edad = 10, adulto = 18;
      boolean esAdulto = adulto <= edad;
      System.out.println("esAdulto = " + esAdulto);
      
      if ( esAdulto) {
          System.out.println("Es Adulto");
      } else {
          System.out.println("No es adulto");
      }                                  
 /*
 *  Operadores Condicionales Clase 29 
 *   &&  operador logico AND
 *   ||  oprador  logico OR
 *   
 *   
 */     
     int valor = 10, valorMaximo = 100, valorMinimo = 0 ;
     boolean resultado = valor >= valorMinimo && valor <= valorMaximo;
     System.out.println("Resultado = " + resultado);
     
     if (resultado) {
         System.out.println("Dentro del Rango");
     } else {
         System.out.println("Fueradel Rango");         
     }
     
     boolean vacaciones = false, diaDescanso = false;
     if ( vacaciones || diaDescanso ) {
         System.out.println("Puede asistir al juego ");
     } else {
         System.out.println("No Puede asistir al juego ");
     }     
     
 /*
 *  Operadores Ternario Clase 30
 *     ( condicion ) ? ( codigo que se ejecuta si es verdadero : ( codigo que 
 *          se ejecuta si es falso )
 *   
 *   
 *   
 */     
     resultado = ( 3 > 2 ) ? true : false;
     System.out.println("resultado = " + resultado);
     
     int numero = 8;
     var mensaje = (numero % 2 == 0 ) ? "El numero es par" : "El numero es impar";
     System.out.println("mensaje = " + mensaje);
  }            
}
