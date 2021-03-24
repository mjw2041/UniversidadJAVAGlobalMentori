package excepciones;

/*public class OperacionExcepcion extends Exception {*/
public class RunTimeException extends RuntimeException {
    public RunTimeException ( String mensaje) {
        super(mensaje);
    }
               
}