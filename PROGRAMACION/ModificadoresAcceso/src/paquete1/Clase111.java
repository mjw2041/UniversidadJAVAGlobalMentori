
package paquete1;

public class Clase111 {    
    private String atributoPrivado = "AtributoDefault";    
        
    private Clase111() {
        System.out.println("**** Constructor Private **** ");    
    }
    
    public Clase111( String mensaje) {
        this();
        System.out.println("**** Constructor Publico **** ");    
        this.atributoPrivado = "Modificacion atributo privado";                
    }
            
     private void metodoPrivado () {
        System.out.println(" Metodo Privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
                           
}    

