package es.maestredam.qa.views;

import es.maestredam.qa.model.GestorInfo;
import es.maestredam.qa.model.Usuario;
import es.maestredam.util.LinkedList;

/**
 * @author Luismi
 */
public class MainWindow extends javax.swing.JFrame{
    
    public MainWindow() {
        initComponents();
        listaUsu=gestor.cargarArchivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        nombreUsu = new javax.swing.JLabel();
        nCompUsu = new javax.swing.JLabel();
        puntUsu = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtNomCom = new javax.swing.JTextField();
        txtPunt = new javax.swing.JTextField();
        lblTipoUser = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        barraMenuInicio = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        aniadirUsuario = new javax.swing.JMenuItem();
        menuQA = new javax.swing.JMenu();
        aniadirPreg = new javax.swing.JMenuItem();
        eliminarPreg = new javax.swing.JMenuItem();
        menuJugar = new javax.swing.JMenu();
        menuStart = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        menuVerUsu = new javax.swing.JMenuItem();
        menuVerPreg = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuExitSave = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreUsu.setText("Nombre:");

        nCompUsu.setText("Nombre Completo:");

        puntUsu.setText("Puntuación Total:");

        btnLogout.setVisible(false);
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtNombre.setVisible(false);
        txtNombre.setEditable(false);

        txtNomCom.setVisible(false);
        txtNomCom.setEditable(false);

        txtPunt.setVisible(false);
        txtPunt.setEditable(false);

        lblTipoUser.setText("Bienvenido");

        btnLogin.setText("Iniciar sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        menuUsuario.setText("Usuario");

        aniadirUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        aniadirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/adduser.png"))); // NOI18N
        aniadirUsuario.setText("Añadir usuario");
        aniadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(aniadirUsuario);

        barraMenuInicio.add(menuUsuario);

        menuQA.setEnabled(false);
        menuQA.setText("Preguntas");

        aniadirPreg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        aniadirPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/addpregunta.png"))); // NOI18N
        aniadirPreg.setText("Añadir pregunta");
        aniadirPreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirPregActionPerformed(evt);
            }
        });
        menuQA.add(aniadirPreg);

        eliminarPreg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.SHIFT_MASK));
        eliminarPreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/deleteQA.png"))); // NOI18N
        eliminarPreg.setText("Eliminar pregunta");
        eliminarPreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPregActionPerformed(evt);
            }
        });
        menuQA.add(eliminarPreg);

        barraMenuInicio.add(menuQA);

        menuJugar.setEnabled(false);
        menuJugar.setText("Jugar");

        menuStart.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        menuStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/play.png"))); // NOI18N
        menuStart.setText("Empezar");
        menuStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStartActionPerformed(evt);
            }
        });
        menuJugar.add(menuStart);

        menuVer.setEnabled(false);
        menuVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/view.png"))); // NOI18N
        menuVer.setText("Ver");

        menuVerUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuVerUsu.setText("Usuarios");
        menuVerUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerUsuActionPerformed(evt);
            }
        });
        menuVer.add(menuVerUsu);

        menuVerPreg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuVerPreg.setText("Preguntas");
        menuVerPreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerPregActionPerformed(evt);
            }
        });
        menuVer.add(menuVerPreg);

        menuJugar.add(menuVer);

        barraMenuInicio.add(menuJugar);

        menuSalir.setText("Salir");

        menuExitSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuExitSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/saveexit.png"))); // NOI18N
        menuExitSave.setText("Salir y guardar");
        menuExitSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitSaveActionPerformed(evt);
            }
        });
        menuSalir.add(menuExitSave);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/maestredam/images/exit.png"))); // NOI18N
        menuExit.setText("Salir sin guardar");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuSalir.add(menuExit);

        barraMenuInicio.add(menuSalir);

        setJMenuBar(barraMenuInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nCompUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(puntUsu)
                            .addComponent(nombreUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPunt, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtNomCom)
                            .addComponent(txtNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnLogout))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLogin)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTipoUser)
                                    .addGap(26, 26, 26))))))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTipoUser)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsu)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCompUsu)
                    .addComponent(txtNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntUsu)
                    .addComponent(txtPunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addGap(109, 109, 109))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Variables necesarias
    private GestorInfo gestor = new GestorInfo("usuarios.dam");
    private Usuario usuario;
    private LinkedList<Usuario> listaUsu;
    
    //Click en añadir usuario
    private void aniadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirUsuarioActionPerformed
        AniadirUser newUser = new AniadirUser(this, true);
        newUser.setVisible(true);
        usuario = newUser.getNewUser();
        listaUsu.add(usuario);  
        usuario=null;
    }//GEN-LAST:event_aniadirUsuarioActionPerformed
    
   
    //Click en Logout
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        lblTipoUser.setText("Bienvenido");
        btnLogout.setVisible(false);
        btnLogin.setVisible(true);
        puntUsu.setVisible(true);
        txtNombre.setVisible(false);
        txtNomCom.setVisible(false);
        txtPunt.setVisible(false);
        menuJugar.setEnabled(false);
        menuQA.setEnabled(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuExitSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitSaveActionPerformed
        gestor.escribirLista(listaUsu, false);
        System.exit(0);
    }//GEN-LAST:event_menuExitSaveActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login newLogin = new Login(this, true);
        newLogin.setVisible(true);
        Usuario userLog=newLogin.getUser();
        usuario = userLog;
        txtNombre.setText(userLog.getNombre());
        txtNomCom.setText(userLog.getNombreCompleto());
        if(!userLog.isAdmin()){
            txtPunt.setText(String.valueOf(userLog.getPuntuacionTotal()));
            lblTipoUser.setText("USUARIO");
            txtPunt.setVisible(true);
            txtPunt.setText(""+userLog.getPuntuacionTotal());
            puntUsu.setVisible(true);
            menuJugar.setEnabled(true);
            menuStart.setEnabled(true);
            menuVer.setEnabled(true);
        }else{
            txtPunt.setVisible(false);
            puntUsu.setVisible(false);
            menuJugar.setEnabled(true);
            menuQA.setEnabled(true);
            menuStart.setEnabled(false);
            menuVer.setEnabled(true);
            lblTipoUser.setText("ADMINISTRADOR");
            
        }
        btnLogout.setVisible(true);
        btnLogin.setVisible(false);
        txtNombre.setVisible(true);
        txtNomCom.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void aniadirPregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirPregActionPerformed
        AniadirQA newQA = new AniadirQA(this, true);
        newQA.setVisible(true);
    }//GEN-LAST:event_aniadirPregActionPerformed

    private void menuStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStartActionPerformed
        Jugar newGame = new Jugar(this, true);
        newGame.setVisible(true);
        int puntuacion = newGame.getPuntuacion();
        int index = listaUsu.indexOf(usuario);
        listaUsu.get(index+1).setPuntuacionTotal(usuario.getPuntuacionTotal()+puntuacion);
        listaUsu.get(index+1).setNumJugadas(usuario.getNumJugadas()+1);
        usuario=listaUsu.get(index+1);
        txtPunt.setText(""+usuario.getPuntuacionTotal());
    }//GEN-LAST:event_menuStartActionPerformed

    private void menuVerUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerUsuActionPerformed
        VistaUsers newVisUs = new VistaUsers(this, true);
        newVisUs.setVisible(true);
    }//GEN-LAST:event_menuVerUsuActionPerformed

    private void menuVerPregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerPregActionPerformed
        VistaQA newVisQA = new VistaQA(this, true);
        newVisQA.setVisible(true);
    }//GEN-LAST:event_menuVerPregActionPerformed

    private void eliminarPregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPregActionPerformed
        EliminarQA newDeleteQA = new EliminarQA(this, true);
        newDeleteQA.setVisible(true);
    }//GEN-LAST:event_eliminarPregActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aniadirPreg;
    private javax.swing.JMenuItem aniadirUsuario;
    private javax.swing.JMenuBar barraMenuInicio;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JMenuItem eliminarPreg;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lblTipoUser;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuExitSave;
    private javax.swing.JMenu menuJugar;
    private javax.swing.JMenu menuQA;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem menuStart;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem menuVerPreg;
    private javax.swing.JMenuItem menuVerUsu;
    private javax.swing.JLabel nCompUsu;
    private javax.swing.JLabel nombreUsu;
    private javax.swing.JLabel puntUsu;
    private javax.swing.JTextField txtNomCom;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPunt;
    // End of variables declaration//GEN-END:variables
}
