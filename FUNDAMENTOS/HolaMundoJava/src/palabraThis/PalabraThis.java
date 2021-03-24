package palabraThis;
/**
 *  Si mando a imprimir la palabra this, se imprime todo el objeto
 *  Al momente de construir un objeto se esta llamando en forma automatica al constructor 
 *   de la clase padre ( Object ) por medio del comando super(). 
 *  @author MWeihmul
 *  Desde el comando new agregandole el . puedo acceder a los metodos de la clase
 */

public class PalabraThis {
    public static void main(String[] args) {
        Persona  persona = new Persona( "Juan", "Perez");
        System.out.println("persona ( identificador de memoria ) = " + persona);
        System.out.println("persona.nombre ( atributo nombre )  = " + persona.nombre );
        System.out.println("persona.apellido ( atributo apellido )  = " + persona.apellido );
             
    }
    
}

class Persona {
    String nombre;
    String apellido;
    
    Persona ( String pnombre, String papellido) {
        this.nombre = pnombre;
        this.apellido = papellido;
        System.out.println("this ( se imprime todo el objeto con this) = " + this); 
        new Imprimir().imprimir(this);
    }
         
}

class Imprimir {
    public void imprimir ( Persona persona) {
        System.out.println("Imprimir persona desde imprimir = " + persona);
        System.out.println("imprimir this desde imprimir = " + this);
    }
}


