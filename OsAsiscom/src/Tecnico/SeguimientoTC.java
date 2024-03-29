/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tecnico;

import Pantallas.*;
import clases.cbServicios;
import clases.conexionS;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rica_
 */
public class SeguimientoTC extends javax.swing.JFrame {

    Connection conexion = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;

    public static String aux;

    /**
     * Creates new form Seguimiento
     */
    public SeguimientoTC() {
        initComponents();
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/logo.png"));
            setIconImage(icon.getImage());

        } catch (Exception e) {
        }
        DefaultTableModel tableprecios = new DefaultTableModel();
        tableprecios.addColumn("Servicio");
        tableprecios.addColumn("Precio");
        Servicios.setModel(tableprecios);

        conexion = conexionS.conn();
        cargarCombobox();
        ID.setText(EstadoOSTC.NumOS);
        CargarDatos();
        suma();
        Total.setEnabled(false);
        Estatus.setText("En proceso");
        Pago.setText(EstadoOSTC.Pago);
        EstadoOSTC.NumOS = null;

    }

    private void suma() {

        int contar = Servicios.getRowCount();
        int suma = 0;
        for (int i = 0; i < contar; i++) {
            suma += Integer.parseInt(Servicios.getValueAt(i, 2).toString());

        }
        Total.setText(String.valueOf(suma));

    }

    private void cargarCombobox() {

        cbServicios cb = new cbServicios();
        cbServicios.setModel(cb.getvalues());

    }

    private void CargarDatos() {

        DefaultTableModel tableprecios = new DefaultTableModel();
        tableprecios.addColumn("ID");
        tableprecios.addColumn("Servicio");
        tableprecios.addColumn("Precio");
        Servicios.setModel(tableprecios);
        String[] datos = new String[3];

        String sql = "select * from servicios where numOs='" + ID.getText() + "'";

        try {

            Statement leer = conexion.createStatement();
            rs = leer.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                tableprecios.addRow(datos);
            }
            Servicios.setModel(tableprecios);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Estatus = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        Pago = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Servicios = new javax.swing.JTable();
        cbServicios = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Seguimiento = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(846, 536));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ID.setText("N° OS");
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 40, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Seguimiento");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Estatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Estatus.setText("Estatus");
        jPanel2.add(Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 40));

        contador.setText("500");
        jPanel2.add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        Pago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pago.setText("Pago");
        jPanel2.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 80, 40));

        Servicios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiciosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Servicios);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 560, 160));

        cbServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServiciosActionPerformed(evt);
            }
        });
        jPanel2.add(cbServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 260, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Total:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 20));

        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel2.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 70, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel2.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        Seguimiento.setColumns(20);
        Seguimiento.setRows(5);
        Seguimiento.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                SeguimientoInputMethodTextChanged(evt);
            }
        });
        Seguimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SeguimientoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(Seguimiento);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 560, 160));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Seguimiento de la orden de servicio numero:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbServiciosActionPerformed

    private void SeguimientoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_SeguimientoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SeguimientoInputMethodTextChanged

    private void SeguimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeguimientoKeyReleased
        // TODO add your handling code here:
        contador.setText("500");
        int count;
        int caracteres = 500;
        count = Seguimiento.getText().length();
        caracteres -= count;
        contador.setText("(" + caracteres + ")");


    }//GEN-LAST:event_SeguimientoKeyReleased

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            String sql = "select * from catalogoprecios where descripcion='" + cbServicios.getSelectedItem().toString() + "'";

            try {
                Statement leer = conexion.createStatement();
                rs = leer.executeQuery(sql);
                if (rs.next()) {
                    String descripcion = rs.getString(2);
                    String precio = rs.getString(3);

                    sql = ("insert into servicios (numOs,Servicio,Precio)values(?,?,?)");
                    pst = conexion.prepareStatement(sql);
                    pst.setString(1, ID.getText());
                    pst.setString(2, descripcion);
                    pst.setString(3, precio);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Servicio agregado con Exito");
                    CargarDatos();

                } else {
                    JOptionPane.showMessageDialog(null, "selecciona un servicio");
                }

            } catch (SQLException ex) {
                Logger.getLogger(SeguimientoTC.class.getName()).log(Level.SEVERE, null, ex);
            }
            suma();
        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void ServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseClicked
        // TODO add your handling code here:
        int seleccionar = Servicios.rowAtPoint(evt.getPoint());
        aux = String.valueOf(Servicios.getValueAt(seleccionar, 0));


    }//GEN-LAST:event_ServiciosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Porfavor Selecciones un servicio");

        }

        String sql = "Delete from servicios where ID=?";

        try {
            pst = conexion.prepareStatement(sql);
            pst.setString(1, aux);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Servicio eliminado");
            CargarDatos();

        } catch (Exception e) {
        }
        suma();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        conexion = conexionS.conn();
        String sql = "Update os set Seguimiento=?,"
                + "Estatus=?,"
                + "EstatusPago=?,"
                + "Total=? where numOs='" + ID.getText() + "'";

        try {
            pst = conexion.prepareStatement(sql);
            pst.setString(1, Seguimiento.getText());
            pst.setString(2, Estatus.getText());
            pst.setString(3, Pago.getText());
            pst.setString(4, Total.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Seguimiento agregado correctamente");
            dispose();
            ID.setText("");

        } catch (Exception e) {

        }
        EstadoOSTC.Pestañas.setSelectedIndex(2);
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(SeguimientoTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeguimientoTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeguimientoTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeguimientoTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeguimientoTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estatus;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Pago;
    private javax.swing.JTextArea Seguimiento;
    public static javax.swing.JTable Servicios;
    private javax.swing.JTextField Total;
    private javax.swing.JComboBox<String> cbServicios;
    private javax.swing.JLabel contador;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
