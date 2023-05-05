/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ctHoaDon {
    private int macthd;
    private int mahd;
    private int maqa;
    private String tenqa;
    private float gia;
    private int soluong;

    public int getMacthd() {
        return macthd;
    }

    public void setMacthd(int macthd) {
        this.macthd = macthd;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

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

    public ctHoaDon(int macthd, int mahd, int maqa, String tenqa, float gia, int soluong) {
        this.macthd = macthd;
        this.mahd = mahd;
        this.maqa = maqa;
        this.tenqa = tenqa;
        this.gia = gia;
        this.soluong = soluong;
    }

    public ctHoaDon(int mahd, int maqa, String tenqa, float gia, int soluong) {
        this.mahd = mahd;
        this.maqa = maqa;
        this.tenqa = tenqa;
        this.gia = gia;
        this.soluong = soluong;
    }

    
    public ctHoaDon() {
    }
}
