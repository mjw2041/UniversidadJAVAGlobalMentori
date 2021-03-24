/*
  Una clase final significa que ninguna clase puede heredar.
  Si creo un objeto de una clase final, esto se transforma en Objeto constante, 
  osea que no se puede cambiar el valor despues de la creacion, pero si se puede 
  cambiar los valores de los atributos. 
  En un metodo significa que el metodo no se puede sobreescribir en la clase hika
  Un atributo definido como public final static, trasforma el atributo en constante
  osea que no se puede modificar el valor, por ejemplo Math.PI, Se define en 
  mayuscula.


*/

package domain;

public final class Persona {
    public final static int MI_CONSTANTE  = 10;
    
    private String nombre;
    
    public final void imprimir (){
        System.out.println("Hola Mundo");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
