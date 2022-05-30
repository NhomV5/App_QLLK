/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
       String MaNV,TenNV,SDT,Email,SaLaRy;
public NhanVien(){
    
}

    public NhanVien(String MaNV, String TenNV, String SDT, String Email, String SaLaRy) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT = SDT;
        this.Email = Email;
        this.SaLaRy = SaLaRy;
    }

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSaLaRy() {
        return SaLaRy;
    }

    public void setSaLaRy(String SaLaRy) {
        this.SaLaRy = SaLaRy;
    }
    
}

   