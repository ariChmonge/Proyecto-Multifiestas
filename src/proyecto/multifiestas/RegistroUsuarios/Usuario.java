package proyecto.multifiestas.RegistroUsuarios;
public class Usuario {

    //Atributos
    protected String nombre;
    protected String pApellido;
    protected String sApellido;
    protected String nickname;
    protected String contrasena;
    protected String estado;//enumeracion Activo o Inactivo
    
    //Constructor
    public Usuario() {
        this.nombre = "";
        this.pApellido = "";
        this.sApellido = "";
        this.nickname = "";
        this.contrasena = "";
        this.estado = "";
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
