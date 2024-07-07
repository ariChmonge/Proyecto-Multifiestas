package proyecto.multifiestas;

import javax.swing.JOptionPane;
import proyecto.multifiestas.RegistroUsuarios.NodoUsuario;
import proyecto.multifiestas.RegistroUsuarios.PilaUsuarios;
import proyecto.multifiestas.RegistroUsuarios.Usuario;

public class IniciarSesion extends javax.swing.JFrame {
    private PilaUsuarios pilaUsuarios;
    
    public IniciarSesion() {
        initComponents();
        pilaUsuarios = new PilaUsuarios();
        setResizable(false);
        setTitle("Iniciar Sesión");
        
    }
    
    //Verifica si el nombre de usuario y contrasena coinciden
    private boolean verificarCredenciales() {
        String nUsuario = campoNombreUsuario.getText();
        String contrasena = campoContrasena.getText();
   
        NodoUsuario aux = pilaUsuarios.getTop();
        boolean encontrado = false;

        while (aux != null) {
            Usuario usuario = aux.getUsuario();
            if (usuario.getNickname().equals(nUsuario) && usuario.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");
                encontrado = true;
                break;
            }
            aux = aux.getSiguiente();
            if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
            }
        }
        return encontrado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreUsuario = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        campoContrasena = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setText("Contraseña:");

        campoNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreUsuarioActionPerformed(evt);
            }
        });

        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        campoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContrasenaActionPerformed(evt);
            }
        });

        jMenu1.setText("Volver al Menú Principal");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(botonIniciarSesion)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNombreUsuario)
                    .addComponent(campoContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonIniciarSesion)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        if (verificarCredenciales()==true) {//Llama al metodo que verifica los credenciales
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            PantallaUsuarioEnSesion pantallaUsuarioEnSesion = new PantallaUsuarioEnSesion();
            pantallaUsuarioEnSesion.setVisible(true);//Muestra la pantalla de usuario en sesion
            this.dispose();//Cierra la pestana de inicio de sesion
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void campoNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreUsuarioActionPerformed

    private void campoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JTextField campoContrasena;
    private javax.swing.JTextField campoNombreUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
