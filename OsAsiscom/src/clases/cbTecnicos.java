/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import javax.swing.DefaultComboBoxModel;
import java.sql.*;

/**
 *
 * @author rica_
 */
public class cbTecnicos extends conexionS{
    
    public DefaultComboBoxModel getvalues(){
        DefaultComboBoxModel tecnicos = new DefaultComboBoxModel();
        tecnicos.addElement("------Selecciona tecnico------");
        
        try {
            
            Connection conexion = this.conn();
            String sql = "select * from empleados where perfil = 'tecnico'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                tecnicos.addElement(rs.getString(3));
                
            }
            
        } catch (Exception e) {
            
        }
        return tecnicos;
        
    }
     
    
    
    
    
    
    
    
}
