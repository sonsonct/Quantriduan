/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import model.NhanVien;

/**
 *
 * @author ADMIN
 */
public class nhanvienDAO {
    public java.util.List<NhanVien> getNhanVien(){
    
        try {
            java.util.List<NhanVien> lst = new ArrayList<NhanVien>();
            String sql = "select * from nhanvien";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                String manv = rs.getString("manv");
                String matkhau = rs.getString("matkhau");
                String tenkh = rs.getString("tennv");
                
                Date namsinh = rs.getDate("namsinh");
                String diachi = rs.getString("diachi");
                String sodienthoai = rs.getString("sodienthoai");
                int phanquyen = rs.getInt("phanquyen");
                
                
                NhanVien obj = new NhanVien(manv, matkhau, tenkh, namsinh, sodienthoai, diachi, phanquyen);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public boolean insert (NhanVien KH) throws Exception
    {    
        
        
            String sql = "INSERT INTO nhanvien(manv, matkhau, tennv, namsinh, sodienthoai, diachi, phanquyen) VALUES (?,?,N'"+KH.getTennv()+"',?,?,N'"+KH.getDiachi()+"','1')";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, KH.getManv());
            st.setString(2, KH.getMatkhau());
            st.setDate(3, new java.sql.Date(KH.getNamsinh().getTime()));
            st.setString(4, KH.getSodienthoai());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;          
        

    }
    public boolean update (NhanVien KH)
    {
        
        try {
            String sql = " UPDATE nhanvien SET matkhau=?,tennv=N'"+KH.getTennv()+"',namsinh=?,sodienthoai=?,diachi=N'"+KH.getDiachi()+"' WHERE manv=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            
            st.setString(4, KH.getManv());
            st.setString(1, KH.getMatkhau());
            st.setDate(2, new java.sql.Date(KH.getNamsinh().getTime()));
            st.setString(3, KH.getSodienthoai());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public boolean delete (String manv)
    {
        
        try {
            String sql = " delete from nhanvien where manv = ?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,manv);
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public java.util.List<NhanVien> Search (String ten)
    {
        java.util.List<NhanVien> DG = new ArrayList<NhanVien>();
        String sql = "select * from nhanvien where tennv like '%"+ten+"%'";
        try {
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                NhanVien obj = new NhanVien();
                obj.setManv(rs.getString("manv"));
                obj.setTennv(rs.getString("tennv"));
                obj.setNamsinh(rs.getDate("namsinh"));
                obj.setDiachi(rs.getString("diachi"));
                obj.setSodienthoai(rs.getString("sodienthoai"));
                obj.setPhanquyen(rs.getInt("phanquyen"));
                DG.add(obj);
            }
            return DG;
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return null;
        
    }
}
