/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String manv;
    private String matkhau;
    private String tennv;
    private Date namsinh;
    private String sodienthoai;
    private String diachi;
    private int phanquyen;

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public Date getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Date namsinh) {
        this.namsinh = namsinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getPhanquyen() {
        return phanquyen;
    }

    public void setPhanquyen(int phanquyen) {
        this.phanquyen = phanquyen;
    }

    public NhanVien(String manv, String matkhau, String tennv, Date namsinh, String sodienthoai, String diachi, int phanquyen) {
        this.manv = manv;
        this.matkhau = matkhau;
        this.tennv = tennv;
        this.namsinh = namsinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
        this.phanquyen = phanquyen;
    }
    
   

    public NhanVien() {
    }
}
