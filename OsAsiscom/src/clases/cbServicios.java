/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author rica_
 */
public class cbServicios extends conexionS{
     public DefaultComboBoxModel getvalues(){
        DefaultComboBoxModel catalogoprecios = new DefaultComboBoxModel();
        catalogoprecios.addElement("   ------Selecciona Servicio------");
        
        try {
            
            Connection conexion = this.conn();
            String sql = "select descripcion from catalogoprecios";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                catalogoprecios.addElement(rs.getString(1));
                
            }
            
        } catch (Exception e) {
            
        }
        return catalogoprecios;
        
    }
    
}
