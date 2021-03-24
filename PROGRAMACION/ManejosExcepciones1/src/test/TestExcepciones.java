/**
 *  Manejo de excepciones 
 *    try --> comienzo del bloque
 *    catch( Exception e) captura del error
 *    e.printStackTrace(System.out) --- Imprimir la pila por pantalla
 *    e.getMessage() ---> se utiliza para imprimir el mensaje
 *    throw new OperacionExcepcion --- Voy a mandar el error a OperacionExcepcion
 *    throws OperacionExcepcion --- posiblemente mande el error
 *    finally se puede poner ordenes que se deban ejecutar si ocurren un error 
 *    se pueden atrapar varios tipo de error en catch anidados pero el ultimo 
 *    si o si tiene que ser el exception.
 *    Rountimeexception --- no necesita el bloque try catch
 */
package test;

import aritmetica.Aritmetica;
import aritmetica.Aritmetica2;
import excepciones.OperacionExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 0 / 0;
        }  catch( Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);            
        }                   
        System.out.println("resultado = " + resultado);
        
        System.out.println(" +++++ Exception  ++++++ ");
        try{ 
            Aritmetica.division(0, 0);
        } catch ( OperacionExcepcion e) {
             System.out.println("Ocurrio un error de tipo OperacionExcepcion");       
             System.out.println("e.getMessage = " + e.getMessage());
        
        } catch( Exception e) {  /* Bloque se necesita para la excepciones exception */
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);            
            System.out.println("e.getMessage = " + e.getMessage());
        } finally {
            System.out.println(" ********** Mensaje finally ****** ");
        }       
        System.out.println("resultado = " + resultado);

        
        System.out.println(" +++++ Runtime Exception  ++++++ ");        
        Aritmetica2.division(0, 0);
        System.out.println("resultado = " + resultado);
        
        
    }        
}
