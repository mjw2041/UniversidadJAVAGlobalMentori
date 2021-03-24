
package beans;

public class Rectagulo {
    
    private int base;
    private int altura;

    public Rectagulo() {
    }

    public Rectagulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
       
    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea () {
        return this.base * this.altura;
    }
    
    
    
    
    
}
