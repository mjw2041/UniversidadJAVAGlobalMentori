    package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class MostrarLoginAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(MostrarLoginAction.class);
    
    private String usuario;
    private String password;
    
    @Override
    public String execute(){
        log.info("El usuario es " + this.usuario);        
        log.info("El password es " + this.password);        
        return SUCCESS;
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
    
    public String getTitulo() {
        /*return getText("form.titulo"); */
         return getText("form.usuario"); 
    }
    
    public String getTituloUsuario() {
        return getText("form.usuario"); 
    }
/*    
    public String getFormUsuario(){
        return getText("form.usuario");
    }
*/    
    public String getFormPassword(){
        return getText("form.password");
    }
    
    public String getBoton(){
        return getText("form.boton");
    }
    
    public String getValores(){
        return getText("form.valores");
    }
           
}
