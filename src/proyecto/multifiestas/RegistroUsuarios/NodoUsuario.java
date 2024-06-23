package proyecto.multifiestas.RegistroUsuarios;

public class NodoUsuario {
    //Atributos Nodo
    private Usuario usuario;
    private NodoUsuario siguiente;
    
    //Constructor
    public NodoUsuario() {
        this.siguiente = null;
    }

    //Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
}