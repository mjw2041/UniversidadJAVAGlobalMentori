package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServicioRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando la llamada desde el EJB desde el cliente");

        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());

        try {
            Context jndi = new InitialContext();
            PersonaServicioRemote personaService = (PersonaServicioRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");

            List<Persona> personas = personaService.listarPersonas();

            for (Persona p : personas) {
                System.out.println("persona:" + p);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");

        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
