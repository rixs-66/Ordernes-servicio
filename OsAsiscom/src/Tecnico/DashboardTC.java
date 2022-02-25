/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tecnico;

import Pantallas.*;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rica_
 */
public class DashboardTC extends javax.swing.JFrame {

    /**
     * Creates new form DashboardTC
     */
    public Clip clip;
    public String ruta = "/audio/";

    public void audio(String archivo) {

    }

    public DashboardTC() {
        initComponents();

        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/logo.png"));
            setIconImage(icon.getImage());

        } catch (Exception e) {
        }

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
        nombre = new javax.swing.JLabel();
        puesto = new javax.swing.JLabel();
        btOs = new javax.swing.JButton();
        jlfecha = new javax.swing.JLabel();
        btnEstadoOs2 = new javax.swing.JButton();
        RP = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        Escritorio = new javax.swing.JPanel();
        iconLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ordenes de servicio ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1646, 920));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navmenu.setBackground(new java.awt.Color(80, 34, 34));
        navmenu.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre de usuario");

        puesto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        puesto.setForeground(new java.awt.Color(255, 255, 255));
        puesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puesto.setText("Administrador");

        btOs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btOs.setForeground(new java.awt.Color(0, 0, 0));
        btOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_bill_32px.png"))); // NOI18N
        btOs.setText("Ordenes de servicio");
        btOs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOs.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btOs.setIconTextGap(10);
        btOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOsActionPerformed(evt);
            }
        });

        jlfecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlfecha.setText("Fecha y hora");

        btnEstadoOs2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEstadoOs2.setForeground(new java.awt.Color(0, 0, 0));
        btnEstadoOs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_true_false_32px_1.png"))); // NOI18N
        btnEstadoOs2.setText("Estado OS");
        btnEstadoOs2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadoOs2.setIconTextGap(10);
        btnEstadoOs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoOs2ActionPerformed(evt);
            }
        });

        RP.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        RP.setForeground(new java.awt.Color(255, 255, 255));
        RP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/soporte-tecnico.png"))); // NOI18N
        RP.setPreferredSize(new java.awt.Dimension(218, 218));

        javax.swing.GroupLayout navmenuLayout = new javax.swing.GroupLayout(navmenu);
        navmenu.setLayout(navmenuLayout);
        navmenuLayout.setHorizontalGroup(
            navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstadoOs2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        navmenuLayout.setVerticalGroup(
            navmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre)
                .addGap(77, 77, 77)
                .addComponent(jlfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(btOs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnEstadoOs2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        background.add(navmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 770));

        bar.setBackground(new java.awt.Color(153, 153, 153));
        bar.setPreferredSize(new java.awt.Dimension(1646, 40));
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Sistema de ordenes de servicio");
        bar.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 40));

        minimizar.setBackground(new java.awt.Color(153, 153, 153));
        minimizar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 255));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setText("-");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizar.setOpaque(true);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarMouseExited(evt);
            }
        });
        bar.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 40, 40));

        cerrar.setBackground(new java.awt.Color(153, 153, 153));
        cerrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setOpaque(true);
        cerrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cerrarFocusGained(evt);
            }
        });
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        bar.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 40, 40));

        background.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 40));

        Escritorio.setBackground(new java.awt.Color(102, 102, 102));

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(iconLogo)
                .addGap(386, 386, 386))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(iconLogo)
                .addGap(118, 118, 118))
        );

        background.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 40, 1320, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1546, 809));
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

    private void btOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOsActionPerformed
        // TODO add your handling code here:
        Os os = new Os();
        Escritorio.removeAll();
        Escritorio.add(os).setVisible(true);

    }//GEN-LAST:event_btOsActionPerformed

    private void btnEstadoOs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoOs2ActionPerformed
        // TODO add your handling code here:

        EstadoOSTC tecnico = new EstadoOSTC();
        Escritorio.removeAll();
        Escritorio.add(tecnico).setVisible(true);
        
    }//GEN-LAST:event_btnEstadoOs2ActionPerformed

    private void cerrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cerrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarFocusGained

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        // TODO add your handling code here:
        cerrar.setBackground(Color.red);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        // TODO add your handling code here:
        cerrar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_cerrarMouseExited

    private void minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseEntered
        // TODO add your handling code here:

        minimizar.setBackground(new Color(97, 183, 255));

    }//GEN-LAST:event_minimizarMouseEntered

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited
        // TODO add your handling code here
        minimizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_minimizarMouseExited

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
            java.util.logging.Logger.getLogger(DashboardTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Escritorio;
    private javax.swing.JLabel RP;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bar;
    private javax.swing.JButton btOs;
    private javax.swing.JButton btnEstadoOs2;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel navmenu;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel puesto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
