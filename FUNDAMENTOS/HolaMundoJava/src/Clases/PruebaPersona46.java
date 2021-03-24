/**
 *  Si imprimo una clase directamente
 *   persona2 = Clases.Persona@15aeb7ab
 *  
 *   el valor por defecto que se asigna a los atributios es null
 *   
 *  <nombre de varuiable= Nombre del Paquete.Nombre de la Clase@referenciamemoria
 */
package Clases;

public class PruebaPersona46 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre = "Maximiliano";
        persona1.apellido = "Weihmuller";
        
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
        
                
    }
}
