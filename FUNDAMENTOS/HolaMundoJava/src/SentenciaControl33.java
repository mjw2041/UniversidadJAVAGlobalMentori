/*
 *  Clase 33 
 *  Se utiliza la sentencia 
 *  if ( condicion ) {
    } else { 
    }
    
    switch ( varible ){
        case valor 1:
            codigo;
            break;       
        case valor 2: 
            codigo;
            break;
        }
        default: 
            codigo
    }
 * 
 */

public class SentenciaControl33 {
    
    public static void main ( String args []) {
        boolean control = true;

        if ( control ) {
           System.out.println("Condicion verdadera");     
        } else {
           System.out.println("Condicion falsa");         
        }
        
        int numero = 5;
        
        var numeroTexto = "Numero Desconicido";
        if ( numero == 1) {
            numeroTexto = "Uno";
        } else if ( numero == 2 ) {
            numeroTexto = "Dos";        
        } else if ( numero == 3 ) {
            numeroTexto = "Tres";        
        } else if ( numero == 4 ) {
            numeroTexto = "Cuatro";
        } else {        
            numeroTexto = "Numero no Encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto); 
        
        var mes = 1;
        var estacion = "Estacion Desconocida"; 
        
        if ( mes == 12 || mes == 1 || mes == 2 ){
            estacion = "Verano";
        } else if ( mes == 3 || mes == 4 || mes == 5 )  {
            estacion = "Otoño"; 
        } else if ( mes == 6 || mes == 7 || mes == 8 ) {
            estacion = "Invierno";
        } else if ( mes == 9 || mes == 10 || mes == 11) { 
            estacion = "Primavera";  
        }              
        
        System.out.println("estacion = " + estacion);
        
        int nro = 1;
        var nroTexto = "Numero Desconocido";
        
        switch ( nro ) {
            case 1 :
                nroTexto = "Uno";
                break;
            case 2 :
                nroTexto = "Dos";
                break;
            case 3 :
                nroTexto = "Tres";
                break;
            case 4 :
                nroTexto = "Cuatro";                
                break;                
                
            default:
                nroTexto = "Numero Desconocido";
        }
        System.out.println("nroTexto = " + nroTexto);
        
        int mesesSwitch = 10;
        
        var estacionSwitch = "Estacion Desconocida";
        
        switch ( mesesSwitch ) {
            case 12: case 1: case 2:
                estacionSwitch = "Verano";
                    break;
            case 3: case 4: case 5:
                estacionSwitch = "Otoño";
                break;
            case 6: case 7: case 8:
                estacionSwitch = "Invierno";
                break;
            case 9: case 10 : case11:
                estacionSwitch = "Primavera";
                break;                
        }
        
        System.out.println("estacionSwitch = " + estacionSwitch);
    }
}
