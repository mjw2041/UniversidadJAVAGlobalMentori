package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        /* Insertando Persona */
        Persona personaINS = new Persona("Carlos", "Esparza", "cesparza@email.com", "123456789");
        personaDAO.insertar(personaINS);

        /* Actualiza Persona */
        Persona personaUPD = new Persona(1, "Carolina", "Perret", "cesparza@email.com", "123456789");
        personaDAO.actualizar(personaUPD);

        /* Eliminar Persona */
        Persona personaDLT = new Persona(7);
        personaDAO.eliminar(personaDLT);

        /* Mostrar los Registros*/
        List<Persona> personas = personaDAO.seleccionar();
        /* Por medio de uan funcion de flecha */
        System.out.println(" Forma Funcion de Flecha ");
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
            /* Forma comun */
        });
        System.out.println(" Forma Comun ");
        for (Persona persona_1 : personas) {
            System.out.println("persona = " + persona_1);
        }

    }

}
