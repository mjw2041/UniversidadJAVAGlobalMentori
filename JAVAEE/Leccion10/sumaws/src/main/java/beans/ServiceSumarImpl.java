
package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServiceSumarWS")
public class ServiceSumarImpl implements ServiceSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }    
}
