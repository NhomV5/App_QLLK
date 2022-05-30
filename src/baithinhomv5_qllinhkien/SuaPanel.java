/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class SuaPanel extends javax.swing.JPanel {

  DefaultTableModel tableModel;
    List<NhanVien> dataList;
    int currentPos = -1;
    /**
     * Creates new form PanelSua
     */
    public SuaPanel() {
        initComponents();
        tableModel = (DefaultTableModel) tableNV_28.getModel();
        dataList = NhanVienModify.getNhanVienList(null);
        showData();
        tableNV_28.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currentPos = tableNV_28.getSelectedRow();
                txtMaNV_28.setText(dataList.get(currentPos).getMaNV());
                txtTenNV_28.setText(dataList.get(currentPos).getTenNV());
                txtSdt_28.setText(dataList.get(currentPos).getSDT());
                 txtEmail_28.setText(dataList.get(currentPos).getEmail());
                  txtLuong_28.setText(dataList.get(currentPos).getSaLaRy());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
     private void showData() {
        tableModel.setRowCount(0);
        for (NhanVien nhanvien : dataList) {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount() + 1,
                nhanvien.getMaNV(),
                nhanvien.getTenNV(),
                nhanvien.getSDT(),
                    nhanvien.getEmail(),
                nhanvien.getSaLaRy()
            });
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

        lbTieude_28 = new javax.swing.JLabel();
        txtLuong_28 = new javax.swing.JTextField();
        lbLuong_28 = new javax.swing.JLabel();
        txtSdt_28 = new javax.swing.JTextField();
        lbSdt_28 = new javax.swing.JLabel();
        txtEmail_28 = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbTenNV_28 = new javax.swing.JLabel();
        txtTenNV_28 = new javax.swing.JTextField();
        txtMaNV_28 = new javax.swing.JTextField();
        lbManhanvien_28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV_28 = new javax.swing.JTable();
        btnCapnhat28 = new javax.swing.JButton();

        lbTieude_28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTieude_28.setForeground(new java.awt.Color(255, 51, 102));
        lbTieude_28.setText("Cập Nhật Nhân Viên");

        lbLuong_28.setText("Lương:");

        lbSdt_28.setText("SĐT:");

        txtEmail_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_28ActionPerformed(evt);
            }
        });

        lbEmail.setText("Email:");

        lbTenNV_28.setText("Tên Nhân Viên:");

        lbManhanvien_28.setText("Mã Nhân Viên:");

        tableNV_28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Lương", "Email", "SĐT"
            }
        ));
        jScrollPane1.setViewportView(tableNV_28);

        btnCapnhat28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_upgrade_40px.png"))); // NOI18N
        btnCapnhat28.setText("Cập Nhật");
        btnCapnhat28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhat28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtLuong_28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbManhanvien_28)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTenNV_28)
                        .addGap(10, 10, 10)
                        .addComponent(txtTenNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(lbSdt_28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSdt_28, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(278, 278, 278)
                            .addComponent(btnCapnhat28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmail_28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLuong_28)
                            .addGap(37, 37, 37)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(lbTieude_28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbTieude_28)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbManhanvien_28)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbTenNV_28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtTenNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSdt_28)
                        .addComponent(txtSdt_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(lbLuong_28)
                    .addComponent(txtLuong_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCapnhat28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmail_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_28ActionPerformed

    private void btnCapnhat28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhat28ActionPerformed
 StringBuilder sb=new StringBuilder();
        if(txtMaNV_28.getText().equals("")){
            sb.append("Bạn chưa nhập mã nhân viên cần");
            txtMaNV_28.setBackground(Color.red);
        }else{
            txtMaNV_28.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try{
            NhanVien nv=new NhanVien();
            nv.setMaNV(txtMaNV_28.getText());
            nv.setTenNV(txtTenNV_28.getText());
            nv.setSDT(txtSdt_28.getText());
            nv.setEmail(txtEmail_28.getText());
            nv.setSaLaRy(txtLuong_28.getText());
   
            
            NhanVienModify dao=new NhanVienModify();
            dao.update(nv);
             JOptionPane.showMessageDialog(this,"Cập nhật thành công");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error: " + e.getMessage());
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapnhat28ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLuong_28;
    private javax.swing.JLabel lbManhanvien_28;
    private javax.swing.JLabel lbSdt_28;
    private javax.swing.JLabel lbTenNV_28;
    private javax.swing.JLabel lbTieude_28;
    private javax.swing.JTable tableNV_28;
    private javax.swing.JTextField txtEmail_28;
    private javax.swing.JTextField txtLuong_28;
    private javax.swing.JTextField txtMaNV_28;
    private javax.swing.JTextField txtSdt_28;
    private javax.swing.JTextField txtTenNV_28;
    // End of variables declaration//GEN-END:variables
}
