/**
 *   El valor null del integer es el 0, boolean es el false
 *   Las variables dentro del metoso son locales al metodo
 *   public indica que el metodo es publico, puede ser ussdo dentro de proyecto. 
 *   void se uas para determinar que un metodo no devuelve valores
 *   this ---> es una variable que se crea automaticamente y apunta al objeto
 *   Los metodos constructores tiene el mismo nombre que la clase
 *   Por defecto el compilador agrega un constructor vacio al modelo
 *   El compilador crea el constructor vacio unicamente si la clase no tiene 
 *   constructor
 * 
 *   Alcance de las variables 
 *   var se utiliza para declarar variables locales, no se pueden usar como 
 *       deficion de atributos 
 * 
 *   system.gc() --- > limpia la memoria heap de objetos que no se usan
 *   Memoria heap ---> almacena los objetos
 *   Memoria STACK --> almacena la refencia a los objetos o las variable locales
 */
package operaciones;

/**
 *
 * @author MWeihmul
 */
public class Aritmetica {
    // Atributos
    int a, b;
    
    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor vacio"); 
        this.a = 0; 
        // esto es opcional dado que cuando crea el objeto los atributos int los genera con 0
        this.b = 0;
    }
    /**
     *  Sobreescribiendo los contructores
     *  
     */
    public Aritmetica( int arg1) {
        System.out.println("Ejecutando Constructor con parametro"); 
        this.a = arg1;
        this.b = arg1;
    }
    
     public Aritmetica( int arg1, int arg2) {
        System.out.println("Ejecutando Constructor con parametro"); 
        this.a = arg1;
        this.b = arg2;
    }
    
    // Metodo
    public void sumar () {
        // Cuerpos 
        int resultado = a + b;    
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno() {        
        return ( this.a + this.b );        
    }
    
    public int sumarConArgumento ( int arg1, int arg2) {
        this.a = arg1; 
        this.b = arg2;
        
        return this.sumarConRetorno();
    }
} 
