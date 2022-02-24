/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import clases.conexionS;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rica_
 */
public class Clientes extends javax.swing.JInternalFrame {

    Connection conexion = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;

    public static String id, direccion, nombre, telefono,  correo;

    public Clientes() {
        
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        conexion = conexionS.conn();
        mostrarDatos();
        

    }

    private void mostrarDatos() {

        DefaultTableModel tclientes = new DefaultTableModel();
        tclientes.addColumn("ID");
        tclientes.addColumn("Nombre");
        tclientes.addColumn("Direccion");
        tclientes.addColumn("Telefono");
        tclientes.addColumn("Correo");
        tbClientes.setModel(tclientes);
        String[] datos = new String[5];

        String sql = "select * from clientes";
        try {

            Statement leer = conexion.createStatement();
            rs = leer.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                tclientes.addRow(datos);
            }
            tbClientes.setModel(tclientes);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Delete() {
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al Cliente "+ nombre, "Atención", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            String sql = "delete from clientes where idCliente=?";
            try {
                pst = conexion.prepareStatement(sql);
                pst.setString(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Usuario Eliminado ");
                mostrarDatos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buscar = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(1326, 880));
        setMinimumSize(new java.awt.Dimension(1326, 880));
        setPreferredSize(new java.awt.Dimension(1326, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1326, 770));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1326, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clientes.png"))); // NOI18N
        jLabel1.setText("CLIENTES");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(588, 588, 588)
                .addComponent(jLabel1)
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(80, 34, 34));
        btnRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registro.png"))); // NOI18N
        btnRegistro.setText("Registrar cliente");
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistro.setIconTextGap(50);
        btnRegistro.setPreferredSize(new java.awt.Dimension(330, 41));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 400, 50));

        btnUpdate.setBackground(new java.awt.Color(80, 34, 34));
        btnUpdate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actualizar.png"))); // NOI18N
        btnUpdate.setText("Editar Cliente");
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.setIconTextGap(50);
        btnUpdate.setPreferredSize(new java.awt.Dimension(330, 41));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 400, 50));

        btnDelete.setBackground(new java.awt.Color(80, 34, 34));
        btnDelete.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btnDelete.setText("Eliminar cliente");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.setIconTextGap(50);
        btnDelete.setPreferredSize(new java.awt.Dimension(330, 41));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 400, 50));

        tbClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbClientes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClientes.setFocusable(false);
        tbClientes.setGridColor(new java.awt.Color(102, 0, 51));
        tbClientes.setRowHeight(30);
        tbClientes.setShowGrid(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1270, 570));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 30));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 140, 200, 30));

        buscar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar cliente por ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 1326, 801);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        RegistroClient registroClient = new RegistroClient();
        registroClient.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UpdateClient updateClient = new UpdateClient();
        updateClient.setVisible(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        Delete();


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tclientes = new DefaultTableModel();
        tclientes.addColumn("ID");
        tclientes.addColumn("Nombre");
        tclientes.addColumn("Direccion");
        tclientes.addColumn("Telefono");
        tclientes.addColumn("Correo");
        tbClientes.setModel(tclientes);
        String[] datos = new String[5];

        String numero = buscar.getText();

        String sql = "select * from clientes where idCliente=" + numero;
        
        if (numero == null) {
            JOptionPane.showMessageDialog(null, "Campo Vació");
            
        }
        try {

            Statement leer = conexion.createStatement();
            rs = leer.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                tclientes.addRow(datos);
            }
            tbClientes.setModel(tclientes);

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "campos vacios");
            mostrarDatos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:

        int seleccionar = tbClientes.rowAtPoint(evt.getPoint());
        id = String.valueOf(tbClientes.getValueAt(seleccionar,0));
        nombre = String.valueOf(tbClientes.getValueAt(seleccionar, 1));
        direccion = String.valueOf(tbClientes.getValueAt(seleccionar, 2));
        telefono = String.valueOf(tbClientes.getValueAt(seleccionar, 3));
        correo = String.valueOf(tbClientes.getValueAt(seleccionar, 4));
        
        


    }//GEN-LAST:event_tbClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnDelete;
    public static javax.swing.JButton btnRegistro;
    public static javax.swing.JButton btnUpdate;
    public static javax.swing.JFormattedTextField buscar;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
