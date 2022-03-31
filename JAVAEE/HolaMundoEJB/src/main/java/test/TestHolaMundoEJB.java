package test;
/*

import beans.HolaMundoEJBRemote;
import javax.naming.*;

public class TestHolaMundoEJB {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB al cliente\n");

        try{
            Context jndi = new InitialContext();            
            HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            int resultado = holaMundoEJB.sumar(5, 4);
            System.out.println("resultado = " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }       

    }}
*/

import beans.HolaMundoEJBRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            System.out.println("0");
            Context jndi = new InitialContext();
            System.out.println("1");
            HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            System.out.println("2");
            /*int resultado = holaMundoEJB.sumar(5, 3);*/
            System.out.println("3");
            /*System.out.println("Resultado EJB suma 5+3:" + resultado);*/
            System.out.println("4");
        }
        catch(NamingException e){
            System.out.println("Paso por el error");
            e.printStackTrace(System.out);
        }
    }
}
