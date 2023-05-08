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
import model.HoaDon;
import model.ctHoaDon;
import model.tthoadon;

/**
 *
 * @author ADMIN
 */
public class hoadonDAO {
    public java.util.List<tthoadon> getTT(int mahd){
    
        try {
            java.util.List<tthoadon> lst = new ArrayList<tthoadon>();
            String sql = "SELECT hoadon.makh,tenkh, diachi, sodienthoai, manv FROM hoadon, khachhang WHERE hoadon.makh=khachhang.makh AND hoadon.makh='"+mahd+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int makh = rs.getInt("makh");
                String tenkh = rs.getString("tenkh");
                String diachi = rs.getString("diachi");
                String sdt = rs.getString("sodienthoai");
                String manv = rs.getString("manv");
                
                
               
                tthoadon obj = new tthoadon(makh, tenkh, diachi, sdt, manv);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public java.util.List<HoaDon> getHoaDon(){
    
        try {
            java.util.List<HoaDon> lst = new ArrayList<HoaDon>();
            String sql = "select * from hoadon";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int mahd = rs.getInt("mahd");
                String manv = rs.getString("manv");
                int makh = rs.getInt("makh");
                float tongtien = rs.getFloat("tongtien");
                Date ngaytao = rs.getDate("ngaytao");
                HoaDon obj = new HoaDon(mahd, manv, makh, tongtien, ngaytao);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public boolean insert (HoaDon KH)
    {    
        try {
            String sql = " insert into hoadon(manv, makh, ngaytao) values (?,?,?)";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, KH.getManv());
            st.setInt(2, KH.getMakh());
            st.setDate(3, new java.sql.Date(KH.getNgaytao().getTime()) );
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
                      
    }
    public boolean update (float tongtien,int mahd)
    {
        
        try {
            String sql = " update hoadon set tongtien=? where mahd=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            
            st.setFloat(1, tongtien);
            st.setInt(2, mahd);
           
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public boolean delete (int mahd)
    {
        
        try {
            String sql = " delete from hoadon where mahd = ?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,mahd);
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public java.util.List<HoaDon> getHoaDonBYEDATE(String batdau, String ketthuc){
    
        try {
            java.util.List<HoaDon> lst = new ArrayList<HoaDon>();
            String sql = "select * from hoadon where ngaytao>='"+batdau+"' AND ngaytao<='"+ketthuc+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int mahd = rs.getInt("mahd");
                String manv = rs.getString("manv");
                int makh = rs.getInt("makh");
                float tongtien = rs.getFloat("tongtien");
                Date ngaytao = rs.getDate("ngaytao");
                HoaDon obj = new HoaDon(mahd, manv, makh, tongtien, ngaytao);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public Float tongtien()
    {
        
        try {
            float tongtien =0;
            String sql = "SELECT SUM(tongtien) as 'tong' FROM hoadon";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
              tongtien = rs.getFloat("tong");
            }
            conn.close();
            st.close();
            return tongtien;
            
        } catch (Exception e) {
        }
        return null;
    }
    public Float tongtienBYEDATE(String batdau, String ketthuc)
    {
        
        try {
            float tongtien =0;
            String sql = "SELECT SUM(tongtien) as 'tong' FROM hoadon where ngaytao>='"+batdau+"' AND ngaytao<='"+ketthuc+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
              tongtien = rs.getFloat("tong");
            }
            conn.close();
            st.close();
            return tongtien;
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
