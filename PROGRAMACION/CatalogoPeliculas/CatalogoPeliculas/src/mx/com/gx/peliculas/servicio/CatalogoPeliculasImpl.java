package mx.com.gx.peliculas.servicio;

import mx.com.gx.peliculas.datos.*;
import mx.com.gx.peliculas.domain.Pelicula;
import mx.com.gx.peliculas.excepciones.AccesoDatosEx;


public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        
        this.datos = new AccesoDatosImp();
    }
    
    @Override
    public void agregarPelicula(String nombre_pelicula) {
        Pelicula pelicula = new Pelicula(nombre_pelicula);
        boolean anexar = false;        
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de los datos");
            ex.printStackTrace(System.out);
        }
                
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.liatar(NOMBRE_RECURSO);
            for ( var  pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de los datos");
            ex.printStackTrace(System.out);
        }
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de los datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if ( datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de los datos");
            ex.printStackTrace(System.out);
        }
    }
    
}
