
package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Usuario;

public interface UsuarioDAO {

    public List<Usuario> findAllUsuario();
  
    public Usuario findUsuarioById(Usuario persona);
         
    public void insertUsuario ( Usuario persona);
    
    public void updateUsuario ( Usuario persona);
    
    public void deleteUsuario ( Usuario persona);
}
