package proyecto.multifiestas.RegistroUsuarios;

import javax.swing.JOptionPane;
/*
Módulo 1: Registro de Usuarios 

En el primer módulo se registrarán los
usuarios que comprarán entradas a sus
eventos favoritos.

1. Se debe escoger entre una estructura de datos de tipo Lista Simple Circular o
Pila

2. En cada nodo de la estructura se almacenarán los siguientes atributos:
Nombre y Apellidos del usuario, Usuario (Nickname), Contraseña y Estado
(Activo o Inactivo).

3. Debe crearse el método particular de agregar para la estructura.

4. Debe crearse el método particular de inactivar usuarios para la estructura. (Al
inactivar un usuario, debe verificar que no tenga datos relacionados en la
estructura de citas en el mes actual).

5. Debe respetar los algoritmos vistos en clase.

6. Este registro se utilizará para poder crear un login. Al loguearse, buscará el
usuario previamente registrado. Si existe, se concederá el ingreso al sistema,
sino se mostrará un mensaje de “Acceso denegado”.*/

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