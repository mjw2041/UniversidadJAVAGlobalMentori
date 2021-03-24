
package test;

// import mx.com.globalmentory.*; Se importa todas las clases del paquete
/// import mx.com.globalmentory.Utileria; ( 1 )
/// import static mx.com.globalmentory.Utileria.Imprimir; // importo el metodo estatico unicamente (2)

public class TestUtilerias {
    public static void main(String[] args) {
        /// Utileria.Imprimir("Hola Mundo"); (1) 
        /// Imprimir("Hola Mundo"); /// Es lo hago porque importo el metodo estatico (2)
        /// Nombre completamente calificado, no hace falta usar el Import
        mx.com.globalmentory.Utileria.Imprimir("Hola Mundo"); // (3)
    }
            
    
}
