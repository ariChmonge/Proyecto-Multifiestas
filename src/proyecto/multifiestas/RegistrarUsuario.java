package proyecto.multifiestas;

import javax.swing.JOptionPane;
import proyecto.multifiestas.RegistroUsuarios.NodoUsuario;
import proyecto.multifiestas.RegistroUsuarios.Usuario;

public class RegistrarUsuario extends javax.swing.JFrame {

    private NodoUsuario top;//Cima
            
    public RegistrarUsuario() {
        initComponents();
        this.top = null;
        setResizable(false);
        setTitle("Registrar Usuario");
    }
    
    public boolean esVacia(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
  
    private void agregarUsuario() {
        //Crea un nuevo usuario
        Usuario u = new Usuario();
        //Rellena los datos con el formulario
        u.setNombre(espacioNombre.getText());
        u.setpApellido(espacioPrimerApellido.getText());
        u.setsApellido(espacioSegundoApellido.getText());
        u.setNickname(espacioNombreUsuario.getText());
        u.setContrasena(espacioContrasena.getText());
        u.setEstado("Inactivo");//Inactivo al registrar, se activa al iniciar sesion
        //Crea un nuevo nodo para el usuario
        NodoUsuario nuevo = new NodoUsuario();
        nuevo.setUsuario(u);//Rellena el nodo con el usuario
        //Si la pila esta vacia, cima es el nuevo nodo, si no, es el siguiente
        if (esVacia()) {
            top = nuevo;
        } else {
            nuevo.setSiguiente(top);
            top = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Usuario registrado!");
        limpiarCampos();
    }
    
    //Limpia los campos del formulario
    private void limpiarCampos() {
        espacioNombre.setText("");
        espacioPrimerApellido.setText("");
        espacioSegundoApellido.setText("");
        espacioNombreUsuario.setText("");
        espacioContrasena.setText("");
    }
    
    //Getter para cima
    public NodoUsuario getTop() {
        return top;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        espacioNombre = new javax.swing.JTextField();
        espacioPrimerApellido = new javax.swing.JTextField();
        espacioSegundoApellido = new javax.swing.JTextField();
        espacioNombreUsuario = new javax.swing.JTextField();
        espacioContrasena = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        botonVolverMenuPrincipal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Primer Apellido:");

        jLabel4.setText("Segundo Apellido:");

        jLabel5.setText("Nombre de Usuario:");

        jLabel6.setText("Contraseña:");

        espacioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioNombreActionPerformed(evt);
            }
        });

        espacioPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioPrimerApellidoActionPerformed(evt);
            }
        });

        espacioSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioSegundoApellidoActionPerformed(evt);
            }
        });

        espacioNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioNombreUsuarioActionPerformed(evt);
            }
        });

        espacioContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacioContrasenaActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonVolverMenuPrincipal.setText("Volver al Menú Principal");
        botonVolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuPrincipalActionPerformed(evt);
            }
        });
        jMenuBar1.add(botonVolverMenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(espacioNombre)
                            .addComponent(espacioPrimerApellido)
                            .addComponent(espacioSegundoApellido)
                            .addComponent(espacioNombreUsuario)
                            .addComponent(espacioContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(botonRegistrar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(espacioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(espacioPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(espacioSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(espacioNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(espacioContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonRegistrar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void espacioContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioContrasenaActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        agregarUsuario();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void espacioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioNombreActionPerformed

    private void espacioPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioPrimerApellidoActionPerformed

    private void espacioSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioSegundoApellidoActionPerformed

    private void espacioNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacioNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioNombreUsuarioActionPerformed

    private void botonVolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverMenuPrincipalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JMenu botonVolverMenuPrincipal;
    private javax.swing.JTextField espacioContrasena;
    private javax.swing.JTextField espacioNombre;
    private javax.swing.JTextField espacioNombreUsuario;
    private javax.swing.JTextField espacioPrimerApellido;
    private javax.swing.JTextField espacioSegundoApellido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
