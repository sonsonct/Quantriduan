/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class taikhoanDAO {
    public TaiKhoan GetTaiKhoan(String TK, String MK){
        TaiKhoan td = null;
        try{
            String sql = "Select manv, matkhau, phanquyen From nhanvien Where manv=? and MatKhau=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, TK);
            st.setString(2, MK);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
               td  = new TaiKhoan(rs.getString(1), rs.getString(2),rs.getInt(3));
               return td;
            }
            conn.close();
            st.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi dn!"+ex);
            System.out.println(ex);
        }
        return null;
    }
    
    public Integer GetLV(String manv){
        int lv = 0;
        try{
            String sql = "SELECT phanquyen FROM nhanvien WHERE manv='"+manv+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
               lv = rs.getInt("phanquyen");
            }
            
            conn.close();
            st.close();
            return lv;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi pk!"+ex);
        }
        return null;
    }
}
