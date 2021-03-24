/**
 *  En un constructor se debe primero llamar al constructor padre con con 
 *  comandso super
 */

package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip ;
    private static int contadorCliente;            
    
    public Cliente( String nombre, boolean vip, Date fechaRegistro, char genero, int edad ,String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++ Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    } 

    public int getIdCliente() {
        return idCliente;
    }

        
    public Date getfFechaRegistro() {
        return fechaRegistro;
    }
    
    public void setFechaRegistro( Date fechaRegitro) {
        this.fechaRegistro = this.fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

   
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(super.toString()); /* Se llama a todo el metodo */
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
    
   
                
}


