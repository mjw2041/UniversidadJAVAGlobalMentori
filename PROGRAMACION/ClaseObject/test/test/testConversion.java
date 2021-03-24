/**
 *   Se puede almacenar un objeto de la clase hija en un variable de la clase padre 
 *   se puede hacer por el polimorfismo.
 *  Cuando convierto un objeto de la clase padre a la clase hija se llama downcasting
 *   viseversa upcasting 
 *  Desde un objeto de la clse padre no puede acceder los metodoes de la clase hija,
 *  esto se resuelve con la conversion
*/

package test;

import domain.*;

public class testConversion {
    public static void main(String[] args) {
        Empleados empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);               
        
        System.out.println("empleado = " + empleado);
        empleado.toString();
        // empleado.getDescripcion(); // Es no se puede hacer //
        ((Escritor)empleado).getTipoEscritura(); /* Esto se llama downcasting */
        
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        Empleados empleados2 = escritor; /* Esto es el upcasting y se realiza en forma automatica */        
        System.out.println(" empleados2.obtenerDetalle() = " + empleados2.obtenerDetalle());
                
       
    }
}
