package mx.com.gm.sga.cliente.jpql;

import java.util.*;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //1. Consulta de todoa los objetos de tipo Persona
        log.debug("\n1. Consulta de todas las personas");
        jpql = "SELECT p FROM Persona p";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);

        //2. Consulta de la Persona con id = 34
        log.debug("\n2. Consulta de la Persona con id = 34");
        jpql = "SELECT p FROM Persona p WHERE p.idpersona = 34";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        log.debug(persona);

        // 3. Consulta de la Persona por nombre
        log.debug("\n3. Consulta de la Persona con nombre");
        jpql = "SELECT p FROM Persona p WHERE p.nombre = 'Carolina'";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);

        // 4. Consulta de datos individuales. se crea un arreglo(tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales. se crea un arreglo(tupla) de tipo object de 3 columnas.");
        jpql = "SELECT p.nombre as Nombre, p.apellido as Apellido, p.email as EMAIL FROM Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            log.debug("nombre " + nombre + " apellido " + apellido + " email " + email);
        }
        // 5.Obtiene el obejeto Persona y el id, se crea un objeto de tipo Object con 2 columnas
        log.debug("\n5.Obtiene el obejeto Persona y el id, se crea un objeto de tipo Object con 2 columnas");
        jpql = "SELECT p , p.idpersona as EMAIL FROM Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();

        while ( iter.hasNext()) {
            tupla = (Object[]) iter.next();            
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            log.debug("Persona " + persona);
            log.debug("id Persona " + idPersona);
        }
        // 6.Oonsulta de todas las personas
        log.debug("\n6.Oonsulta de todas las personas");
        jpql = "SELECT new mx.com.gm.sga.domain.Persona(p.idpersona) FROM Persona p";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        // 7. Regresa el valor minimo y maximo de idPersona y la cantidad de Registros ( scaler Result )
        log.debug("\n7. Regresa el valor minimo y maximo de idPersona y la cantidad de Registros ( scaler Result )");
        jpql = "SELECT min(p.idpersona) as Minimo, MAX(p.idpersona) as Maximo, COUNT(p.idpersona) as cintador FROM Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        
        while ( iter.hasNext()) {
            tupla = (Object[]) iter.next();
            Integer idMax = ( Integer ) tupla[0];
            Integer idMin = ( Integer ) tupla[1];
            Long cantidad = ( Long ) tupla[2];
            log.debug("Maximo " + idMax  + " Minimo " + idMin + " Cantidad " + cantidad );
                        
        // 8.Cuenta los nombre de las persona que son distintos
        log.debug("\n8.Cuenta los nombre de las persona que son distintos");
        jpql = "SELECT COUNT(DISTINCT p.nombre )FROM Persona p";
        Long cantidadNombre = (Long) em.createQuery(jpql).getSingleResult();
        log.debug("Cantidad de nombres distintos " + cantidadNombre);
        }
        
        // 9.Contatena y cambia a Mayuscula el nombre y apellido
        log.debug("\n9.Contatena y cambia a Mayuscula el nombre y apellido");
        jpql = "SELECT CONCAT(p.nombre, ' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        
        for ( String nombreCompleto: nombres) {
            log.debug("Nombre Completo " + nombreCompleto.toUpperCase()   );
        }
        
        /// 10. Obtiene el objeto persona con el id igual al parametro proporcionado
        log.debug("\n10. Obtiene el objeto persona con el id igual al parametro proporcionado");
        int idPersona = 34;
        jpql = "SELECT p FROM Persona p WHERE p.idpersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", 34);
        persona = (Persona) q.getSingleResult();
        log.debug("Persona id 34 "  + persona );
        
        /// 11. Obtiene las personas que contienen una letra "a" en el nombre, sin importar si el mayuscula o minuscula
        log.debug("\n11. Obtiene las personas que contienen una letra \"a\" en el nombre, sin importar si el mayuscula o minuscula");
        jpql = "SELECT p FROM Persona p WHERE UPPER(p.nombre) LIKE UPPER(:parametroString)";
        String parametroString = "%a";
        q = em.createQuery(jpql);
        q.setParameter("parametroString", parametroString);
        personas = q.getResultList();
        mostrarPersonas(personas);                              
        
        // 12. Uso de beetween 
        log.debug("\n12. Uso de beetween");
        jpql = "SELECT p FROM Persona p WHERE p.idpersona BETWEEN 33 AND 34";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        // 13. Uso del ordenamiento ( ORDER )
        log.debug("\n13. Uso del ordenamiento ( ORDER )");
        jpql = "SELECT p FROM Persona p WHERE p.idpersona > 1 ORDER BY p.nombre DESC, p.apellido DESC";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        // 14. Uso de Subquery 
        log.debug("\n14. Uso de Subquery ");
        jpql = "SELECT p FROM Persona p WHERE p.idpersona in ( SELECT MAX(p1.idpersona) FROM Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        // 15. Uso del join con lazy loading 
        log.debug("\n15. Uso del join con lazy loading  ");
        jpql = "SELECT u FROM Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
        
        // 16. Uso del left join con eager loading 
        log.debug("\n16. Uso del left join con eager loading ");
        jpql = "SELECT u FROM Usuario u left join fetch u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
    }                   

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            log.debug(persona);
        }
    }    
    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            log.debug(usuario);
        }    
    }
}
