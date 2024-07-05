package proyecto.multifiestas;

import javax.swing.JOptionPane;
import proyecto.multifiestas.RegistroUsuarios.NodoUsuario;
import proyecto.multifiestas.RegistroUsuarios.Usuario;

public class IniciarSesion extends javax.swing.JFrame {

    private NodoUsuario top;
    
    public IniciarSesion() {
        initComponents();
        setResizable(false);
        setTitle("Iniciar Sesión");
        
    }
    
    //Verifica si el nombre de usuario y contrasena coinciden
    private boolean verificarCredenciales(String nUsuario, String contrasena) {
        NodoUsuario cima = top;
        while (cima != null) {
            Usuario usuario = cima.getUsuario();
            if (usuario.getNickname().equals(nUsuario) //Verifica el usuario
                    && usuario.getContrasena().equals(contrasena)) {//Verifica la contrasena
                usuario.setEstado("Activo"); //Al registrar es inactivo, cuando inicia sesion se vuelve activo
                return true;
            }
            cima = cima.getSiguiente();
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreUsuario = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        campoContrasena = new javax.swing.JPasswordField();
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNombreUsuario)
                    .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void campoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContrasenaActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        String nUsuario = campoNombreUsuario.getText();
        String contrasena = new String(campoContrasena.getPassword());
        if (verificarCredenciales(nUsuario, contrasena)) {//Llama al metodo que verifica los credenciales
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            PantallaUsuarioEnSesion pantallaUsuarioEnSesion = new PantallaUsuarioEnSesion();
            pantallaUsuarioEnSesion.setVisible(true);//Muestra la pantalla de usuario en sesion
            this.dispose();//Cierra la pestana de inicio de sesion
        } else {
            JOptionPane.showMessageDialog(this, "Acceso denegado");
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void campoNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreUsuarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoNombreUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
