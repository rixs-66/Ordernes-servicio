/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.*;

/**
 *
 * @author rica_
 */
public class conexionS {
    //metodo de conexion 
    public static Connection conn(){
        java.sql.Connection conexion = null;
        //llamamos la libreria
        String driver = "com.mysql.cj.jdbc.Driver";
        //informacion de la base de datos
        String url="jdbc:mysql://localhost:3306/dbasiscom";
        String user="root";
        String password="";
        
        //establecer conecion entre java y base de datos
        try {
            Class.forName(driver);
            conexion  = DriverManager.getConnection(url,user,password);
            return conexion;
        } catch (Exception e) {
            return null;
        }
    }
}