
package manejosArchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {
    public static void crarArchivo( String nombreArchivo) {
        File archivo = new File (nombreArchivo); /* Crear un objeto del tipo file */
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); /* Creacion del archivo*/
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
        }
    }    
    
    public static void escribirArchivo( String nombreArchivo, String contenido) {
        File archivo = new File (nombreArchivo); /* Crear un objeto del tipo file */
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
        }
    }    
    
    public static void anexarArchivo( String nombreArchivo, String contenido) {
        File archivo = new File (nombreArchivo); /* Crear un objeto del tipo file */
        try {
            PrintWriter salida = new PrintWriter( new FileWriter( archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado al archivo");
        } catch (FileNotFoundException ex) {
              ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }    
    
    public static void leerArchivo( String nombreArchivo) {
        File archivo = new File (nombreArchivo); /* Crear un objeto del tipo file */
        try {
            BufferedReader entrada = new BufferedReader ( new FileReader (archivo));
            String lectura = entrada.readLine();
            while ( lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
             ex.printStackTrace(System.out);
        } catch (IOException ex) {
             ex.printStackTrace(System.out);
        }
    }    
}
