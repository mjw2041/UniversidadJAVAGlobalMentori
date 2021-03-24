package test;

import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuario {

    public static void main(String[] args) {
        
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        
        Usuario usuarioINS = new Usuario ( "Carlos", "123456");
        usuarioDAO.insertar(usuarioINS);
        
        Usuario usuarioUPD = new Usuario ( 1, "Maxi", "123456");
        usuarioDAO.actualizar(usuarioUPD);
        
        /* Eliminar Usuario */
        Usuario usuarioDLT = new Usuario(2);
        usuarioDAO.eliminar(usuarioDLT);

        
        
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        /* Por medio de uan funcion de flecha */
        System.out.println(" Forma Funcion de Flecha ");
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
            /* Forma comun */
        });
        System.out.println(" Forma Comun ");
        for (Usuario usuario : usuarios) {
            System.out.println("persona = " + usuario);
        }

    }

}
