/*
 * Cuando una clase no extediende de otra clase automaticamente extendiende de
 * Objexts 
 * En Java unicamente hay herencia simple
 */
package domain;

public class Empleados extends Persona{
    private int idEmpleado;
    private double sueldo;
    static int contadorEmplesado;        
    
    public Empleados(){
        super(); // Esta linea no es requerida se ejecuta aunque no este
        this.idEmpleado = ++Empleados.contadorEmplesado;
    }

    public Empleados(String nombre, double sueldo) {
        this(); /// Se llama al constructor de la misma clase
        this.nombre = nombre;
        // super(nombre);                
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados{idEmpleado=").append(this.idEmpleado);
        ///sb.append(", nombre=").append(this.nombre);  /* Se llama a un solo atributo
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(super.toString()); /* Se llama a todo el metodo */
        sb.append('}');
        return sb.toString();
    }
    
    
                
}
