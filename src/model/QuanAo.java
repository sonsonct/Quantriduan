/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class QuanAo {
    private int maqa;
    private String tenqa;
    private String hang;
    private float gia;
    private int soluong;

    public int getMaqa() {
        return maqa;
    }

    public void setMaqa(int maqa) {
        this.maqa = maqa;
    }

    public String getTenqa() {
        return tenqa;
    }

    public void setTenqa(String tenqa) {
        this.tenqa = tenqa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public QuanAo() {
    }

    public QuanAo(int maqa, String tenqa, String hang, float gia, int soluong) {
        this.maqa = maqa;
        this.tenqa = tenqa;
        this.hang = hang;
        this.gia = gia;
        this.soluong = soluong;
    }
    
}
