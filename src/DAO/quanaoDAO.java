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
import model.QuanAo;

/**
 *
 * @author ADMIN
 */
public class quanaoDAO {
    public java.util.List<QuanAo> getQuanAo(){
    
        try {
            java.util.List<QuanAo> lst = new ArrayList<QuanAo>();
            String sql = "select * from quanao";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int maqa = rs.getInt("maqa");
                String tenqa = rs.getString("tenqa");
                
                String hang = rs.getString("hang");
                float gia = rs.getFloat("gia");
                int soluong = rs.getInt("soluong");
                
                
                QuanAo obj = new QuanAo(maqa, tenqa, hang, gia, soluong);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public java.util.List<QuanAo> getQuanAoByeGiaCao(){
    
        try {
            java.util.List<QuanAo> lst = new ArrayList<QuanAo>();
            String sql = "SELECT * FROM quanao ORDER BY gia DESC";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int maqa = rs.getInt("maqa");
                String tenqa = rs.getString("tenqa");
                
                String hang = rs.getString("hang");
                float gia = rs.getFloat("gia");
                int soluong = rs.getInt("soluong");
                
                
                QuanAo obj = new QuanAo(maqa, tenqa, hang, gia, soluong);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public java.util.List<QuanAo> getQuanAoByeGiaThap(){
    
        try {
            java.util.List<QuanAo> lst = new ArrayList<QuanAo>();
            String sql = "SELECT * FROM quanao ORDER BY gia";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int maqa = rs.getInt("maqa");
                String tenqa = rs.getString("tenqa");
                
                String hang = rs.getString("hang");
                float gia = rs.getFloat("gia");
                int soluong = rs.getInt("soluong");
                
                
                QuanAo obj = new QuanAo(maqa, tenqa, hang, gia, soluong);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public Integer getsoluong(int maqa){
    
        try {
            int soluong = 0;
            String sql = "select soluong from quanao where maqa='"+maqa+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {

                soluong = rs.getInt("soluong");
                
            }
            conn.close();
            st.close();
            return soluong;
            
        } catch (Exception e) {
        }
        return null;
    }
    public boolean insert (QuanAo KH) throws Exception
    {    
        
        
            String sql = " insert into quanao(tenqa, hang, gia, soluong) values (?,?,?,?)";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);      
            st.setString(1, KH.getTenqa());
            st.setString(2, KH.getHang());
            st.setFloat(3, KH.getGia());
            st.setInt(4, KH.getSoluong());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;          
        

    }
    public boolean update (QuanAo KH)
    {
        
        try {
            String sql = " update quanao set tenqa=?, hang=?, gia=?, soluong=? where maqa=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            
            st.setString(1, KH.getTenqa());
            st.setString(2, KH.getHang());
            st.setFloat(3, KH.getGia());
            st.setInt(4, KH.getSoluong());
            st.setInt(5, KH.getMaqa());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public boolean updatesl (int soluong, int maqa)
    {
        
        try {
            String sql = " update quanao set soluong=? where maqa=?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            
            
            st.setInt(1, soluong);
            st.setInt(2, maqa);
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public boolean delete (int maqa)
    {
        
        try {
            String sql = " delete from quanao where maqa = ?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,maqa);
            int check = st.executeUpdate();
            conn.close();
            st.close();
            
            return check > 0;
            
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return false;
    }
    public java.util.List<QuanAo> SearchByTen (String ten)
    {
        java.util.List<QuanAo> DG = new ArrayList<QuanAo>();
        String sql = "select * from quanao where tenqa like '%"+ten+"%'";
        try {
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                QuanAo obj = new QuanAo();
                obj.setMaqa(rs.getInt("maqa"));
                obj.setTenqa(rs.getString("tenqa"));
                obj.setHang(rs.getString("hang"));
                obj.setGia(rs.getFloat("gia"));
                obj.setSoluong(rs.getInt("soluong"));
                
                DG.add(obj);
            }
            return DG;
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return null;
        
    }
    public java.util.List<QuanAo> SearchByMa (int ma)
    {
        java.util.List<QuanAo> DG = new ArrayList<QuanAo>();
        String sql = "select * from quanao where maqa like '%"+ma+"%'";
        try {
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                QuanAo obj = new QuanAo();
                obj.setMaqa(rs.getInt("maqa"));
                obj.setTenqa(rs.getString("tenqa"));
                obj.setHang(rs.getString("hang"));
                obj.setGia(rs.getFloat("gia"));
                obj.setSoluong(rs.getInt("soluong"));
                
                DG.add(obj);
            }
            return DG;
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return null;
        
    }
    public java.util.List<QuanAo> SearchByHang (String hang)
    {
        java.util.List<QuanAo> DG = new ArrayList<QuanAo>();
        String sql = "select * from quanao where hang like '%"+hang+"%'";
        try {
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                QuanAo obj = new QuanAo();
                obj.setMaqa(rs.getInt("maqa"));
                obj.setTenqa(rs.getString("tenqa"));
                obj.setHang(rs.getString("hang"));
                obj.setGia(rs.getFloat("gia"));
                obj.setSoluong(rs.getInt("soluong"));
                
                DG.add(obj);
            }
            return DG;
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e.getMessage());
        }
        return null;
        
    }
}
