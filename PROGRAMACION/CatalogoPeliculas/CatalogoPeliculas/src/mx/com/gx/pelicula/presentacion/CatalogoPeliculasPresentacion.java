package mx.com.gx.pelicula.presentacion;

import java.util.Scanner;
import mx.com.gx.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gx.peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas  catalogo =  new CatalogoPeliculasImpl();
        
        System.out.println("Elige una opcion: \n " 
                + "1. Iniciar Catalogo de peliculas  \n "
                + "2. Agregar peliculas \n "
                + "3. Listar peliculas \n"
                + " 4. Buscar pliculas \n "
                + "0. Salir ");
        opcion =  Integer.parseInt(scanner.nextLine()); 
        
        switch (opcion){
            case 1: 
                catalogo.iniciarCatalogoPeliculas();
                break;
            case 2: 
                System.out.println("Introduce el nombre de la pelicula");
                var nombrePelicula = scanner.nextLine();
                catalogo.agregarPelicula(nombrePelicula);
                break;
            case 3:     
                catalogo.listarPeliculas();
                break;
            case 4:
                System.out.println("Introduce el nombre de la pelicula");
                var buscar = scanner.nextLine();
                catalogo.buscarPelicula(buscar);
                break;
           case 0:     
                 System.out.println("Hasta Pronto ! .....");
                 break;
           default:      
                System.out.println("Opcion no reconocida");
                break;
        }
        
    }
}
