
import java.util.Scanner;

/**
 *
 * @author MWeihmul
 */
public class Rectangulo24 {
    
    /*       
       Se encarga de calcular el perimetro y Superficie de rectangulo
    */
    public static void main ( String args []) {
        
        int lado = 0, ancho = 0, perimetro = 0, superficie = 0;
        
        var ingreso = new Scanner(System.in);
        System.out.println("Ingreses el ancho (cm)");
        lado  = Integer.parseInt(ingreso.nextLine());
        
        System.out.println("Ingreses el largo (cm) ");
        ancho = Integer.parseInt(ingreso.nextLine());
        
        perimetro = ( lado * 2 ) + ( lado * 2 );
        System.out.println("perimetro = " + perimetro + " cm ");
        
        superficie = lado * ancho;
        System.out.println("superficie = " + superficie + " cm2" );                        
    }    
}
