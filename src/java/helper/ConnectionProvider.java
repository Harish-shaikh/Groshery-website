/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.*;
import java.sql.DriverManager;
import static java.sql.DriverManager.println;

/**
 *
 * @author harish shaikh
 */
public class ConnectionProvider {
    public static Connection con;
    public static Connection getConnection(){
        if(con==null)
            println("hvhsdvf");
            try{
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/groshery","root","harish");
            }
            catch(Exception l){
                
            }
        
        return con;
    }
}
