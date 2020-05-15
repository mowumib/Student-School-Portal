/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Mowumi
 */
public class dbConnection {
    public static Connection conn(){
        Connection conn = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db?serverTimezone=UTC", "root", "");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    return conn;
    }
}
