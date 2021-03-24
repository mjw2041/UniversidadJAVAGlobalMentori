/**
 *  El modificador de acceso 
 *     public indica que se puede usar en cualquier lado en forma directa.
 *     protected se puede usar solo desde clase hija, o dentro de la 
 *     clase
 *     default o package, es igual al protected salvo que la clase hija 
 *     tiene que estar en el mismo paquete
 *     private todos los metodos y atributos solo se puede acceder desde la misma clase, 
 *     no es visible para ninguna otra clase.
 *   
 */
package paquete1;

public class Clase1 {
    public String atributoPublico = "AtributoPublico";    
    protected String atributoProtected = "AtributoProtected"; 
    
    public Clase1() {
        System.out.println("**** Constructor Publico **** ");    
    }
    
    protected Clase1( String Mensaje) {
        System.out.println("**** Constructor Protected **** ");
    
    }
    
    public void metodoPublico () {
        System.out.println(" Metodo Publico");
    }
    
    protected void metodoProtected ( String mensaje) {
        System.out.println(" Metodo Protected");
    }
}
