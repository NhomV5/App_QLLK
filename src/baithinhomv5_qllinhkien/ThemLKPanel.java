/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import User.Action;
import User.Linhkien;
import User.Next1;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ThemLKPanel extends javax.swing.JPanel {
   DefaultTableModel tbmModel;
    Action action = new Action();
    Next1 next1;
    Linhkien linhkien;
    
    /**
     * Creates new form ThemPanel
     */
    public ThemLKPanel() {
        initComponents();
        next1 = new Next1();
        tbmModel= new DefaultTableModel();
        tableLK_237.setModel(tbmModel);
        tbmModel.addColumn("Malk");
        tbmModel.addColumn("TenLK");
        tbmModel.addColumn("LoaiLK");
        tbmModel.addColumn("Gia");
        tbmModel.addColumn("SLG");
        tbmModel.addColumn("NNH");
        tbmModel.addColumn("MaSX");
        
       
       List<Linhkien> linhkiens = next1.getalllinhkiens();
        for(Linhkien linhkien: linhkiens){
            tbmModel.addRow(new Object[]{linhkien.getMaLK(), linhkien.getTenLK(),linhkien.getLoaiLK(),linhkien.getGia(),linhkien.getSLG(),linhkien.getNNH(),linhkien.getMaSX()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbManhanvien_28 = new javax.swing.JLabel();
        txtMalk_237 = new javax.swing.JTextField();
        lbTenNV_28 = new javax.swing.JLabel();
        txtTenLK_237 = new javax.swing.JTextField();
        lbllk_237 = new javax.swing.JLabel();
        txtGia_237 = new javax.swing.JTextField();
        lbGia = new javax.swing.JLabel();
        lbSdt_28 = new javax.swing.JLabel();
        txtMSX_237 = new javax.swing.JTextField();
        lbsoLuong_237 = new javax.swing.JLabel();
        txtsoLuong_237 = new javax.swing.JTextField();
        btnThem_237 = new javax.swing.JButton();
        lbThem_237 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtngay_237 = new javax.swing.JTextField();
        txtllk = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLK_237 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbManhanvien_28.setText("M?? Linh Ki???n:");

        lbTenNV_28.setText("T??n Linh ki???n:");

        lbllk_237.setText("Lo???i linh ki???n:");

        lbGia.setText("Gi??:");

        lbSdt_28.setText("M?? nh?? sx:");

        lbsoLuong_237.setText("S??? L????ng:");

        btnThem_237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_20px.png"))); // NOI18N
        btnThem_237.setText("Th??m ");
        btnThem_237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_237ActionPerformed(evt);
            }
        });

        lbThem_237.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThem_237.setForeground(new java.awt.Color(255, 51, 102));
        lbThem_237.setText("Th??m linh ki???n");

        jLabel1.setText("Ng??y Nh???p H??ng:");

        tableLK_237.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableLK_237);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbThem_237)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbManhanvien_28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMalk_237, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbTenNV_28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTenLK_237, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnThem_237, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(lbllk_237))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtngay_237, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(txtllk))
                                    .addGap(65, 65, 65)
                                    .addComponent(lbGia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtGia_237, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbsoLuong_237)
                    .addComponent(lbSdt_28))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMSX_237)
                    .addComponent(txtsoLuong_237, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbThem_237)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenNV_28)
                            .addComponent(txtTenLK_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMalk_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbManhanvien_28)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsoLuong_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbsoLuong_237)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllk_237)
                        .addComponent(txtllk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGia)
                            .addComponent(txtGia_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbSdt_28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMSX_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtngay_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnThem_237, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem_237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_237ActionPerformed
        // TODO add your handling code here:
        linhkien = new Linhkien();
        linhkien.setMaLK(txtMalk_237.getText());
        linhkien.setTenLK(txtTenLK_237.getText());
        linhkien.setSLG(Integer.valueOf(txtsoLuong_237.getText()));
        linhkien.setLoaiLK(txtllk.getText());
        linhkien.setGia(txtGia_237.getText());
        linhkien.setMaSX(txtMSX_237.getText());
        linhkien.setNNH(java.sql.Date.valueOf(txtngay_237.getText()));
       try {
           next1.addLinhkien237(linhkien);
       } catch (SQLException ex) {
           Logger.getLogger(ThemLKPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
       
      
    }//GEN-LAST:event_btnThem_237ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem_237;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbGia;
    private javax.swing.JLabel lbManhanvien_28;
    private javax.swing.JLabel lbSdt_28;
    private javax.swing.JLabel lbTenNV_28;
    private javax.swing.JLabel lbThem_237;
    private javax.swing.JLabel lbllk_237;
    private javax.swing.JLabel lbsoLuong_237;
    private javax.swing.JTable tableLK_237;
    private javax.swing.JTextField txtGia_237;
    private javax.swing.JTextField txtMSX_237;
    private javax.swing.JTextField txtMalk_237;
    private javax.swing.JTextField txtTenLK_237;
    private javax.swing.JTextField txtllk;
    private javax.swing.JTextField txtngay_237;
    private javax.swing.JTextField txtsoLuong_237;
    // End of variables declaration//GEN-END:variables

    
}
