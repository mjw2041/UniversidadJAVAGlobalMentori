/**
 *   Package Define el paquete donde se ubica la clases
 *   public clss <nombre de la clase> es como se define la clase
 *   tipo <nombre del atributo >
 */
package Clases;

/**
 *
 * @author MWeihmul
 */
public class Persona {
    // Atribito de la clase
    public String nombre;
    public String apellido;
    
    // Metodo de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
    }
    
}
