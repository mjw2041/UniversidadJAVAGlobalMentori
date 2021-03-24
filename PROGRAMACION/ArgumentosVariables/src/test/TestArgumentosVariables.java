
package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        System.out.println("Imprimir Numero");
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2,2,5);
        
        System.out.println("varios parametros");
        variosParametros("Hola Mundo", 1,2,3,4);
    }
    
    /*
      El parametro variable debe ser el ultimo, se guarda en un string      
    */
    public static void variosParametros( String nombre, int... numeros ) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    public static void imprimirNumeros( int... numeros ) {
        for (int i = 0; i < numeros.length  ; i++) {    
            /*System.out.println("elemento = " + "[" + i "] " + numeros[i]);*/
            System.out.println("elemento = " + numeros[i]);
            
        }
    }
    
}
