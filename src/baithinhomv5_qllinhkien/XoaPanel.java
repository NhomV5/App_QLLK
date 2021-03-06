/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class XoaPanel extends javax.swing.JPanel {

  DefaultTableModel tableModel;
    List<NhanVien> dataList;
    int currentPos = -1;
    /**
     * Creates new form PanelXoaLinhKien
     */
    public XoaPanel() {
        initComponents();
        tableModel = (DefaultTableModel) tableNV_28.getModel();
        dataList = NhanVienModify.getNhanVienList(null);
        showData();
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

        lbXoa_28 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        btnXoa_28 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV_28 = new javax.swing.JTable();

        lbXoa_28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbXoa_28.setForeground(new java.awt.Color(51, 51, 255));
        lbXoa_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXoa_28.setText("X??a Nh??n Vi??n");

        jLabel3.setText("M?? Nh??n Vi??n:");

        btnXoa_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_40px.png"))); // NOI18N
        btnXoa_28.setText("X??a");
        btnXoa_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_28ActionPerformed(evt);
            }
        });

        tableNV_28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? Nh??n Vi??n", "T??n Nh??n Vi??n", "S??T", "Email", "L????ng"
            }
        ));
        jScrollPane1.setViewportView(tableNV_28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnXoa_28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lbXoa_28)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbXoa_28)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa_28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoa_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_28ActionPerformed
        // TODO add your handling code here:
        if(txtMaNV.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "B???n Ch??a Nh???p M?? Nh??n Vi??n");
            return;
        }
        int ret = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c ch???n mu???n x??a?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(ret != -1) {
            NhanVienModify.delete(txtMaNV.getText());
            JOptionPane.showMessageDialog(this, "X??a nh??n vi??n th??nh c??ng");
        }
        showData();
        txtMaNV.setText("");
    }//GEN-LAST:event_btnXoa_28ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXoa_28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbXoa_28;
    private javax.swing.JTable tableNV_28;
    private javax.swing.JTextField txtMaNV;
    // End of variables declaration//GEN-END:variables
}
