package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEJBImpl implements HolaMundoEJBRemote {

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando Metodo Suma en el servidod");
        return ( a + b);
        
    }
    
}
