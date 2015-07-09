/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author c0653602
 */
public class DBConnect {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/database";
            String username = "root";
            String password = "";
                con = DriverManager.getConnection(jdbc, username, password);
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println(ex.getMessage());
    }
    return con;
} 
}
