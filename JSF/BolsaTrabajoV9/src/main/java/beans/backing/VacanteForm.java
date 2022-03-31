package beans.backing;

import beans.helper.ColoniaHelper;
import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;
    private boolean comentarioEnviado;

    @Inject
    private ColoniaHelper coloniaHelper;

    public VacanteForm() {
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;

    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public ColoniaHelper getColoniaHelper() {
        return coloniaHelper;
    }

    public void setColoniaHelper(ColoniaHelper coloniaHelper) {
        this.coloniaHelper = coloniaHelper;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Juan")) {
            System.out.println("Hola");
            if (this.candidato.getApellido().equals("Perez")) {
                String msg = "Gracias pero Juan Perez ya trabaja con nosotros";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            return "exito";
        } else {
            return "fallo";
        }
    }

    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        int nuevoCodigoPostal = ((Long) valueChangeEvent.getNewValue()).intValue();
        UIInput coloniaidInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:coloniaid");
        int nuevacoloniaId = this.coloniaHelper.getColoniaIdPorCodigoPostal(nuevoCodigoPostal);
        coloniaidInputText.setValue(nuevacoloniaId);
        coloniaidInputText.setSubmittedValue(nuevacoloniaId);

        UIInput ciudadInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
        String nuevaCiudad = "Rosario";
        ciudadInputText.setValue(nuevaCiudad);
        ciudadInputText.setSubmittedValue(nuevaCiudad);

        facesContext.renderResponse();

    }

    public void ocultarComentario(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }
}
