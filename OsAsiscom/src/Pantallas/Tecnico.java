/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.awt.Color;
import javax.swing.JFrame;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author rica_
 */
public class Tecnico extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Clip clip;
    public String ruta = "/audio/";

    public void audio(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception e) {
        }

    }

    public Tecnico() {
        initComponents();
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {

                        Thread.sleep(500);
                        jlfecha.setText(dtf5.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        navmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btOs = new javax.swing.JButton();
        btnEstadoOs = new javax.swing.JButton();
        jlfecha = new javax.swing.JLabel();
        btnEstadoOs1 = new javax.swing.JButton();
        bar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ordenes de servicio ");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(46, 52, 60));
        background.setPreferredSize(new java.awt.Dimension(1646, 920));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navmenu.setBackground(new java.awt.Color(80, 34, 34));
        navmenu.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/uaser2.png"))); // NOI18N

        nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre de usuario");

        Tipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 255));
        Tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tipo.setText("Tecnico");

        cerrarSesion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesion.setText("Cerrar sesion");

        btnUsuarios.setBackground(new java.awt.Color(80, 34, 34));
        btnUsuarios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user3.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setIconTextGap(80);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(80, 34, 34));
        btnClientes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setIconTextGap(80);
        btnClientes.setVerifyInputWhenFocusTarget(false);

        btOs.setBackground(new java.awt.Color(80, 34, 34));
        btOs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btOs.setForeground(new java.awt.Color(255, 255, 255));
        btOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/os.png"))); // NOI18N
        btOs.setText("Ordenes de servicio");
        btOs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOs.setIconTextGap(50);

        btnEstadoOs.setBackground(new java.awt.Color(80, 34, 34));
        btnEstadoOs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEstadoOs.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadoOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/acerca.png"))); // NOI18N
        btnEstadoOs.setText("Acerca de ");
        btnEstadoOs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadoOs.setIconTextGap(80);
        btnEstadoOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoOsActionPerformed(evt);
            }
        });

        jlfecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlfecha.setText("Fecha y hora");

        btnEstadoOs1.setBackground(new java.awt.Color(80, 34, 34));
        btnEstadoOs1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEstadoOs1.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadoOs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/estado.png"))); // NOI18N
        btnEstadoOs1.setText("Estado de ordenes de servicio");
        btnEstadoOs1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadoOs1.setIconTextGap(30);
        btnEstadoOs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoOs1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navmenuLayout = new javax.swing.GroupLayout(navmenu);
        navmenu.setLayout(navmenuLayout);
        navmenuLayout.setHorizontalGroup(
            navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btOs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstadoOs, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addComponent(jlfecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstadoOs1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navmenuLayout.createSequentialGroup()
                .addGroup(navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navmenuLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navmenuLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navmenuLayout.setVerticalGroup(
            navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navmenuLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jlfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstadoOs1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnEstadoOs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        background.add(navmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, 880));

        bar.setBackground(new java.awt.Color(153, 153, 153));
        bar.setPreferredSize(new java.awt.Dimension(1646, 40));
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Sistema de ordenes de servicio");
        bar.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 40));

        minimizar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 255));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setText("-");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        bar.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 0, 40, 40));

        cerrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        bar.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 0, 40, 40));

        background.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1646, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1646, 920));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        // TODO add your handling code here:
        
        int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir del "
                + "programa?", "Atención", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            
            System.exit(0);

        }
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEstadoOs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoOs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadoOs1ActionPerformed

    private void btnEstadoOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoOsActionPerformed
        // TODO add your handling code here:
        Acerca acerca = new Acerca();
        acerca.setVisible(true);
    }//GEN-LAST:event_btnEstadoOsActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tipo;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bar;
    private javax.swing.JButton btOs;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEstadoOs;
    private javax.swing.JButton btnEstadoOs1;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel navmenu;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}