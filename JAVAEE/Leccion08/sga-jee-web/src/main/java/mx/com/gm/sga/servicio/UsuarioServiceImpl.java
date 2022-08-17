
package mx.com.gm.sga.servicio;

import java.util.List;
import javax.inject.Inject;
import mx.com.gm.sga.datos.UsuarioDAO;

import mx.com.gm.sga.domain.Usuario;


public class UsuarioServiceImpl implements UsuarioService {
    @Inject
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {
         return usuarioDAO.findAllUsuario();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDAO.findUsuarioById(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
         usuarioDAO.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
    }
    
}
