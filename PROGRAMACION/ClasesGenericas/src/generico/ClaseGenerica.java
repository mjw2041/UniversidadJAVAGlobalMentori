/*
        Grupo generico se coloca entre <>


*/
package generico;

public class ClaseGenerica<T> {
    
    private  T objeto;
    
    public ClaseGenerica ( T Objeto) {
        this.objeto = Objeto;
    }
    
    public void obtenerTipo() {
        System.out.println("El tipo T es: = " + objeto.getClass().getSimpleName());
    }
    
}
