/*
 *  La clase object es la clase padre por excelencia, desde la que se 
 *  heredan las otras clases
 *  == en objeto, se comparan las referencia 
 *  equals compara todo los campos y los tipos
    hashcode = genera un numeero que utiliza para comparar
 * 
 */
package test;

import domain.Empleados;

public class TestClaseObject {
        public static void main(String[] args) {
            Empleados empleado = new Empleados("Juan", 5000);
            Empleados empleado2 = new Empleados("Juans", 5000);
            
            if ( empleado == empleado2 ) {
                System.out.println("Tiene la misma referencia en memoria");
            } else {
                System.out.println("Tienen distinta referencia en memoria");
            }
            
            if ( empleado.equals(empleado2) ) {
                System.out.println("empleado es igual a  + empleado");                
            } else {
                System.out.println("empleado no es igual a  empleado");
            }  
            
            if ( empleado.hashCode() == empleado2.hashCode()) {
                System.out.println("el hascode de empleado es igual a  empleado");
                System.out.println("hash code empleado2 = " + empleado.hashCode());
            } else {
                System.out.println("el hascode de empleado no es igual a  empleado");
                System.out.println("hashcode empleado2 = " + empleado.hashCode());
                System.out.println("hashcode empleado2 = " + empleado2.hashCode());
            }
    }
    
}
