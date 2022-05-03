/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

/**
 *
 * @author ADMIN
 */
public class QuanLiNV extends javax.swing.JFrame {

    private SuaPanel mSua;
    private ThemPanel mThem;
    private XoaPanel mXoa;
    /**
     * Creates new form QuanLiNV
     */
    public QuanLiNV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQuanli_28 = new javax.swing.JLabel();
        btnThem_28 = new javax.swing.JButton();
        btnSua_28 = new javax.swing.JButton();
        btnXoa_28 = new javax.swing.JButton();
        panelView_28 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbQuanli_28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbQuanli_28.setForeground(new java.awt.Color(255, 51, 102));
        lbQuanli_28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanli_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_manager_40px.png"))); // NOI18N
        lbQuanli_28.setText("Quản Lý Nhân Viên");
        getContentPane().add(lbQuanli_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 120));

        btnThem_28.setBackground(new java.awt.Color(102, 255, 255));
        btnThem_28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_50px.png"))); // NOI18N
        btnThem_28.setText("Thêm Nhân Viên");
        btnThem_28.setMaximumSize(new java.awt.Dimension(62, 23));
        btnThem_28.setMinimumSize(new java.awt.Dimension(72, 23));
        btnThem_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 100));

        btnSua_28.setBackground(new java.awt.Color(102, 255, 255));
        btnSua_28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_tire_iron_50px.png"))); // NOI18N
        btnSua_28.setText("Sửa Nhân Viên");
        btnSua_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 100));

        btnXoa_28.setBackground(new java.awt.Color(102, 255, 255));
        btnXoa_28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_50px.png"))); // NOI18N
        btnXoa_28.setText("Xoá Nhân Viên");
        btnXoa_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 100));
        getContentPane().add(panelView_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 680, 510));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_fire_exit_50px_1.png"))); // NOI18N
        jButton1.setText("Thoát");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_28ActionPerformed
        // TODO add your handling code here:
        if(mThem == null){
            mThem =new ThemPanel();
            panelView_28.addTab("Thêm Nhân Viên", mThem);
        }
        panelView_28.setSelectedComponent(mThem);
    }//GEN-LAST:event_btnThem_28ActionPerformed

    private void btnSua_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_28ActionPerformed
        // TODO add your handling code here:
        if(mSua == null){
            mSua =new SuaPanel();
            panelView_28.addTab("Sửa Nhân Viên", mSua);
        }
        panelView_28.setSelectedComponent(mSua);
       
    }//GEN-LAST:event_btnSua_28ActionPerformed

    private void btnXoa_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_28ActionPerformed
        // TODO add your handling code here:
         if(mXoa == null){
            mXoa =new XoaPanel();
            panelView_28.addTab("Xóa Nhân Viên", mXoa);
        }
        panelView_28.setSelectedComponent(mXoa);
    }//GEN-LAST:event_btnXoa_28ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua_28;
    private javax.swing.JButton btnThem_28;
    private javax.swing.JButton btnXoa_28;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbQuanli_28;
    private javax.swing.JTabbedPane panelView_28;
    // End of variables declaration//GEN-END:variables
}
