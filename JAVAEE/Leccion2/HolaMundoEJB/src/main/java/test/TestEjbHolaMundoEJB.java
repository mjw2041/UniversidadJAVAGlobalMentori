
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;


public class TestEjbHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMuntoEJB;
            holaMuntoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
                                                             
            int resultado = holaMuntoEJB.sumar(1,2);            
            System.out.println("Resultado suma " + resultado);
            
        }catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
