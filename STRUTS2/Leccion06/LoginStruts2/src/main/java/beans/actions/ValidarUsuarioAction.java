
package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="login", type="redirectAction")
})

public class ValidarUsuarioAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    private String usuario;
    private String password;
    
    @Action("validarUsuario")
    @Override
    public String execute(){        
        if ( "admin".equals(this.usuario)) {
            log.info("Entro en SUCCESS");        
            return SUCCESS;
        } else {
            log.info("Entro en INPUT");        
            return INPUT;
        }                    
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void  setPassword( String password){
        this.password = password;
    }
    
}
