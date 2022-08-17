
package testClienteWS;

import clientews.servicio.*;

public class TestServicioSumarWS {
    public static void main(String[] args) {
          ServiceSumarWS servicioSumar = new ServiceSumarImplService().getServiceSumarImplPort();
          System.out.println("Ejecutando Servicio sumar WS");
          int x = 6;
          int y = 3;
          int resultado = servicioSumar.sumar(x, y);
          System.out.println("Resultado:" + resultado);
          System.out.println("Fin servicio sumar WS");
    }
    
}
