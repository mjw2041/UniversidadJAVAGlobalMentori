/**
 * 
 *   Un metodo abstracto es un metodo que no tiene implementacion dentro de la clase.
 *   cuando se define esto la clase tambien tiene que ser abstracta.
 *   De una clase abstracta no se puede definir objetos.
 * 
 */
package domain;

public class TestClaseAbstracta {
    public static void main(String[] args) {
        //FiguraGeometrica = new FiguraGeometrico(); /* Esto no se puede hacer */
        
        FiguraGeometrica  figura = new Rectangulo("Rectangula");
        figura.dibujar();
    }
    
}
