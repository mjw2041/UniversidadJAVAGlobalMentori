
package accesoDatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10; /* los campos en la interfaces son SIEMPRE constantes */
    
    void insertar(); /* Es abstracto, no lleva cuerpo */
    
    void listar(); 
    
    void actualizar();
    
    void eliminar();
}
