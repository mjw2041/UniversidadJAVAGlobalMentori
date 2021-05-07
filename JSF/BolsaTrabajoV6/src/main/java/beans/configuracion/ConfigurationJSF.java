
package beans.configuracion;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

@FacesConfig (
        // Activa el CDI Build - in Beans
          version = FacesConfig.Version.JSF_2_3
)
@ApplicationScoped
public class ConfigurationJSF {
    
    
}
