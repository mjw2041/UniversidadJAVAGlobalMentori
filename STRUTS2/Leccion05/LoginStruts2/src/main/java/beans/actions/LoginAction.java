    package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    @Override
    public String execute(){
        log.info("El usuario es " + this.usuario);        
        log.info("El password es " + this.password);        
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
