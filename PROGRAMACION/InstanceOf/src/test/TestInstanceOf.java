/**
 *  InstanceOf permite determina el tipo de objeto que se creo.
 *  DEsde una clase hija no se puede acceder a los metodos de la 
 *  clase hija, para eso tenemos que realizar una conversion
 */
package test;

import domain.Empleados;
import domain.Gerente;


public class TestInstanceOf {
    
    public static void main(String[] args) {
        Empleados empleado = new Empleados("Oscar", 54000);        
        Gerente gerente = new Gerente ( "Maxi", 300, "sistemas");
        
        determinarTipo(empleado);        
        determinarTipo(gerente);
        
    }    
    public static void determinarTipo ( Empleados empleado) {
        /* Esto nos devuelve todas las clases a la que pertenece el objeto */
        if ( empleado instanceof Gerente ) {
            System.out.println(" pertenece a la clase Gerente");
           
                    
        }
        if ( empleado instanceof Empleados ){
             System.out.println(" pertenece a la clase Empleado");
        }
        if ( empleado instanceof Object ) {
            System.out.println(" pertenece a la clase Object"   );
        }
        /* Esto nos devuelve a la clase a la que realmente pertenece */
        if ( empleado instanceof Gerente ) {
            System.out.println(" pertenece a la clase Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println(" gerente.getDepartamento() = " + gerente.getDepartamento());
            ((Gerente) empleado).getDepartamento(); /* Otra forma de convertir */
        } else if ( empleado instanceof Empleados ){
             System.out.println(" pertenece a la clase Empleado");
             //Gerente gerente = (Gerente)empleado;
             // System.out.println(" gerente.getDepartamento() = " + gerente.getDepartamento());
             /* Esta linea dan error por que se puede convertir un objeto padre en un objeto hijo*/
        } else if ( empleado instanceof Object ) {
            System.out.println(" pertenece a la clase Object"   );
        }
        
        
            
    }            
    
}
