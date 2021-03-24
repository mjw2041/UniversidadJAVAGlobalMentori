/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author MWeihmul
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        /**
         *  Variables locales 
        */
        var nro1 = 0; 
        var nro2 = 0;
        
        int nro3 = 10;
        int nro4 = 10;
                
         
        System.out.println("Contructores Vacio ");        
        Aritmetica aritmetica1 = new Aritmetica();               
        System.out.println("aritmetica1.a = " + aritmetica1.a);
        System.out.println("aritmetica1.b = " + aritmetica1.b);
        aritmetica1.sumar();
        
        
        // Aritmetica aritmetica1 = new Aritmetica();        
        // Aritmetica aritmetica1 = new Aritmetica(10);               
        System.out.println("Contructores con parametro ");        
        Aritmetica aritmetica2 = new Aritmetica(10, 30);               
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);
        aritmetica2.sumar();
        
        System.out.println("Asignado Valores");
        aritmetica1.a = 50;
        aritmetica1.b = 30;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde sumarConRetorno = " + resultado);
        
        resultado = aritmetica1.sumarConArgumento(5, 8);
        System.out.println("Resultado desde sumarConArgumento = " + resultado);            
    }
    
    public static void miMetodo () {     
        // nro3 = 0;  
        // No se puede llamar una variable de un proceso al otro //  
        System.out.println("Mi mentodo"); 
                
    }            
}
