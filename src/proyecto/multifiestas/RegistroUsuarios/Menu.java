package proyecto.multifiestas.RegistroUsuarios;
//hola
import javax.swing.JOptionPane;

public class Menu {
     private byte opcion;
   private PilaUsuarios p= new PilaUsuarios();
    //Holaa soy Kevin
   public void mostrarMenu(){
       opcion=Byte.parseByte(JOptionPane.
               showInputDialog(null,"****MENÙ PRINCIPAL***\n\n"+
                       "1.Agregar Usuario\n"
                       + "2.Inactivar Usuario\n"
                       + "3.Mostrar usuario\n"
                       + "4.Salir\n\n"
                       + "Digite su opción:"));
       switch(opcion){
           case 1:{
              p.agregarUsuario();
              mostrarMenu();
              break;
           }
           case 2:{
              p.inactivarUsuario();
              mostrarMenu();
              break;
           }
           case 3:{
              p.mostrarUsuario();
              mostrarMenu();
              break;
           }
           case 4:{
              System.exit(0);
              break;
           }
           default:{
              JOptionPane.showMessageDialog(null,
                      "¡Opción incorrecta!");
              mostrarMenu();
           }
       }
   }
}
