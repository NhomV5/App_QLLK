/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;
import baithinhomv5_qllinhkien.NhanVien;
import baithinhomv5_qllinhkien.KetNoiSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kvan2
 */
public class NhanVienModify {
    public static List<NhanVien> getNhanVienList(String s){
        List<NhanVien> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(KetNoiSQL.URL, KetNoiSQL.USERNAME,KetNoiSQL.PASSWORD);
            
            String sql = "select * from NhanVien";
            if(s != null && !s.isEmpty()) {
                sql += " where MaNV like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                NhanVien nhanvien = new NhanVien(
                        resultSet.getString("MaNV"),
                        resultSet.getString("TenNV"),
                        resultSet.getString("SDT"),
                         resultSet.getString("Email"),
                         resultSet.getString("SaLaRy")
                );
                dataList.add(nhanvien);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(NhanVien nhanvien) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQL.URL, KetNoiSQL.USERNAME, KetNoiSQL.PASSWORD);
            
            String sql = "insert into NhanVien(MaNV,TenNV,SDT,Email,SaLaRy) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, nhanvien.getMaNV());
            statement.setString(2, nhanvien.getTenNV());
            statement.setString(3, nhanvien.getSDT());
            statement.setString(4, nhanvien.getEmail());
            statement.setString(5, nhanvien.getSaLaRy());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(NhanVien nhanvien) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQL.URL, KetNoiSQL.USERNAME, KetNoiSQL.PASSWORD);
            
            String sql = "update NhanVien set MaNV = ?, TenNV = ?, SDT = ?,Email = ?,  SaLaRy = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, nhanvien.getMaNV());
            statement.setString(2, nhanvien.getTenNV());
            statement.setString(3, nhanvien.getSDT());
            statement.setString(4, nhanvien.getEmail());
            statement.setString(5, nhanvien.getSaLaRy());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String MaNV) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQL.URL, KetNoiSQL.USERNAME, KetNoiSQL.PASSWORD);
            
            String sql = "delete from NhanVien where MaNV = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, MaNV);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public NhanVien finByid(String MaNV) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQL.URL, KetNoiSQL.USERNAME, KetNoiSQL.PASSWORD);
            String sql = "select *from NhanVien where MaNV = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1,MaNV);
            ResultSet rs=statement.executeQuery();
            if(rs.next()){
                NhanVien nv=new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setSaLaRy(rs.getString("SaLaRy"));
                return nv;
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
}
