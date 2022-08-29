package mx.com.gm.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import mx.com.gm.data.PersonaDAO;
import mx.com.gm.domain.Persona;

@Stateless
@Path("/personas")
public class PersonaServiceRS {

    @Inject
    private PersonaDAO personaDAO;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Persona> listarPersona() {
        List<Persona> personas = personaDAO.encontrarTodasPersonas();
        System.out.println("Personas" + personas);
        return personas;
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}") //hace referencia al path: /personas/{id}, ej. /personas/1
    public Persona encontrarPersona(@PathParam("id") int id) {
        Persona persona = personaDAO.encontrarPersona(new Persona(id));
        System.out.println("Persona" + persona);
        return persona;
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona) {
        personaDAO.insertarPersona(persona);
        System.out.println("Persona agregada" + persona);
        return persona;
    }

    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}") //hace referencia al path: /personas/{id}, ej. /personas/1
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada) {
        Persona persona = personaDAO.encontrarPersona(new Persona(id));
        if (persona != null) {
            personaDAO.actualizarPersona(personaModificada);
            System.out.println("persona modificada" + personaModificada);
            return Response.ok().entity(personaModificada).build();
        } else {
            return Response.status(Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}") //hace referencia al path: /personas/{id}, ej. /personas/1
    public Response eliminarPersona(@PathParam("id") int id) {
        personaDAO.eliminarPersona(new Persona(id));
        System.out.println("persona eliminada con el id " + id);
        return Response.ok().build();
    }
}
