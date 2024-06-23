package proyecto.multifiestas.RegistroUsuarios;

import proyecto.multifiestas.RegistroUsuarios.NodoUsuario;
import javax.swing.JOptionPane;

public class PilaUsuarios {
    //Atributos
    private NodoUsuario top;
    
    //Constructor
    public PilaUsuarios() {
        this.top = null;
    }
    
    //Verificar si hay nodos en la pila de usuarios
    public boolean esVacia(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
    
    //Agregar usuuario a la pila
    public void agregarUsuario(){
        //Usuario dentro de NodoUsuario
        Usuario u = new Usuario();
        
        //Solicitar atributos de nuevo usuario
        u.setNombre(JOptionPane.showInputDialog(null,
                "Digite el nombre del usuario a registrar:"));
        u.setpApellido(JOptionPane.showInputDialog(null,
                "Digite el primer apellido del usuario a registrar:"));
        u.setsApellido(JOptionPane.showInputDialog(null,
                "Digite el segundo apellido del usuario a registrar:"));
        u.setNickname(JOptionPane.showInputDialog(null,
                "Digite el nombre de usuario del usuario a registrar:"));
        u.setContrasena(JOptionPane.showInputDialog(null,
                "Digite la contrasena del usuario a registrar:"));
        u.setEstado(JOptionPane.showInputDialog(null,
                "Digite el estado del usuario a registrar:"));
        
        //Crear nuevo nodo con la informacion anterior
        NodoUsuario nuevo=new NodoUsuario();
        nuevo.setUsuario(u);
      
        if(esVacia()){
            top=nuevo;
        }else{
            nuevo.setSiguiente(top);
            top=nuevo;
        }
    }
    
    public void inactivarUsuario() {
        if(!esVacia()){
            top=top.getSiguiente();
            JOptionPane.showMessageDialog(null,
                 "¡Usuario inactivado!");
        }else{
            JOptionPane.showMessageDialog(null,
                 "No existe ningun usuario en el registro");
        }
    }
    
    public void mostrarUsuario(){
      if(!esVacia()){
         String s="";
         NodoUsuario aux=top;
         while(aux!=null){
            s = s + "Nombre: " + aux.getUsuario().getNombre() + "\n" +
                    "Primer Apellido: " + aux.getUsuario().getpApellido() + "\n" +
                    "Segundo Apellido: " + aux.getUsuario().getsApellido() + "\n" +
                    "Nickname: " + aux.getUsuario().getNickname() + "\n" +
                    "Contrasena: " + aux.getUsuario().getContrasena() + "\n" +
                    "Estado: " + aux.getUsuario().getEstado() + "\n";
            aux = aux.getSiguiente();
         }
         JOptionPane.showMessageDialog(null,
                 "Registro de Usuarios:\n"+s);
      }else{
            JOptionPane.showMessageDialog(null,
                 "¡No se puede mostrar, registro vacío!");
      }
    }
}