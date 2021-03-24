package domain;


public class Usuario {
    private int idUsuario;
    private String usuarioNombre;
    private String password;    
    
    public Usuario(){
        
    }

    public Usuario(int idUsuario, String usuarioNombre, String password) {
        this.idUsuario = idUsuario;
        this.usuarioNombre = usuarioNombre;
        this.password = password;
    }

    public Usuario(String usuarioNombre, String password) {
        this.usuarioNombre = usuarioNombre;
        this.password = password;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioNombre() {
        return this.usuarioNombre;
    }

    public void setUsuario(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{idUsuario=").append(idUsuario);
        sb.append(", usuarioNombre=").append(usuarioNombre);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
    
    
    
                
}



