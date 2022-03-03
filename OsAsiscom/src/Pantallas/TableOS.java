/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import clases.conexionS;
import java.text.SimpleDateFormat;
import java.util.Date;
import Pantallas.Os;
import javax.swing.ImageIcon;

/**
 *
 * @author rica_
 */
public class TableOS extends javax.swing.JFrame {

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    Connection conexion = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;

    public static String NumOs, FechaIngreso, FechaEntrega, EmitidaPor, TecnicoAsignado,
            NombreCliente, DireccionCliente, CorreoCliente, TelefonoCliente, TipoDispositivo,
            MarcaDispositivo, Modelo, NumSerie, Contraseña, Accesorios, Observaciones,
            Obersvaciones, ReporteCliente, Estatus, EstatusPago;

    /**
     * Creates new form TableClient
     */
    public TableOS() {
        initComponents();
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/logo.png"));
            setIconImage(icon.getImage());

        } catch (Exception e) {
        }
        conexion = conexionS.conn();
        mostrarDatos();
    }

    private void mostrarDatos() {

        conexion = conexionS.conn();
        DefaultTableModel tgeneral = new DefaultTableModel();
        tgeneral.addColumn("NumeroOS");
        tgeneral.addColumn("Fecha Ingreso");
        tgeneral.addColumn("Fecha Salida");
        tgeneral.addColumn("Emitida por");
        tgeneral.addColumn("Tecnico Asignado");
        tgeneral.addColumn("Nombre Cliente");
        tgeneral.addColumn("Direccion Cliente");
        tgeneral.addColumn("Telefono");
        tgeneral.addColumn("Correo Cliente");
        tgeneral.addColumn("Tipo de dispositivo");
        tgeneral.addColumn("Marca Dispositivo");
        tgeneral.addColumn("Modelo");
        tgeneral.addColumn("Numero de serie");
        tgeneral.addColumn("Contraseña");
        tgeneral.addColumn("Accesorios");
        tgeneral.addColumn("Obersvaciones");
        tgeneral.addColumn("Reporte cliente");
        tgeneral.addColumn("Estatus");
        tgeneral.addColumn("Estatus Pago");
        TableOS.setModel(tgeneral);

        String[] datos = new String[19];

        String sql = "select * from os";
        try {

            Statement leer = conexion.createStatement();
            rs = leer.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);
                tgeneral.addRow(datos);

            }
            TableOS.setModel(tgeneral);
            conexion.close();

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

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOS = new javax.swing.JTable();
        select = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/os.png"))); // NOI18N
        jLabel1.setText("Tabla Orden de Servicios");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        TableOS = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TableOS.setModel(new javax.swing.table.DefaultTableModel(
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
        TableOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableOS);

        select.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        select.setText("Seleccionar");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Num OS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOSMouseClicked
        // TODO add your handling code here:

        int seleccionar = TableOS.rowAtPoint(evt.getPoint());
        NumOs = String.valueOf(TableOS.getValueAt(seleccionar, 0));
        FechaIngreso = String.valueOf(TableOS.getValueAt(seleccionar, 1));
        FechaEntrega = String.valueOf(TableOS.getValueAt(seleccionar, 2));
        EmitidaPor = String.valueOf(TableOS.getValueAt(seleccionar, 3));
        TecnicoAsignado = String.valueOf(TableOS.getValueAt(seleccionar, 4));
        NombreCliente = String.valueOf(TableOS.getValueAt(seleccionar, 5));
        DireccionCliente = String.valueOf(TableOS.getValueAt(seleccionar, 6));
        TelefonoCliente = String.valueOf(TableOS.getValueAt(seleccionar, 7));
        CorreoCliente = String.valueOf(TableOS.getValueAt(seleccionar, 8));
        TipoDispositivo = String.valueOf(TableOS.getValueAt(seleccionar, 9));
        MarcaDispositivo = String.valueOf(TableOS.getValueAt(seleccionar, 10));
        Modelo = String.valueOf(TableOS.getValueAt(seleccionar, 11));
        NumSerie = String.valueOf(TableOS.getValueAt(seleccionar, 12));
        Contraseña = String.valueOf(TableOS.getValueAt(seleccionar, 13));
        Accesorios = String.valueOf(TableOS.getValueAt(seleccionar, 14));
        Observaciones = String.valueOf(TableOS.getValueAt(seleccionar, 15));
        ReporteCliente = String.valueOf(TableOS.getValueAt(seleccionar, 16));
        Estatus = String.valueOf(TableOS.getValueAt(seleccionar, 17));
        EstatusPago = String.valueOf(TableOS.getValueAt(seleccionar, 18));


    }//GEN-LAST:event_TableOSMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
         conexion = conexionS.conn();

        if (NumOs == null) {
            JOptionPane.showMessageDialog(null, "selecciona una Orden de Servicio");

        } else {

            Os.Actualizar.setEnabled(true);
            Os.numOS.setText(NumOs);

            try {
                if (FechaEntrega != "null" && FechaIngreso != "null") {

                    Date Fingreso = new SimpleDateFormat("dd-MMM-yyyy").parse(FechaIngreso);
                    Date Fentrega = new SimpleDateFormat("dd-MMM-yyyy").parse(FechaEntrega);
                    Os.ingreso.setDate(Fingreso);
                    Os.Salida.setDate(Fentrega);
                    System.out.println("a");
                } else if (FechaEntrega == "null" && FechaIngreso != "null") {

                    Date Fingreso = new SimpleDateFormat("dd-MMM-yyyy").parse(FechaIngreso);
                    Os.ingreso.setDate(Fingreso);
                    System.out.println("b");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            Os.cbTecnico.setSelectedItem(TecnicoAsignado);
            Os.EmitidaPor.setText(EmitidaPor);

            if (Contraseña.isEmpty() && Accesorios.isEmpty()) {

                Os.No.setSelected(true);
                Os.Contraseña.setText("");
                Os.Contraseña.setEnabled(false);
                Os.txtAccerosorios.setEnabled(false);
                Os.txtAccerosorios.setText("");

            } else {
                Os.Si.setSelected(true);
                Os.Contraseña.setText(Contraseña);
                Os.Contraseña.setEnabled(true);
                Os.txtAccerosorios.setEnabled(true);
                Os.txtAccerosorios.setText(Accesorios);
            }
            Os.Nombre.setText(NombreCliente);
            Os.Direccion.setText(DireccionCliente);
            Os.Telefono.setText(TelefonoCliente);
            Os.Correo.setText(CorreoCliente);
            Os.jTxtObservaciones.setText(Observaciones);
            Os.jTxtReporte.setText(ReporteCliente);
            Os.TipoDispositivo.setText(TipoDispositivo);
            Os.Marca.setText(MarcaDispositivo);
            Os.Modelo.setText(Modelo);
            Os.numSerie.setText(NumSerie);
            Os.Estatus.setText(Estatus);
            Os.Pago.setText(EstatusPago);
            dispose();
        }

    }//GEN-LAST:event_selectActionPerformed

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        // TODO add your handling code here:
         conexion = conexionS.conn();
        DefaultTableModel tgeneral = new DefaultTableModel();
        tgeneral.addColumn("NumeroOS");
        tgeneral.addColumn("Fecha Ingreso");
        tgeneral.addColumn("Fecha Salida");
        tgeneral.addColumn("Emitida por");
        tgeneral.addColumn("Tecnico Asignado");
        tgeneral.addColumn("Nombre Cliente");
        tgeneral.addColumn("Direccion Cliente");
        tgeneral.addColumn("Telefono");
        tgeneral.addColumn("Correo Cliente");
        tgeneral.addColumn("Tipo de dispositivo");
        tgeneral.addColumn("Marca Dispositivo");
        tgeneral.addColumn("Modelo");
        tgeneral.addColumn("Numero de serie");
        tgeneral.addColumn("Contraseña");
        tgeneral.addColumn("Accesorios");
        tgeneral.addColumn("Obersvaciones");
        tgeneral.addColumn("Reporte cliente");
        tgeneral.addColumn("Estatus");
        tgeneral.addColumn("Estatus Pago");
        TableOS.setModel(tgeneral);

        String[] datos = new String[19];

        String sql = "select * from os where NumOs like '%"+Buscar.getText()+"%'";
        try {

            Statement leer = conexion.createStatement();
            rs = leer.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                datos[15] = rs.getString(16);
                datos[16] = rs.getString(17);
                datos[17] = rs.getString(18);
                datos[18] = rs.getString(19);
                tgeneral.addRow(datos);

            }
            TableOS.setModel(tgeneral);
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarKeyReleased

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
            java.util.logging.Logger.getLogger(TableOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JTable TableOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
