/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithinhomv5_qllinhkien;

import Connection.ConnectionJDBC;
import User.Linhkien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN HAI LUAN
 */
public class Search_NhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ViewFrame_NhanVien
     */
    private trangchuchinhnhanvien Trangchuchinhnhanvien;
    DefaultTableModel defaultTableModel;
    Linhkien lk;
    
    public Search_NhanVien() {
        initComponents();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        traCuuTable227.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã linh kiện");
        defaultTableModel.addColumn("Tên linh kiện");
        defaultTableModel.addColumn("Số lượng tồn kho");
        defaultTableModel.addColumn("Loại linh kiện");
        defaultTableModel.addColumn("Giá");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thongTin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        traCuuButton228 = new javax.swing.JButton();
        quayLaiButton228 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        traCuuTable227 = new javax.swing.JTable();
        SearchComboBox227 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        thongTin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thongTin.setForeground(new java.awt.Color(255, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Thông tin");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TRA CỨU LINH KIỆN ĐIỆN TỬ - NHÂN VIÊN");

        jPanel4.setForeground(new java.awt.Color(240, 240, 240));
        jPanel4.setToolTipText("");

        traCuuButton228.setBackground(new java.awt.Color(0, 153, 153));
        traCuuButton228.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        traCuuButton228.setForeground(new java.awt.Color(255, 102, 102));
        traCuuButton228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        traCuuButton228.setText("Tra Cứu");
        traCuuButton228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuButton228ActionPerformed(evt);
            }
        });

        quayLaiButton228.setBackground(new java.awt.Color(0, 153, 153));
        quayLaiButton228.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quayLaiButton228.setForeground(new java.awt.Color(255, 102, 102));
        quayLaiButton228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        quayLaiButton228.setText("Quay Lại");
        quayLaiButton228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiButton228ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(traCuuButton228, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quayLaiButton228, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(traCuuButton228)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(quayLaiButton228)
                .addGap(65, 65, 65))
        );

        traCuuTable227.setBackground(new java.awt.Color(204, 255, 204));
        traCuuTable227.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(traCuuTable227);

        SearchComboBox227.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchComboBox227.setForeground(new java.awt.Color(255, 102, 102));
        SearchComboBox227.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã linh kiện", "Tên linh kiện", "Số lượng tồn kho", "Loại linh kiện", "Giá", " ", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Lọc theo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchComboBox227, 0, 398, Short.MAX_VALUE)
                    .addComponent(thongTin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchComboBox227, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traCuuButton228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuuButton228ActionPerformed
       Statement st = null;
        ResultSet rs = null;
        Connection connection = ConnectionJDBC.getJDBCConnection();
        try {
            // Câu lệnh xem dữ liệu
            String sql = "select * from LinhKien ";

            // Nếu tìm kiếm theo Mã linh kiện
            if (SearchComboBox227.getSelectedItem() == "Mã linh kiện") {
                sql = sql + " where MaLK like '" + thongTin.getText() + "'";
            }

            // Nếu tìm kiếm theo Tên linh kiện
            if (SearchComboBox227.getSelectedItem() == "Tên linh kiện") {
                sql = sql + " where TenLK like '" + thongTin.getText() + "'";
            }

            // Nếu tìm kiếm theo Số lượng
            if (SearchComboBox227.getSelectedItem() == "Số lượng tồn kho") {
                sql = sql + " where SLG =" + thongTin.getText();
            }

            // Nếu tìm kiếm theo Loại linh kiện
            if (SearchComboBox227.getSelectedItem() == "Loại linh kiện") {
                sql = sql + " where LLK like N'%" + thongTin.getText() + "%'";
            }

            // Nếu tìm kiếm theo Giá
            if (SearchComboBox227.getSelectedItem() == "Giá") {
                sql = sql + " where Gia like N'%" + thongTin.getText() + "%'";
            }

            
    
            // Tạo đối tượng thực thi câu lệnh Select
            st = connection.createStatement();

            // Thực thi 
            rs = st.executeQuery(sql);
            Vector data = null;

            defaultTableModel.setRowCount(0);

            // Nếu dữ liệu không tồn tại
            if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "Số liệu không có!");
                return;
            }

            // Trong khi chưa hết dữ liệu
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getString("MaLK"));
                data.add(rs.getString("TenLK"));
                data.add(rs.getInt("SLG"));
                data.add(rs.getString("LLK"));
                data.add(rs.getInt("Gia"));

                // Thêm một dòng vào table model
                defaultTableModel.addRow(data);
            }

            traCuuTable227.setModel(defaultTableModel); // Thêm dữ liệu vào table
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_traCuuButton228ActionPerformed

    private void quayLaiButton228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiButton228ActionPerformed
       Trangchuchinhnhanvien = new trangchuchinhnhanvien();
       Trangchuchinhnhanvien.setVisible(true);
    }//GEN-LAST:event_quayLaiButton228ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SearchComboBox227;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quayLaiButton228;
    private javax.swing.JTextField thongTin;
    private javax.swing.JButton traCuuButton228;
    private javax.swing.JTable traCuuTable227;
    // End of variables declaration//GEN-END:variables
}
