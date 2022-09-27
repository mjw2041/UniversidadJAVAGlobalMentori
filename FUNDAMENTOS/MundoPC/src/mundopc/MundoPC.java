
package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
            Monitor monitorHP = new Monitor("HP", 14);
            Teclado tecladoHP = new Teclado("bluetooth", "HP");
            Raton   ratonHP   = new Raton("bluetooth", "HP");
            Computadora  computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
            
            Monitor monitorGamer = new Monitor("Gamer", 34);
            Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
            Raton   ratonGamer   = new Raton("bluetooth", "Gamer");
            Computadora  computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
            
            Orden orden = new Orden();
            orden.agregarComputadora(computadoraHP);                       
            orden.agregarComputadora(computadoraGamer);            
            orden.mostrarOrden();
    }
    
}
