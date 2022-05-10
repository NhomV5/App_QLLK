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
     /*public Linhkien getProductByNNH(String Date){
        Connection connection=ConnectionJDBC.getJDBCConnection();
        String sql="SELECT * FROM product where idProduct=?";
        try{
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, IdProduct);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                Product product=new Product();
                product.setIdProduct(rs.getInt("IdProduct"));
                product.setName(rs.getString("NameProduct"));
                product.setQuantity(rs.getInt("Quantity"));
                
                return product;
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        return null;
    }*/
}
