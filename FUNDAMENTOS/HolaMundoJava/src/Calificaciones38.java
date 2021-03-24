
import java.util.Scanner;

public class Calificaciones38 {
    public static void main ( String args []) {
        
        double nota;
        var calificacion = "No definida";
        
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del alumno");
        nota  = Double.parseDouble(consola.nextLine());
        
                                        
        if ( nota <= 10 && nota >= 9 ) {
            calificacion = "A";            
        } else if ( nota < 9 && nota >= 8 ) {
            calificacion = "B";
        } else if ( nota < 8 && nota >= 7) {
            calificacion = "C";
        } else if ( nota < 7 && nota >= 6 ) {
            calificacion = "D";
        } else if ( nota < 6 && nota >= 0) {
            calificacion = "F";
        } else {
            calificacion = "Valor Desconocido";
        }            
        System.out.println("calificacion = " + calificacion);
    }
}    
