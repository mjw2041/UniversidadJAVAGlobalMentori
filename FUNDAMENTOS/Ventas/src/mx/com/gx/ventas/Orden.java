
package mx.com.gx.ventas;

public class Orden {
    private int idOrden;
    private Productos productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS  = 10;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Productos[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto ( Productos producto) {
        if ( this.contadorProductos < Orden.MAX_PRODUCTOS ) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ingresop la cantidad maxima de productos = " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal () {
        double total = 0;
        for ( int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }        
        return total;        
    }
    
    public void mostrarOrden(){
        System.out.println("this.idOrden = " + this.idOrden);
        System.out.println("Total Orden; $" + this.calcularTotal() );
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
            /* Se ejecuta el metodo toString */
        }
    }
        
}
