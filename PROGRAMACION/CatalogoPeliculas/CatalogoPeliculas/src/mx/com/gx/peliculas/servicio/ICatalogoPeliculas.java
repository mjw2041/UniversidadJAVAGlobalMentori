
package mx.com.gx.peliculas.servicio;

public interface ICatalogoPeliculas {

  
    String NOMBRE_RECURSO = "pelicula.txt";
    
    void agregarPelicula(String nombre_pelicula);
    
    void listarPeliculas();
    
    void buscarPelicula( String buscar);
    
    void iniciarCatalogoPeliculas();
    
}
