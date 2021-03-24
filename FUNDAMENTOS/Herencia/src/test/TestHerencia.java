package test;

import domain.Cliente;
import domain.Empleados;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
      Empleados empleado1 = new Empleados("MAXI", 100);
      System.out.println("empleado = " + empleado1);
      var fecha = new Date();              
      Cliente Cliente1  = new Cliente ( "Caro", true, fecha, 'F', 18, "Paraguay 726");  
      System.out.println("Cliente1 = " + Cliente1);
    };
    
}
