
package domain;


public class Empleados {
    protected String nombre;
    protected double sueldo;
    
    public Empleados ( String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerDetalle () {
        return ( "Nombre: " +  this.nombre + " Sueldo: " + this.sueldo  );
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
    
}

