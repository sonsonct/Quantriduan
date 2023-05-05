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
import model.ctHoaDon;

/**
 *
 * @author ADMIN
 */
public class cthoadonDAO {
    public java.util.List<ctHoaDon> getData(int ma){
    
        try {
            java.util.List<ctHoaDon> lst = new ArrayList<ctHoaDon>();
            String sql = "select * from chitiethoadon where mahd='"+ma+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                int mahd = rs.getInt("mahd");
                int maqa = rs.getInt("maqa");
                
                String tenqa = rs.getString("tenqa");
                float gia = rs.getFloat("gia");
                int soluong = rs.getInt("soluong");
                
                
                ctHoaDon obj = new ctHoaDon(mahd, maqa, tenqa, gia, soluong);
                lst.add(obj);
            }
            conn.close();
            st.close();
            return lst;
            
        } catch (Exception e) {
        }
        return null;
    }
    public boolean insert (ctHoaDon KH) throws Exception
    {    
        
        
            String sql = " insert into chitiethoadon(mahd, maqa, tenqa, gia, soluong) values (?,?,?,?, ?)";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, KH.getMahd());
            st.setInt(2, KH.getMaqa());
            st.setString(3, KH.getTenqa());
            st.setFloat(4, KH.getGia());
            st.setInt(5, KH.getSoluong());
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;          
        

    }
    public boolean update (ctHoaDon KH) throws Exception
    {    
        
        
            String sql = " update chitiethoadon set soluong = ? where macthd = ?";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, KH.getSoluong());
            st.setInt(2, KH.getMaqa());
           
            int check = st.executeUpdate();
            conn.close();
            st.close();
            return check > 0;          
        

    }
    public boolean delete (int maqa)
    {
        
        try {
            String sql = " delete from chitiethoadon where maqa = ?";
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
    public Float getGia(int mahd){
    
        try {
            float gia=0;
            String sql = "SELECT sum(gia*soluong) as tongtien FROM chitiethoadon WHERE mahd='"+mahd+"'";
            Connection conn = connection.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                gia = rs.getFloat("tongtien");
               
            }
            conn.close();
            st.close();
            return gia;
            
        } catch (Exception e) {
        }
        return null;
    }
}

