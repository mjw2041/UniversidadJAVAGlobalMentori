
package paquete2;

import paquete1.Clase1;


public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super("Hola"); /* Accedo al constructor protected de la clase padre */
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("this.atributoProtected = " + this.atributoProtected);
        this.metodoProtected("Hola");
    }
    
}
