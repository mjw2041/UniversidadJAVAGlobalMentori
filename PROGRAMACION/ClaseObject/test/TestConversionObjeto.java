/**
 *   Cuando convierto un objeto de la clase padre a la clase hija se llama downcasting
 *   viseversa upcasting 
 *   
 */

import domain.Empleados;
import domain.Escritor;
import domain.TipoEscritura;


public class TestConversionObjeto {
    public static void main(String[] args) {
        Empleados empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);               
    }
}
