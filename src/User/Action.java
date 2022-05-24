/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;


import Connection.ConnectionJDBC;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class Action {
    public List<Linhkien> getalllLinhkienss(){
        List<Linhkien> linhkiens= new ArrayList<Linhkien>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM LinhKien";
        try{
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Linhkien linhkien=new Linhkien();
                linhkien.setMaLK(rs.getString("MaLK"));
                linhkien.setTenLK(rs.getString("TenLK"));
                linhkien.setLoaiLK(rs.getString("LLK"));
                linhkien.setGia(rs.getString("Gia"));
                linhkien.setSLG(rs.getInt("SLG"));
                linhkien.setNNH(rs.getDate("NNH"));
                linhkien.setMaSX(rs.getString("MaSX"));
                
                
                
                linhkiens.add(linhkien);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        return linhkiens;
    }
     public void addLinhkien237(Linhkien item) throws SQLException {
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql = "INSERT INTO LinhKien( MaLK,TenLK,SLG,LLK,Gia,MaSX,NNH)"
                + "values(?,?,?,?,?,?,? )";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, item.getMaLK());
            preparedStatement.setString(2, item.getTenLK());
            preparedStatement.setInt(3, (int) item.getSLG());
            preparedStatement.setString(4, item.getLoaiLK());
            preparedStatement.setString(5, item.getGia());
            preparedStatement.setString(6, item.getMaSX());
            preparedStatement.setDate(7, (Date) item.getNNH());

            preparedStatement.executeUpdate();
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public void DeletetLinhkien237(String id) throws SQLException{
         Connection connection = ConnectionJDBC.getJDBCConnection();
         String sql="delete from LinhKien where MaLK = ? ";
         try {
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1, id);
             preparedStatement.executeUpdate();
            
         }catch (SQLException e){
                e.printStackTrace();
        }
    }
     public Linhkien getmalk237(String malk) throws SQLException {
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql = "SELECT * FROM LinhKien where MaLK = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, malk);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Linhkien linhkien=new Linhkien();
                linhkien.setMaLK(rs.getString("MaLK"));
                linhkien.setTenLK(rs.getString("TenLK"));
                linhkien.setLoaiLK(rs.getString("LLK"));
                linhkien.setGia(rs.getString("Gia"));
                linhkien.setSLG(rs.getInt("SLG"));
                linhkien.setNNH(rs.getDate("NNH"));
                linhkien.setMaSX(rs.getString("MaSX"));

                return linhkien;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
         public void updatelinhkien237(Linhkien item) throws SQLException {
        Connection connection = ConnectionJDBC.getJDBCConnection();
        String sql = "Update LinhKien set TenLK = ?,SLG = ?,LLK = ?,Gia=?,MaSX=?,NNH=? Where MaLK = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

           
            preparedStatement.setString(1, item.getTenLK());
            preparedStatement.setInt(2, (int) item.getSLG());
            preparedStatement.setString(3, item.getLoaiLK());
            preparedStatement.setString(4, item.getGia());
            preparedStatement.setString(5, item.getMaSX());
            preparedStatement.setDate(6, (Date) item.getNNH());
            preparedStatement.setString(7, item.getMaLK());
             preparedStatement.executeUpdate();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public List<Nhanvien> getallNhanvien(){
        List<Nhanvien>  nhanviens = new ArrayList<Nhanvien>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM NHANVIEN";
        try{
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Nhanvien nhanvien=new Nhanvien();
                nhanvien.setMaNV(rs.getString("MaNV"));
                nhanvien.setTenNV(rs.getString("TenNV"));
                nhanvien.setSDT(rs.getString("SDT"));
                nhanvien.setNgSinhDate(rs.getDate("NgSinh"));
                nhanvien.setGtinh(rs.getBoolean("Gtinh"));
                
                nhanviens.add(nhanvien);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        return nhanviens;
    }
    
     public List<Linhkien> getProductByNNH(String Date1,String Date2){
        List<Linhkien> linhkiens= new ArrayList<>();
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql=" SELECT * FROM LinhKien where NNH BETWEEN ' " + Date1 + " 00:00:00 '  AND ' " + Date2 + " 23:59:59 ' ";
        try{
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Linhkien linhkien=new Linhkien();
                linhkien.setMaLK(rs.getString("MaLK"));
                linhkien.setTenLK(rs.getString("TenLK"));
                linhkien.setLoaiLK(rs.getString("LLK"));
                linhkien.setGia(rs.getString("Gia"));
                linhkien.setSLG(rs.getInt("SLG"));
                linhkien.setNNH(rs.getDate("NNH"));
                linhkien.setMaSX(rs.getString("MaSX"));
                linhkiens.add(linhkien);
                
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        return linhkiens;
    }
}