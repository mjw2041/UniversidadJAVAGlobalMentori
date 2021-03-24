
package mx.com.gx.ventas.test;

import mx.com.gx.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Productos producto1 = new Productos("Camisas", 50.00);
        Productos producto2 = new Productos("Pantalon", 100.00);
        
        System.out.println("Se creo el objeto ");
        Orden orden = new Orden();        
        orden.mostrarOrden();
        
        System.out.println("Le agrege ´producto1 y producto2");
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);        
        orden.mostrarOrden();        
        
        System.out.println("Vuelvo a crear el objeto");
        orden = new Orden();
        orden.mostrarOrden();
        
    }
}
