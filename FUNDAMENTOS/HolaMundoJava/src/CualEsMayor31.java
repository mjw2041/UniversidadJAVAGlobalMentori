
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MWeihmul
 */
public class CualEsMayor31 {
     public static void main ( String args []) {
         int numero1 = 0, numero2 = 0;
         var mayorEs = "";
         
        
        var ingreso = new Scanner(System.in);
        System.out.println("Proporciones el numero 1 ");
        numero1  = Integer.parseInt(ingreso.nextLine());
        
        System.out.println("Proporciones el numero 2 ");
        numero2  = Integer.parseInt(ingreso.nextLine());
        
        if ( numero1 > numero2) {
           mayorEs = "EL primer Numero"; 
        } else if ( numero2 < numero1) {
           mayorEs = "EL segundo Numero"; 
        } else {
            mayorEs = "Son Iguales"; 
        }; 
        System.out.println("mayorEs = " + mayorEs);
    }
}
