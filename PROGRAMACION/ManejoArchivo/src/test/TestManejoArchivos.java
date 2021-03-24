/*
     Si quiero generar mi archivo en una ruta debo agregar la //
     ej, c://carpeta//prueba.txt


*/


package test;

import manejosArchivos.*;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        String nombreArchivo = "Prueba.txt";
        // ManejoArchivos.crarArchivo(nombreArchivo);        
        ManejoArchivos.escribirArchivo(nombreArchivo, "Hola Mundo");
        ManejoArchivos.anexarArchivo(nombreArchivo, "Adios");
        ManejoArchivos.leerArchivo(nombreArchivo);
    }
    
}
