/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.sql.*;
import javax.swing.JOptionPane;
import static practice.Practice.conn;

/**
 *
 * @author user
 */

public class Practice {

    /**
     * @param args the command line arguments
     */
    
            public static void main(String[] args){
                Connection conn = conn();
            }
            
    public static Connection conn() {
        // TODO code application logic here
        try{
            String url="jdbc:mysql://localhost:3306/sathi";
            Class.forName("com.mysql.jdbc.Driver");// address of driver
            Connection conn =DriverManager.getConnection(url,"root","");
           System.out.print("connected");
           //PreparedStatement stmt=conn.prepareStatement("Insert into student values('333','FFFFF','20','M','2023-5-5')");
           //stmt.executeUpdate();
           //ResultSet to take data
           return conn;
           
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
                    
        }
        Connection conn = null;
        return conn;
    }
    
}
