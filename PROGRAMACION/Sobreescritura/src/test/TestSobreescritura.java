/**
 *  Polimorfismo es diferentes comportamientos
 */
package test;

import domain.Empleados;
import domain.Gerente;


public class TestSobreescritura {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente ( "Maxi", 300, "sistemas");
        System.out.println("gerente.obtenerDetalle() = " + gerente.obtenerDetalle());;
        System.out.println(" **** Polimorfismo **** " + gerente.obtenerDetalle());;
        Empleados empleado = new Empleados("Oscar", 54000);
        // System.out.println("empleado.obtenerDetalle() = " + empleado.obtenerDetalle());;
        imprimir(empleado);
        Gerente gerente1 = new Gerente("Caro", 58000, "Contabilidad");
        // System.out.println("gerente1.obtenerDetalle() = " + gerente1.obtenerDetalle());;
        imprimir(gerente1);
    }    
    public static void imprimir ( Empleados empleado) {
            System.out.println("empleado  = " + empleado.obtenerDetalle() );
    }            
    
}
