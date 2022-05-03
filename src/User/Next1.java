/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

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
    public List<Nhanvien> getallNhanvien(){
        return action.getallNhanvien();
    }
}
