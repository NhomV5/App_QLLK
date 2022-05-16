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
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN HAI LUAN
 */
public class ViewFrame_QuanTriVien extends javax.swing.JFrame {

    private trangchuchinhquanly Trangchuchinhquanly;
    DefaultTableModel defaultTableModel;
    Linhkien lk;

    public ViewFrame_QuanTriVien() {
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
        defaultTableModel.addColumn("Mã nhà sản xuất");
        defaultTableModel.addColumn("Ngày nhập");

    }

    private void setTableData(List<Linhkien> linhkiens) {
        for (Linhkien linhkien : linhkiens) {
            defaultTableModel.addRow(new Object[]{lk.getMaLK(), lk.getTenLK(), lk.getSLG(), lk.getLoaiLK(), lk.getMaSX(), lk.getNNH()});
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        thongTin = new javax.swing.JTextField();
        SearchComboBox227 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        traCuuButton227 = new javax.swing.JButton();
        inDTButton227 = new javax.swing.JButton();
        quayLaiButton227 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        traCuuTable227 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRA CỨU LINH KIỆN ĐIỆN TỬ - QUẢN TRỊ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Thông tin");

        thongTin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        thongTin.setForeground(new java.awt.Color(255, 102, 102));

        SearchComboBox227.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchComboBox227.setForeground(new java.awt.Color(255, 102, 102));
        SearchComboBox227.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã linh kiện", "Tên linh kiện", "Số lượng tồn kho", "Loại linh kiện", "Giá", "Mã NSX", "Ngày nhập", " ", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Lọc theo");

        traCuuButton227.setBackground(new java.awt.Color(0, 153, 153));
        traCuuButton227.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        traCuuButton227.setForeground(new java.awt.Color(255, 102, 51));
        traCuuButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_icon.png"))); // NOI18N
        traCuuButton227.setText("Tra Cứu");
        traCuuButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuButton227ActionPerformed(evt);
            }
        });

        inDTButton227.setBackground(new java.awt.Color(0, 153, 153));
        inDTButton227.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inDTButton227.setForeground(new java.awt.Color(255, 102, 51));
        inDTButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_workspace_20px.png"))); // NOI18N
        inDTButton227.setText("Cập Nhật");

        quayLaiButton227.setBackground(new java.awt.Color(0, 153, 153));
        quayLaiButton227.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quayLaiButton227.setForeground(new java.awt.Color(255, 102, 51));
        quayLaiButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_back_to_20px.png"))); // NOI18N
        quayLaiButton227.setText("Quay Lại");
        quayLaiButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiButton227ActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(java.awt.Color.orange);

        traCuuTable227.setBackground(new java.awt.Color(204, 255, 204));
        traCuuTable227.setForeground(new java.awt.Color(255, 102, 51));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thongTin)
                    .addComponent(SearchComboBox227, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(traCuuButton227)
                        .addGap(18, 18, 18)
                        .addComponent(inDTButton227)
                        .addGap(18, 18, 18)
                        .addComponent(quayLaiButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchComboBox227, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quayLaiButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inDTButton227, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traCuuButton227))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traCuuButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuuButton227ActionPerformed

        Statement st = null;
        ResultSet rs = null;
        Connection connection = ConnectionJDBC.getJDBCConnection();
        try {
            // Câu lệnh xem dữ liệu
            String sql = "select * from LinhKien ";

            // Nếu tìm kiếm theo Mã linh kiện
            if (SearchComboBox227.getSelectedItem() == "Mã linh kiện") {
                sql = sql + " where MaLK like '" + thongTin.getText() + "'";
                //Còn chỗ mô nữa còn cái ngày
            }

            // Nếu tìm kiếm theo Tên linh kiện
            if (SearchComboBox227.getSelectedItem() == "Tên linh kiện") {
                sql = sql + " where TenLK like '%" + thongTin.getText() + "%'";
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

            // Nếu tìm kiếm theo Mã NSX
            if (SearchComboBox227.getSelectedItem() == "Mã NSX") {
                sql = sql + " where MASX like N'%" + thongTin.getText() + "%'";
            }

            // Nếu tìm kiếm theo Ngày Nhập hàng
            if (SearchComboBox227.getSelectedItem() == "Ngày nhập") {
                String ngayString = thongTin.getText();
                String[] ngayStrings = ngayString.split("-");
                sql = sql + " where day(NNH)= " + ngayStrings[2] + "and month(NNH)=" + ngayStrings[1] + "and year(NNH) = " + ngayStrings[0];
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
                data.add(rs.getInt("MASX"));
                data.add(rs.getString("NNH"));

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
    }//GEN-LAST:event_traCuuButton227ActionPerformed

    private void quayLaiButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiButton227ActionPerformed
        Trangchuchinhquanly = new trangchuchinhquanly();
        Trangchuchinhquanly.setVisible(true);
    }//GEN-LAST:event_quayLaiButton227ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFrame_QuanTriVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFrame_QuanTriVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFrame_QuanTriVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFrame_QuanTriVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFrame_QuanTriVien().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SearchComboBox227;
    private javax.swing.JButton inDTButton227;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quayLaiButton227;
    private javax.swing.JTextField thongTin;
    private javax.swing.JButton traCuuButton227;
    private javax.swing.JTable traCuuTable227;
    // End of variables declaration//GEN-END:variables
}
