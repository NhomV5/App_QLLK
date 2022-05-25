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
 * @author kvan2
 */
public class ThemPanel extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    List<NhanVien> dataList;
    int currentPos = -1;
    /**
     * Creates new form ThemPanel
     */
    public ThemPanel() {
        initComponents();
        tableModel = (DefaultTableModel) tableNV_28.getModel();
        dataList = NhanVienModify.getNhanVienList(null);
        showData();
    }
    private void showData() {
        tableModel.setRowCount(0);
        for (NhanVien nhanvien : dataList) {
            tableModel.addRow(new Object[]{
                tableModel.getRowCount()+1 ,
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

        lbSdt_28 = new javax.swing.JLabel();
        txtSdt_28 = new javax.swing.JTextField();
        lbLuong_28 = new javax.swing.JLabel();
        txtLuong_28 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV_28 = new javax.swing.JTable();
        lbManhanvien_28 = new javax.swing.JLabel();
        txtMaNV_28 = new javax.swing.JTextField();
        btnThem_28 = new javax.swing.JButton();
        lbTenNV_28 = new javax.swing.JLabel();
        lbThem_28 = new javax.swing.JLabel();
        txtTenNV_28 = new javax.swing.JTextField();
        txtEmail_28 = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbSdt_28.setText("SĐT:");

        lbLuong_28.setText("Lương:");

        tableNV_28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "SĐT", "Email", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tableNV_28);

        lbManhanvien_28.setText("Mã Nhân Viên:");

        btnThem_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_40px.png"))); // NOI18N
        btnThem_28.setText("Thêm ");
        btnThem_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_28ActionPerformed(evt);
            }
        });

        lbTenNV_28.setText("Tên Nhân Viên:");

        lbThem_28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThem_28.setForeground(new java.awt.Color(255, 51, 102));
        lbThem_28.setText("Thêm Nhân Viên Mới");

        lbEmail.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbManhanvien_28)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTenNV_28)
                                .addGap(10, 10, 10)
                                .addComponent(txtTenNV_28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(lbSdt_28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSdt_28, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtEmail_28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addComponent(lbLuong_28)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLuong_28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(257, 257, 257)
                                        .addComponent(btnThem_28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(lbThem_28)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbThem_28)
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmail))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLuong_28)
                        .addComponent(txtLuong_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(btnThem_28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_28ActionPerformed
        if(currentPos >=0){
            dataList.get(currentPos).setMaNV(txtMaNV_28.getText());
            dataList.get(currentPos).setTenNV(txtTenNV_28.getText());
            dataList.get(currentPos).setSDT(txtSdt_28.getText());
            dataList.get(currentPos).setEmail(txtEmail_28.getText());
            dataList.get(currentPos).setSaLaRy(txtLuong_28.getText());
            NhanVienModify.update(dataList.get(currentPos));
            currentPos = -1;
        }else{
            NhanVien nhanvien = new NhanVien(
                txtMaNV_28.getText(),
                txtTenNV_28.getText(),
                txtSdt_28.getText(),
                txtEmail_28.getText(),
                txtLuong_28.getText()
            );
            NhanVienModify.insert(nhanvien);
            dataList = NhanVienModify.getNhanVienList(null);
        }
        JOptionPane.showMessageDialog(this,"Thêm Nhán Viên thành công");
        showData();
        txtMaNV_28.setText("");
        txtTenNV_28.setText("");
        txtSdt_28.setText("");
        txtEmail_28.setText("");
        txtLuong_28.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem_28ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem_28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbLuong_28;
    private javax.swing.JLabel lbManhanvien_28;
    private javax.swing.JLabel lbSdt_28;
    private javax.swing.JLabel lbTenNV_28;
    private javax.swing.JLabel lbThem_28;
    private javax.swing.JTable tableNV_28;
    private javax.swing.JTextField txtEmail_28;
    private javax.swing.JTextField txtLuong_28;
    private javax.swing.JTextField txtMaNV_28;
    private javax.swing.JTextField txtSdt_28;
    private javax.swing.JTextField txtTenNV_28;
    // End of variables declaration//GEN-END:variables
}
