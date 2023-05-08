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
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.KhachHang;
/**
 *
 * @author ADMIN
 */
public class khachhangDAO {
    public java.util.List<KhachHang> getKhachHang(){
    
        try {
            java.util.List<KhachHang> lst = new ArrayList<KhachHang>();
            String sql = "select * from khachhang";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int makh = rs.getInt("makh");
                String tenkh = rs.getString("tenkh");
                
                String namsinh = rs.getString("namsinh");
                String diachi = rs.getString("diachi");
                String sodienthoai = rs.getString("sodienthoai");
                
                
                KhachHang obj = new KhachHang(makh, tenkh, namsinh, sodienthoai, diachi);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public boolean insert (KhachHang KH) throws Exception
    {    
        
        
            String sql = " insert into khachhang(tenkh, namsinh, diachi, sodienthoai) values (N'"+KH.getTenkh()+"',?,N'"+KH.getDiachi()+"',?)";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, KH.getNamsinh());
            st.setString(2, KH.getSodienthoai());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;          
        

    }
    public boolean update (KhachHang KH)
    {
        
        try {
            String sql = " update khachhang set tenkh=N'"+KH.getTenkh()+"', namsinh=?, diachi=N'"+KH.getDiachi()+"', sodienthoai=? where makh=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1, KH.getNamsinh());
            st.setString(2, KH.getSodienthoai());
            st.setInt(3, KH.getMakh());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public boolean delete (int makh)
    {
        
        try {
            String sql = " delete from khachhang where makh = ?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,makh);
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public java.util.List<KhachHang> Search (String tenkh)
    {
        java.util.List<KhachHang> DG = new ArrayList<KhachHang>();
        String sql = "select * from khachhang where tenkh like '%"+tenkh+"%'";
        try {
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                KhachHang obj = new KhachHang();
                obj.setMakh(rs.getInt("makh"));
                obj.setTenkh(rs.getString("tenkh"));
                obj.setNamsinh(rs.getString("namsinh"));
                obj.setDiachi(rs.getString("diachi"));
                obj.setSodienthoai(rs.getString("sodienthoai"));
                DG.add(obj);
            }
            return DG;
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return null;
        
    }
}
