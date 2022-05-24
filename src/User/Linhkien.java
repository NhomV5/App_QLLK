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
public class Linhkien {
    private String MaLK,TenLK,LoaiLK,MaSX,Gia;
    private Number SLG;
    private Date NNH;

    public String getMaLK() {
        return MaLK;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public void setMaLK(String MaLK) {
        this.MaLK = MaLK;
    }

    public String getTenLK() {
        return TenLK;
    }

    public void setTenLK(String TenLK) {
        this.TenLK = TenLK;
    }

    public String getLoaiLK() {
        return LoaiLK;
    }

    public void setLoaiLK(String LoaiLK) {
        this.LoaiLK = LoaiLK;
    }

    public String getMaSX() {
        return MaSX;
    }

    public void setMaSX(String MaSX) {
        this.MaSX = MaSX;
    }

    public Number getSLG() {
        return SLG;
    }

    public void setSLG(Number SLG) {
        this.SLG = SLG;
    }

    public Date getNNH() {
        return NNH;
    }

    public void setNNH(Date NNH) {
        this.NNH = NNH;
    }
    
}
