/**
 * Operacdores Unarios Clase 26 
 *  - ---> Le cambia el signo
     ! ---> opuesto Boolean    
     ++<variable>  se incrementa y luego se asigna
     <variable>++ se asigna y luego se incremente 
     --<variable>  se decrementa y luego se asigna
     <variable>-- se asigna y luego se decrementa
/** 
 *
 * @author MWeihmul
 */
public class OperadoresUnarios26 {
      public static void main ( String args []) {
          int a = 3;
          int b = -a;          
          System.out.println("a = " + a);
          System.out.println("b = " + b);
          
          boolean c = true;
          boolean d = !c;
          System.out.println("c = " + c);
          System.out.println("d = " + d);
          
          int e = 10, f=0;
          f = ++e;
          System.out.println("e = " + e);
          System.out.println("f = " + f);
          
          e= 10;
          f= e++;
          
          System.out.println("e = " + e);
          System.out.println("f = " + f);
          
          e= 10;
          f= --e;
          
          System.out.println("e = " + e);
          System.out.println("f = " + f);
          
          e= 10;
          f= e--;
          
          System.out.println("e = " + e);
          System.out.println("f = " + f);
        
    }    
}
