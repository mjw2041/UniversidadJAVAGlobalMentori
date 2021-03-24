/*
 * Operador de Asignacion
 * Clase 25  
 * = Operador de Asignacion
 * Operacdor de Composicion 
 * += <nro> Incrementa en <nro>
   -= <nro> Decrementa en <nro>
   /= <nro> Divide en <nro>
   *= <nro> Multiplica en <nro>
   %= <nro> Modulo
 */

/**
 *
 * @author MWeihmul
 */
public class OperadoresAsignacion25 {
  public static void main ( String args []) {
        int a = 3, b = 2;
        int c = a - 5 + b;
        System.out.println("c = " + c);
        
        a += 1;  
        System.out.println("a += = " + a);
        
        a -= 1;  
        System.out.println("a -= = " + a);
        
        a *= 5;  
        System.out.println("a *= = " + a);
        
        a /= 5;  
        System.out.println("a /= = " + a);
        
        a %= 2;  
        System.out.println("a = " + a);
    }    
}
