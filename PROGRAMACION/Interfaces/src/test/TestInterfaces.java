/*
   Interfaces son clases abstractas para trasladar el comportamiento ( metodos ) a 
   la clase hija

*/
package test;
    
import accesoDatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos.listar();
        eliminar(datos);
        System.out.println(" +++++++++++++++++ ");
        
        System.out.println("IAccesoDatos.MAX_REGISTRO = " + IAccesoDatos.MAX_REGISTRO);
        
        System.out.println(" +++++++++++++++++ ");
        
        datos = new ImplementacionOracla();
        datos.listar();
        eliminar(datos);
    }
    
    public static void eliminar ( IAccesoDatos datos ) {
        datos.eliminar();
    }
    
}
