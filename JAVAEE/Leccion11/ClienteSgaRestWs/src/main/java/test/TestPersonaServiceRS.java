package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestPersonaServiceRS {

    private static final String URL_BASE = "http://localhost:8080/sga-jee-web/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;

    public static void main(String[] args) {
        cliente = ClientBuilder.newClient();

        // Leer una persona ( metodo GET )
        webTarget = cliente.target(URL_BASE).path("/personas");
        // Proporcionamos un IdPersona valido
        persona = webTarget.path("/31").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Personas Recuperdas" + persona);

        //Leer todas las personas (metodo get con readEntity de tipo List<>
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>() {
        });
        System.out.println("/n Personas Recuperadas");
        imprimirPersonas();

        // Agregar una persona ( metodo POST )
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Santiago");
        nuevaPersona.setApellido("Weihmuller");
        nuevaPersona.setEmail("nose@nose.com.ar");
        nuevaPersona.setTelefono("123456");

        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());

        /// Recuperamos la persona agregada
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona Agregada" + personaRecuperada);

        //Modificar la persona mediante el put
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId = "/" + personaModificar.getIdpersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println("response" + response.getStatus());
        System.out.println("persona Modificar" + response.readEntity(Persona.class));
        
        //Eliminar una persona
        Persona personaEliminada = personaRecuperada;
        String patheliminadaId = "/" + personaEliminada.getIdpersona();
        invocationBuilder = webTarget.path(patheliminadaId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("response" + response.getStatus());
        System.out.println("persona Eliminada" + personaEliminada );
        
        
        
        
        
        
        

    }

    private static void imprimirPersonas() {
        for (Persona p : personas) {
            System.out.println("Persona " + p.toString());

        }
    }

}
