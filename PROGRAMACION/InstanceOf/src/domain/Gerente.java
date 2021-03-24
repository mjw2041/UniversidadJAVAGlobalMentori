
package domain;

public class Gerente extends Empleados {
    private String departamento;
    
    public Gerente ( String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    };   
    
    @Override  /* Le indica al compilador que la funcion de abajo es un sobreescritura */
    public String obtenerDetalle () {
        /* return ( "Nombre: " +  this.nombre + " Sueldo: " + this.sueldo + " Departamento: " + this.departamento  );*/
        return super.obtenerDetalle() + " Departamento: " + this.departamento; 
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
