
package domain;


public class Escritor extends Empleados{
    
    final TipoEscritura tipoEscritura; 
    
    public Escritor( String nombre, double sueldo, TipoEscritura tipoescritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoescritura;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + " Tipo Escritura " + tipoEscritura.getDescripcion(); 
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + " " + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
            
    
}
