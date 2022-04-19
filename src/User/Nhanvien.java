/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Nhanvien {
    private String MaNV,TenNV,SDT;
    private Date NgSinhDate;
    private boolean Gtinh;
    private double luong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgSinhDate() {
        return NgSinhDate;
    }

    public void setNgSinhDate(Date NgSinhDate) {
        this.NgSinhDate = NgSinhDate;
    }

    public boolean isGtinh() {
        return Gtinh;
    }

    public void setGtinh(boolean Gtinh) {
        this.Gtinh = Gtinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
