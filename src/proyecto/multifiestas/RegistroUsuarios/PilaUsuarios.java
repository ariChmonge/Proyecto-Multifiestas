package proyecto.multifiestas.RegistroUsuarios;

import javax.swing.JOptionPane;
/*
Módulo 1: Registro de Usuarios 

En el primer módulo se registrarán los
usuarios que comprarán entradas a sus
eventos favoritos.

1. Se debe escoger entre una estructura de datos de tipo Lista Simple Circular o
Pila 
*LISTO* SE USA PILA

2. En cada nodo de la estructura se almacenarán los siguientes atributos:
Nombre y Apellidos del usuario, Usuario (Nickname), Contraseña y Estado
(Activo o Inactivo). 
*LISTO* CLASE USUARIO 

3. Debe crearse el método particular de agregar para la estructura. 
*LISTO* JFRAME FORM REGISTRAR USUARIO

4. Debe crearse el método particular de inactivar usuarios para la estructura. (Al
inactivar un usuario, debe verificar que no tenga datos relacionados en la
estructura de citas en el mes actual).
*FALTA*

5. Debe respetar los algoritmos vistos en clase.

6. Este registro se utilizará para poder crear un login. Al loguearse, buscará el
usuario previamente registrado. Si existe, se concederá el ingreso al sistema,
sino se mostrará un mensaje de “Acceso denegado”.
*LISTO* JFRAME FORM INICIARSESION
*/


public class PilaUsuarios {
    private NodoUsuario top;

    public PilaUsuarios() {
        top = null;
    }

    public boolean esVacia() {
        return top == null;
    }

    public void agregarUsuario(Usuario u) {
        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setUsuario(u);
        if (esVacia()) {
            top = nuevo;
        } else {
            nuevo.setSiguiente(top);
            top = nuevo;
        }
    }

    public NodoUsuario getTop() {
        return top;
    }

    public void setTop(NodoUsuario top) {
        this.top = top;
    }
}