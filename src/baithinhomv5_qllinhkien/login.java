/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kvan2
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
         setLocationRelativeTo(null);
    }
    String URL="jdbc:jtds:sqlserver://DESKTOP-A3QJQ78:1433/DangNhap;instance=SQLEXPRESS";
    String USERNAME = "sa";
    String PASSWORD = "123456";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_243 = new javax.swing.JLabel();
        jLabel5_243 = new javax.swing.JLabel();
        jPanel2_243 = new javax.swing.JPanel();
        jLabel2_243 = new javax.swing.JLabel();
        cbbchucvu_243 = new javax.swing.JComboBox<>();
        txttaikhoan_243 = new javax.swing.JTextField();
        txtmatkhau_243 = new javax.swing.JPasswordField();
        jLabel3_243 = new javax.swing.JLabel();
        jLabel4_243 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btndangnhap_243 = new javax.swing.JButton();
        btnclear_243 = new javax.swing.JButton();
        jLabel7_243 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1_243.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1_243.setText("Hệ Thồng Quản Lý Hàng Điện Tử");

        jLabel5_243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_online_store_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_243))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5_243)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1_243)
                .addGap(30, 30, 30)
                .addComponent(jLabel5_243)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2_243.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2_243.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2_243.setText("Login");

        cbbchucvu_243.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbchucvu_243.setForeground(new java.awt.Color(255, 102, 51));
        cbbchucvu_243.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chủ", "Nhân Viên", " " }));
        cbbchucvu_243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbchucvu_243ActionPerformed(evt);
            }
        });

        txttaikhoan_243.setForeground(new java.awt.Color(255, 102, 51));

        txtmatkhau_243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatkhau_243ActionPerformed(evt);
            }
        });

        jLabel3_243.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3_243.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3_243.setText("Tài Khoản");

        jLabel4_243.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4_243.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4_243.setText("Chức Vụ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Mật Khẩu");

        btndangnhap_243.setBackground(new java.awt.Color(255, 102, 51));
        btndangnhap_243.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btndangnhap_243.setForeground(new java.awt.Color(255, 255, 255));
        btndangnhap_243.setText("Đăng Nhập");
        btndangnhap_243.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndangnhap_243MouseClicked(evt);
            }
        });
        btndangnhap_243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap_243ActionPerformed(evt);
            }
        });

        btnclear_243.setBackground(new java.awt.Color(255, 102, 51));
        btnclear_243.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnclear_243.setForeground(new java.awt.Color(255, 255, 255));
        btnclear_243.setText("Clear");
        btnclear_243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear_243ActionPerformed(evt);
            }
        });

        jLabel7_243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7_243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_workspace_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_243Layout = new javax.swing.GroupLayout(jPanel2_243);
        jPanel2_243.setLayout(jPanel2_243Layout);
        jPanel2_243Layout.setHorizontalGroup(
            jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_243Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3_243)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4_243))
                .addGap(26, 26, 26)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmatkhau_243, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttaikhoan_243, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbchucvu_243, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2_243Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2_243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7_243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel2_243Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btndangnhap_243)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclear_243, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2_243Layout.setVerticalGroup(
            jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_243Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2_243)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7_243)
                .addGap(18, 18, 18)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_243)
                    .addComponent(cbbchucvu_243, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_243)
                    .addComponent(txttaikhoan_243, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmatkhau_243, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2_243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangnhap_243)
                    .addComponent(btnclear_243))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2_243, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2_243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmatkhau_243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatkhau_243ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatkhau_243ActionPerformed

    private void cbbchucvu_243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbchucvu_243ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbchucvu_243ActionPerformed

    private void btndangnhap_243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap_243ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btndangnhap_243ActionPerformed

    private void btndangnhap_243MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndangnhap_243MouseClicked
        // TODO add your handling code here:
        if(cbbchucvu_243.getSelectedItem().toString().equals("Chủ")){
             PreparedStatement statement = null;
                try{
                    Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
                    String username=txttaikhoan_243.getText();
                    String password=txtmatkhau_243.getText();
                    Statement stm=con.createStatement();
                    String sql="select * from Chu where USERNAME='"+username+"' and PASS='"+password+"'";
                    ResultSet rs=stm.executeQuery(sql);
                    if(txttaikhoan_243.getText().equals("")|txtmatkhau_243.getText().equals("")){
                        JOptionPane.showMessageDialog(this,"Chưa nhập user và password");
                    }
                    else if(rs.next()){
                        new trangchuchinhquanly().setVisible(true);
                        this.dispose();
                        JOptionPane.showMessageDialog(this,"Đăng nhập thành công");
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Đăng nhập thất bại");
                    }
                }catch (Exception e){
                }
        }else if(cbbchucvu_243.getSelectedItem().toString().equals("Nhân Viên")){
            PreparedStatement statement = null;
                try{
                    Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
                    String username=txttaikhoan_243.getText();
                    String password=txtmatkhau_243.getText();
                    Statement stm=con.createStatement();
                    String sql="select * from NhanVien where USERNAME='"+username+"' and PASS='"+password+"'";
                    ResultSet rs=stm.executeQuery(sql);
                    if(txttaikhoan_243.getText().equals("")|txtmatkhau_243.getText().equals("")){
                        JOptionPane.showMessageDialog(this,"Chưa nhập user và password");
                    }
                    else if(rs.next()){
                        new trangchuchinhnhanvien().setVisible(true);
                        this.dispose();
                        JOptionPane.showMessageDialog(this,"Đăng nhập thành công");
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Đăng nhập thất bại");
                    }
                }catch (Exception e){
                }
        }
    }//GEN-LAST:event_btndangnhap_243MouseClicked

    private void btnclear_243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear_243ActionPerformed
        // TODO add your handling code here:
        txttaikhoan_243.setText("");
        txtmatkhau_243.setText("");
    }//GEN-LAST:event_btnclear_243ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear_243;
    private javax.swing.JButton btndangnhap_243;
    private javax.swing.JComboBox<String> cbbchucvu_243;
    private javax.swing.JLabel jLabel1_243;
    private javax.swing.JLabel jLabel2_243;
    private javax.swing.JLabel jLabel3_243;
    private javax.swing.JLabel jLabel4_243;
    private javax.swing.JLabel jLabel5_243;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7_243;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_243;
    private javax.swing.JPasswordField txtmatkhau_243;
    private javax.swing.JTextField txttaikhoan_243;
    // End of variables declaration//GEN-END:variables
}
