package mx.com.gx.peliculas.datos;


import java.util.List;
import mx.com.gx.peliculas.domain.Pelicula;
import mx.com.gx.peliculas.excepciones.*;

public interface AccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> liatar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecursos) throws AccesoDatosEx;

}
