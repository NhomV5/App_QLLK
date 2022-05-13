/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Next1 {
    private Action action;
    public Next1(){
        action = new Action();
    }
    public List<Linhkien> getalllinhkiens(){
        return action.getalllLinhkienss();    
    }
    public void addLinhkien237(Linhkien item) throws SQLException{
    action.addLinhkien237(item);
    }
    public void DeletetLinhkien237(String id) throws SQLException{
    action.DeletetLinhkien237(id);
    }
    public Linhkien getmalk237(String malk) throws SQLException {
        return action.getmalk237(malk);
    }
    public void updatelinhkien237(Linhkien item) throws SQLException {
        action.updatelinhkien237(item);
    }
    public List<Nhanvien> getallNhanvien(){
        return action.getallNhanvien();
    }
}
