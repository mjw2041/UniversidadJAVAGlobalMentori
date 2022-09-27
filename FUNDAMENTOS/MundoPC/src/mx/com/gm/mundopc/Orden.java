package mx.com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORA = 10;
    private int contadorComputadoras;
    
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORA];
    }
    
    public void agregarComputadora ( Computadora computadora) {
        if ( this.contadorComputadoras < Orden.MAX_COMPUTADORA) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has superado el limite" + Orden.MAX_COMPUTADORA);
        }        
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadora de la orden");
        for ( int i =0; i < this.contadorComputadoras; i++) {
                System.out.println(this.computadoras[i]);
        }
    }
}
