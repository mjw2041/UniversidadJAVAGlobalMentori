package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(50, 50);
        System.out.println("resultado (int) " + resultado);
        
        double resultadoD = Operaciones.sumar(23.23, 50);
        System.out.println("resultadoD (Double) " + resultadoD);
        
        var resultado3 = Operaciones.sumar(23, 50L);
        System.out.println("resultadoD (Double) " + resultadoD);
    }
    
}
