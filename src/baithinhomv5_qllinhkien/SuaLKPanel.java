/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import User.Action;
import User.Linhkien;
import User.Next1;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class SuaLKPanel extends javax.swing.JPanel {
    DefaultTableModel tbmModel;
    Action action = new Action();
    Next1 next1;
    Linhkien linhkien;
    /**
     * Creates new form SuaPanel
     */
    public SuaLKPanel() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lbTieude_237 = new javax.swing.JLabel();
        btnCapnhat237 = new javax.swing.JButton();
        txtsoLuong_237 = new javax.swing.JTextField();
        lbsoLuong_237 = new javax.swing.JLabel();
        lbSdt_28 = new javax.swing.JLabel();
        txtMSX_237 = new javax.swing.JTextField();
        txtGia_237 = new javax.swing.JTextField();
        txtTenLK_237 = new javax.swing.JTextField();
        lbTenNV_28 = new javax.swing.JLabel();
        lbGia = new javax.swing.JLabel();
        lbllk_237 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtngay_237 = new javax.swing.JTextField();
        txtllk237 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableLK_237 = new javax.swing.JTable();
        chon237 = new javax.swing.JButton();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        lbTieude_237.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTieude_237.setForeground(new java.awt.Color(255, 51, 102));
        lbTieude_237.setText("Cập Nhật Linh Kiện");

        btnCapnhat237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_computer_support_20px.png"))); // NOI18N
        btnCapnhat237.setText("Cập Nhật");
        btnCapnhat237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat237ActionPerformed(evt);
            }
        });

        lbsoLuong_237.setText("Số Lương:");

        lbSdt_28.setText("Mã nhà sx:");

        txtGia_237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGia_237ActionPerformed(evt);
            }
        });

        txtTenLK_237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLK_237ActionPerformed(evt);
            }
        });

        lbTenNV_28.setText("Tên Linh kiện:");

        lbGia.setText("Giá:");

        lbllk_237.setText("Loại linh kiện:");

        jLabel1.setText("Ngày Nhập Hàng:");

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
        jScrollPane3.setViewportView(tableLK_237);

        chon237.setText("Chọn");
        chon237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chon237ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTieude_237)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lbllk_237, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTenNV_28, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTenLK_237)
                                            .addComponent(txtngay_237, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(txtllk237))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lbGia)
                                                .addGap(33, 33, 33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbsoLuong_237)
                                                .addGap(37, 37, 37))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnCapnhat237, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtsoLuong_237)
                                    .addComponent(txtGia_237, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(chon237, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(47, 47, 47)
                        .addComponent(lbSdt_28)
                        .addGap(18, 18, 18)
                        .addComponent(txtMSX_237, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTieude_237)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsoLuong_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsoLuong_237)
                    .addComponent(txtTenLK_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenNV_28))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllk_237)
                        .addComponent(txtllk237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbSdt_28)
                                .addComponent(txtGia_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbGia))
                            .addComponent(txtMSX_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtngay_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapnhat237, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(chon237, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenLK_237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLK_237ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLK_237ActionPerformed

    private void txtGia_237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGia_237ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGia_237ActionPerformed

    private void chon237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chon237ActionPerformed
        // TODO add your handling code here:
        int row = tableLK_237.getSelectedRow();
        String mssv = String.valueOf(tableLK_237.getValueAt(row, 0));
        next1 = new Next1();
        try {
            linhkien = next1.getmalk237(mssv);
        } catch (SQLException ex) {
            Logger.getLogger(SuaLKPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTenLK_237.setText(linhkien.getTenLK());
        txtsoLuong_237.setText(String.valueOf(linhkien.getSLG()));
        txtGia_237.setText(String.valueOf(linhkien.getGia()));
        txtllk237.setText(linhkien.getLoaiLK());
        txtMSX_237.setText(linhkien.getMaSX());
        txtngay_237.setText(String.valueOf(linhkien.getNNH()));
        
    }//GEN-LAST:event_chon237ActionPerformed

    private void btnCapnhat237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat237ActionPerformed
        // TODO add your handling code here:
        int row = tableLK_237.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(SuaLKPanel.this, "vui long chon sach muon sua", "loi", JOptionPane.ERROR_MESSAGE);
            } else {
            int confirm = JOptionPane.showConfirmDialog(SuaLKPanel.this, "Bạn chắc chắn muốn sửa ?");
            if (confirm == JOptionPane.YES_OPTION) {
        linhkien.setTenLK(txtTenLK_237.getText());
        linhkien.setSLG(Integer.valueOf(txtsoLuong_237.getText()));
        linhkien.setGia(txtGia_237.getText());
        linhkien.setLoaiLK(txtllk237.getText());
        linhkien.setMaSX(txtMSX_237.getText());
        linhkien.setNNH(Date.valueOf(txtngay_237.getText()));
        
        try {
            next1.updatelinhkien237(linhkien);
        } catch (SQLException ex) {
            Logger.getLogger(SuaLKPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapnhat237ActionPerformed
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat237;
    private javax.swing.JButton chon237;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbGia;
    private javax.swing.JLabel lbSdt_28;
    private javax.swing.JLabel lbTenNV_28;
    private javax.swing.JLabel lbTieude_237;
    private javax.swing.JLabel lbllk_237;
    private javax.swing.JLabel lbsoLuong_237;
    private javax.swing.JTable tableLK_237;
    private javax.swing.JTextField txtGia_237;
    private javax.swing.JTextField txtMSX_237;
    private javax.swing.JTextField txtTenLK_237;
    private javax.swing.JTextField txtllk237;
    private javax.swing.JTextField txtngay_237;
    private javax.swing.JTextField txtsoLuong_237;
    // End of variables declaration//GEN-END:variables
}
