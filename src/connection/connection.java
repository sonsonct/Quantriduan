/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;
/**
 *
 * @author ADMIN
 */
public class connection {
    public static Connection getConnection()
    {
        String userid = "sa";
        String pass = "123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=shopquanao;encrypt=false;";
            conn = DriverManager.getConnection(dbURL, userid, pass);
        } catch (Exception ex) {
            System.out.println("Loi ket noi"+ ex.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        Connection conn = getConnection();
        if(conn !=null){
            try {
                System.out.println("Ket noi thanh cong");
            } catch (Exception e) {
                System.out.println("Loi ket noi"+ e.getMessage());
            }
            
        }else{
            System.out.println("That bai");
        }
    }
}
