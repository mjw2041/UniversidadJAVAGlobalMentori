package mx.com.gx.ventas;

public class Productos {
    private final int idProductos;
    private String nombre;
    private Double precio;
    private static int contadorProductos;        
    
    private Productos() {
        this.idProductos = ++Productos.contadorProductos;
        
    }
    
    public Productos( String nombre, double precio ) {
         this(); /* Se llama al constructor Privado */
         this.nombre = nombre;
         this.precio = precio;         
    }

    public int getIdProductos() {
        return this.idProductos;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{idProductos=").append(idProductos);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }            
}
