/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import clases.*;
import clases.conexionS;
import java.sql.*;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rica_
 */
public class EstadoOS extends javax.swing.JInternalFrame {

    Connection conexion = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    public static String NumOS, Pago, Status, Seguimiento;

    /**
     * Creates new form EstadoOS
     */
    public EstadoOS() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        conexion = conexionS.conn();

    }

    private void colorear1() {
        colorCelda estatus = new colorCelda(11);
        jTableGeneral.getColumnModel().getColumn(11).setCellRenderer(estatus);

        colorCelda2 pago = new colorCelda2(12);
        jTableGeneral.getColumnModel().getColumn(12).setCellRenderer(pago);

    }

    private void colorear2() {
        colorCelda color1 = new colorCelda(11);
        jTableProceso.getColumnModel().getColumn(11).setCellRenderer(color1);

        colorCelda2 pago = new colorCelda2(12);
        jTableProceso.getColumnModel().getColumn(12).setCellRenderer(pago);

    }

    private void colorear3() {
        colorCelda color1 = new colorCelda(11);
        jTableTerminadas.getColumnModel().getColumn(11).setCellRenderer(color1);

        colorCelda2 pago = new colorCelda2(12);
        jTableTerminadas.getColumnModel().getColumn(12).setCellRenderer(pago);

    }

    private void colorear4() {
        colorCelda color1 = new colorCelda(11);
        jTableCanceladas.getColumnModel().getColumn(11).setCellRenderer(color1);

        colorCelda2 pago = new colorCelda2(12);
        jTableCanceladas.getColumnModel().getColumn(12).setCellRenderer(pago);

    }

    private void colorear5() {
        colorCelda color1 = new colorCelda(11);
        jTableAsignado.getColumnModel().getColumn(11).setCellRenderer(color1);

        colorCelda2 pago = new colorCelda2(12);
        jTableAsignado.getColumnModel().getColumn(12).setCellRenderer(pago);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pestañas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGeneral = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Escritorio6 = new javax.swing.JPanel();
        btnSeguimiento = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableAsignado = new javax.swing.JTable();
        Escritorio5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableProceso = new javax.swing.JTable();
        btnActualizaSeguimiento = new javax.swing.JButton();
        verSeguimiento = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableTerminadas = new javax.swing.JTable();
        Imprimir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCanceladas = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setPreferredSize(new java.awt.Dimension(1326, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/estado.png"))); // NOI18N
        jLabel1.setText("Estado Ordenes de Servicio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(495, 495, 495))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Pestañas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PestañasStateChanged(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableGeneral = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableGeneral.setFont(new java.awt.Font("Roboto", 0, 14));
        jTableGeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableGeneral.setFocusable(false);
        jTableGeneral.setRowHeight(30);
        jTableGeneral.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableGeneral);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1260, 630));

        Pestañas.addTab("General", jPanel3);

        Escritorio6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeguimiento.setText("Iniciar Seguimiento");
        btnSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoActionPerformed(evt);
            }
        });
        Escritorio6.add(btnSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTableGeneral = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableAsignado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableAsignado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAsignado.setFocusable(false);
        jTableAsignado.setRowHeight(30);
        jTableAsignado.getTableHeader().setReorderingAllowed(false);
        jTableAsignado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAsignadoMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTableAsignado);

        Escritorio6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1260, 630));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escritorio6, javax.swing.GroupLayout.PREFERRED_SIZE, 1287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escritorio6, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Pestañas.addTab("Asignada", jPanel4);

        Escritorio5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableGeneral = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableProceso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProceso.setFocusable(false);
        jTableProceso.setRowHeight(30);
        jTableProceso.getTableHeader().setReorderingAllowed(false);
        jTableProceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProcesoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableProceso);

        Escritorio5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1260, 630));

        btnActualizaSeguimiento.setText("Actualizar Seguimiento");
        btnActualizaSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaSeguimientoActionPerformed(evt);
            }
        });
        Escritorio5.add(btnActualizaSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        verSeguimiento.setText("Ver seguimiento");
        verSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSeguimientoActionPerformed(evt);
            }
        });
        Escritorio5.add(verSeguimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        Pestañas.addTab("En proceso", Escritorio5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableGeneral = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableTerminadas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableTerminadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTerminadas.setFocusable(false);
        jTableTerminadas.setRowHeight(30);
        jTableTerminadas.getTableHeader().setReorderingAllowed(false);
        jTableTerminadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTerminadasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableTerminadas);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1260, 630));

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_print_24px.png"))); // NOI18N
        Imprimir.setMnemonic('p');
        Imprimir.setText("Imprimir informe");
        Imprimir.setToolTipText("CRTL + P");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        Imprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ImprimirKeyPressed(evt);
            }
        });
        jPanel6.add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        Pestañas.addTab("Terminadas", jPanel6);

        jPanel7.setFont(new java.awt.Font("Rage Italic", 0, 14)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableGeneral = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableCanceladas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableCanceladas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCanceladas.setFocusable(false);
        jTableCanceladas.setRowHeight(30);
        jTableCanceladas.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTableCanceladas);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1260, 630));

        jButton5.setText("Imprimir informe");
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Pestañas.addTab("Canceladas", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 1287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PestañasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PestañasStateChanged
        // TODO add your handling code here:

        if (Pestañas.getTitleAt(Pestañas.getSelectedIndex()).equals("General")) {

            conexion = conexionS.conn();
            DefaultTableModel tgeneral = new DefaultTableModel();
            tgeneral.addColumn("NumeroOS");
            tgeneral.addColumn("Fecha Ingreso");
            tgeneral.addColumn("Fecha salida");
            tgeneral.addColumn("Emitida por");
            tgeneral.addColumn("Tecnico Asignado");
            tgeneral.addColumn("Nombre Cliente");
            tgeneral.addColumn("Direccion Cliente");
            tgeneral.addColumn("Telefono");
            tgeneral.addColumn("Correo Cliente");
            tgeneral.addColumn("Tipo de dispositivo");
            tgeneral.addColumn("Reporte cliente");
            tgeneral.addColumn("Estatus");
            tgeneral.addColumn("Estatus Pago");
            jTableGeneral.setModel(tgeneral);

            String[] datos = new String[13];

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
                    datos[11] = rs.getString(18);
                    datos[12] = rs.getString(19);
                    tgeneral.addRow(datos);
                    colorear1();

                }
                jTableGeneral.setModel(tgeneral);
               
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (Pestañas.getTitleAt(Pestañas.getSelectedIndex()).equals("En proceso")) {

            conexion = conexionS.conn();
            DefaultTableModel tProceso = new DefaultTableModel();
            tProceso.addColumn("NumeroOS");
            tProceso.addColumn("Fecha Ingreso");
            tProceso.addColumn("Fecha salida");
            tProceso.addColumn("Emitida por");
            tProceso.addColumn("Tecnico Asignado");
            tProceso.addColumn("Nombre Cliente");
            tProceso.addColumn("Direccion Cliente");
            tProceso.addColumn("Telefono");
            tProceso.addColumn("Correo Cliente");
            tProceso.addColumn("Tipo de dispositivo");
            tProceso.addColumn("Reporte cliente");
            tProceso.addColumn("Estatus");
            tProceso.addColumn("Estatus Pago");
            tProceso.addColumn("Total");
            jTableProceso.setModel(tProceso);

            String[] datos = new String[14];

            String sql = "select * from os where Estatus= 'En proceso'";
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
                    datos[11] = rs.getString(18);
                    datos[12] = rs.getString(19);
                    datos[13] = rs.getString(20);
                    tProceso.addRow(datos);
                    colorear2();

                }
                jTableGeneral.setModel(tProceso);
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (Pestañas.getTitleAt(Pestañas.getSelectedIndex()).equals("Terminadas")) {

            conexion = conexionS.conn();
            DefaultTableModel tTerminada = new DefaultTableModel();
            tTerminada.addColumn("NumeroOS");
            tTerminada.addColumn("Fecha Ingreso");
            tTerminada.addColumn("Fecha salida");
            tTerminada.addColumn("Emitida por");
            tTerminada.addColumn("Tecnico Asignado");
            tTerminada.addColumn("Nombre Cliente");
            tTerminada.addColumn("Direccion Cliente");
            tTerminada.addColumn("Telefono");
            tTerminada.addColumn("Correo Cliente");
            tTerminada.addColumn("Tipo de dispositivo");
            tTerminada.addColumn("Reporte cliente");
            tTerminada.addColumn("Estatus");
            tTerminada.addColumn("Estatus Pago");
            tTerminada.addColumn("Total");
            jTableTerminadas.setModel(tTerminada);

            String[] datos = new String[14];

            String sql = "select * from os where Estatus= 'Terminado'";
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
                    datos[11] = rs.getString(18);
                    datos[12] = rs.getString(19);
                    datos[13] = rs.getString(20);
                    tTerminada.addRow(datos);
                    colorear3();
                }
                jTableGeneral.setModel(tTerminada);
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (Pestañas.getTitleAt(Pestañas.getSelectedIndex()).equals("Canceladas")) {

            conexion = conexionS.conn();
            DefaultTableModel tCancelada = new DefaultTableModel();
            tCancelada.addColumn("NumeroOS");
            tCancelada.addColumn("Fecha Ingreso");
            tCancelada.addColumn("Fecha salida");
            tCancelada.addColumn("Emitida por");
            tCancelada.addColumn("Tecnico Asignado");
            tCancelada.addColumn("Nombre Cliente");
            tCancelada.addColumn("Direccion Cliente");
            tCancelada.addColumn("Telefono");
            tCancelada.addColumn("Correo Cliente");
            tCancelada.addColumn("Tipo de dispositivo");
            tCancelada.addColumn("Reporte cliente");
            tCancelada.addColumn("Estatus");
            tCancelada.addColumn("Estatus Pago");
            tCancelada.addColumn("Total");
            jTableCanceladas.setModel(tCancelada);

            String[] datos = new String[14];

            String sql = "select * from os where Estatus= 'Cancelada'";
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
                    datos[11] = rs.getString(18);
                    datos[12] = rs.getString(19);
                    datos[13] = rs.getString(20);
                    tCancelada.addRow(datos);
                    colorear4();
                }
                jTableCanceladas.setModel(tCancelada);
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (Pestañas.getTitleAt(Pestañas.getSelectedIndex()).equals("Asignada")) {

            conexion = conexionS.conn();
            DefaultTableModel tAsignada = new DefaultTableModel();
            tAsignada.addColumn("NumeroOS");
            tAsignada.addColumn("Fecha Ingreso");
            tAsignada.addColumn("Fecha salida");
            tAsignada.addColumn("Emitida por");
            tAsignada.addColumn("Tecnico Asignado");
            tAsignada.addColumn("Nombre Cliente");
            tAsignada.addColumn("Direccion Cliente");
            tAsignada.addColumn("Telefono");
            tAsignada.addColumn("Correo Cliente");
            tAsignada.addColumn("Tipo de dispositivo");
            tAsignada.addColumn("Reporte cliente");
            tAsignada.addColumn("Estatus");
            tAsignada.addColumn("Estatus Pago");
            jTableAsignado.setModel(tAsignada);

            String[] datos = new String[14];

            String sql = "select * from os where Estatus= 'Asignado'";
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
                    datos[11] = rs.getString(18);
                    datos[12] = rs.getString(19);
                    tAsignada.addRow(datos);
                    colorear5();
                }
                jTableAsignado.setModel(tAsignada);
                conexion.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_PestañasStateChanged

    private void btnSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoActionPerformed
        // TODO add your handling code here:

        if (NumOS != null) {
            Seguimiento seguimiento = new Seguimiento();
            seguimiento.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una orden de servicio");
        }

    }//GEN-LAST:event_btnSeguimientoActionPerformed

    private void btnActualizaSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaSeguimientoActionPerformed
        // TODO add your handling code here:

        if (NumOS != null) {
            ActualizarSeguimiento actualizarseguimiento = new ActualizarSeguimiento();
            actualizarseguimiento.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una Orden de servicio");
        }


    }//GEN-LAST:event_btnActualizaSeguimientoActionPerformed

    private void jTableProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProcesoMouseClicked
        // TODO add your handling code here:
        int seleccionar = jTableProceso.rowAtPoint(evt.getPoint());
        NumOS = String.valueOf(jTableProceso.getValueAt(seleccionar, 0));
        Status = String.valueOf(jTableProceso.getValueAt(seleccionar, 11));
        Pago = String.valueOf(jTableProceso.getValueAt(seleccionar, 12));

    }//GEN-LAST:event_jTableProcesoMouseClicked

    private void jTableAsignadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAsignadoMouseClicked
        // TODO add your handling code here:
        int seleccionar = jTableAsignado.rowAtPoint(evt.getPoint());
        NumOS = String.valueOf(jTableAsignado.getValueAt(seleccionar, 0));
        Status = String.valueOf(jTableAsignado.getValueAt(seleccionar, 11));
        Pago = String.valueOf(jTableAsignado.getValueAt(seleccionar, 12));
    }//GEN-LAST:event_jTableAsignadoMouseClicked

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        // TODO add your handling code here:      
        if (NumOS != null) {

            try {

                HashMap filtro = new HashMap();
                filtro.put("OS", NumOS);

                JasperPrint imprimir = JasperFillManager.fillReport(getClass().getResourceAsStream("/Reportes/report1.jasper"), filtro, conexionS.conn());
                JasperViewer ver = new JasperViewer(imprimir, false);
                ver.setVisible(true);
                ver.setTitle("Orden de servicio");
                ver.setIconImage(new ImageIcon(getClass().getResource("/icons/logo.png")).getImage());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una Orden de Servicio");
        }

    }//GEN-LAST:event_ImprimirActionPerformed

    private void jTableTerminadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTerminadasMouseClicked
        // TODO add your handling code here:
        int seleccionar = jTableTerminadas.rowAtPoint(evt.getPoint());
        NumOS = String.valueOf(jTableTerminadas.getValueAt(seleccionar, 0));

    }//GEN-LAST:event_jTableTerminadasMouseClicked

    private void ImprimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImprimirKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_ImprimirKeyPressed

    private void verSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSeguimientoActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, ui);
        
        
        
    }//GEN-LAST:event_verSeguimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio5;
    private javax.swing.JPanel Escritorio6;
    private javax.swing.JButton Imprimir;
    public static javax.swing.JTabbedPane Pestañas;
    public static javax.swing.JButton btnActualizaSeguimiento;
    public static javax.swing.JButton btnSeguimiento;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JTable jTableAsignado;
    private javax.swing.JTable jTableCanceladas;
    private javax.swing.JTable jTableGeneral;
    public static javax.swing.JTable jTableProceso;
    private javax.swing.JTable jTableTerminadas;
    private javax.swing.JButton verSeguimiento;
    // End of variables declaration//GEN-END:variables
}
