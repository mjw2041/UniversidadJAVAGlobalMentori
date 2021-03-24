
package test;

import enumeracion.Continentes;
import enumeracion.Dias;


public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println(" *** Enumeracion Dia de la Semana"  ); /* Impression de Enumeracion */
        System.out.println("Dia 1 = " + Dias.LUNES ); /* Impression de Enumeracion */
        indicarDiaSemana( Dias.DOMINGO);
        
        System.out.println(" *** Enumeracion Continente"  ); /* Impression de Enumeracion */
        System.out.println(" Continente N° 4 " + Continentes.AMERICA ); /* Impression de Enumeracion */
        System.out.println(" Paises del Continente N° 4 " + Continentes.AMERICA.getPaises() ); /* Impression de Atriburo de la Enumeracion */
    }   
    
    public static void indicarDiaSemana ( Dias dias ) {
        switch (dias) {
            case LUNES: 
                System.out.println("Dia 1 = " + Dias.LUNES );
                break;
            case MARTES: 
                System.out.println("Dia 2 = " + Dias.MARTES );
                break;                
            case MIERCOLES: 
                System.out.println("Dia 3 = " + Dias.MIERCOLES );
                break;                
                
            case JUEVES: 
                System.out.println("Dia 4 = " + Dias.JUEVES );
                break;                
            case VIERNES: 
                System.out.println("Dia 5 = " + Dias.VIERNES );
                break;                                
            case SABADO: 
                System.out.println("Dia 6 = " + Dias.SABADO );
                break;                                
            case DOMINGO: 
                System.out.println("Dia 7 = " + Dias.DOMINGO );
                break;                                                
                
        }
    }
}
