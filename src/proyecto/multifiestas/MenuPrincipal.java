package proyecto.multifiestas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setResizable(false);
        setTitle("Menú Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRegistrarUsuario = new javax.swing.JButton();
        botonIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonInactivarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 52, 52));
        setForeground(new java.awt.Color(52, 52, 52));
        setResizable(false);

        botonRegistrarUsuario.setBackground(new java.awt.Color(52, 52, 52));
        botonRegistrarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarUsuario.setText("Registrar Usuario");
        botonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarUsuarioActionPerformed(evt);
            }
        });

        botonIniciarSesion.setBackground(new java.awt.Color(52, 52, 52));
        botonIniciarSesion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/multifiestas/Iconos/LogoMultifiestas.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione una opción para ingresar al sistema:");

        botonInactivarUsuario.setBackground(new java.awt.Color(52, 52, 52));
        botonInactivarUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonInactivarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botonInactivarUsuario.setText("Inactivar Usuario");
        botonInactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInactivarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botonInactivarUsuario)
                                .addComponent(botonRegistrarUsuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonIniciarSesion)
                                .addGap(14, 14, 14)))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(botonIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(botonRegistrarUsuario)
                .addGap(18, 18, 18)
                .addComponent(botonInactivarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        //Abre la pestana de inicio de sesion
        IniciarSesion iniciarSesion = new IniciarSesion();
        iniciarSesion.setVisible(true);
        this.dispose();//Cierra el menu principal
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonInactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInactivarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInactivarUsuarioActionPerformed

    private void botonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarUsuarioActionPerformed
        //Abre la pestana de registro de usuario
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();
        registrarUsuario.setVisible(true);
        this.dispose();//Cierra el menu principal
    }//GEN-LAST:event_botonRegistrarUsuarioActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInactivarUsuario;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
