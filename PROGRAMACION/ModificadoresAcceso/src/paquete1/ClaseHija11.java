
package paquete1;


public class ClaseHija11 extends Clase11{    
    public ClaseHija11(){
        super(); /* Accedo al constructor protected de la clase padre */
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("this.atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }    
}
