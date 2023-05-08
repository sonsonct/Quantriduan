/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private int makh;
    private String tenkh;
    private String namsinh;
    private String sodienthoai;
    private String diachi;

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
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

    public KhachHang(int makh, String tenkh, String namsinh, String sodienthoai, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.namsinh = namsinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public KhachHang() {
    }
}
