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
public class ThemLKPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThemPanel
     */
    public ThemLKPanel() {
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
        cbloailk_237 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtngay_237 = new javax.swing.JTextField();

        lbManhanvien_28.setText("Mã Linh Kiện:");

        lbTenNV_28.setText("Tên Linh kiện:");

        lbllk_237.setText("Loại linh kiện:");

        lbGia.setText("Giá:");

        lbSdt_28.setText("Mã nhà sx:");

        lbsoLuong_237.setText("Số Lương:");

        btnThem_237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_20px.png"))); // NOI18N
        btnThem_237.setText("Thêm ");

        lbThem_237.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThem_237.setForeground(new java.awt.Color(255, 51, 102));
        lbThem_237.setText("Thêm linh kiện");

        cbloailk_237.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Ngày Nhập Hàng:");

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
                                        .addComponent(cbloailk_237, 0, 105, Short.MAX_VALUE)
                                        .addComponent(txtngay_237))
                                    .addGap(65, 65, 65)
                                    .addComponent(lbGia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtGia_237, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbsoLuong_237)
                    .addComponent(lbSdt_28))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMSX_237, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtsoLuong_237))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbllk_237)
                        .addComponent(cbloailk_237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem_237;
    private javax.swing.JComboBox<String> cbloailk_237;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbGia;
    private javax.swing.JLabel lbManhanvien_28;
    private javax.swing.JLabel lbSdt_28;
    private javax.swing.JLabel lbTenNV_28;
    private javax.swing.JLabel lbThem_237;
    private javax.swing.JLabel lbllk_237;
    private javax.swing.JLabel lbsoLuong_237;
    private javax.swing.JTextField txtGia_237;
    private javax.swing.JTextField txtMSX_237;
    private javax.swing.JTextField txtMalk_237;
    private javax.swing.JTextField txtTenLK_237;
    private javax.swing.JTextField txtngay_237;
    private javax.swing.JTextField txtsoLuong_237;
    // End of variables declaration//GEN-END:variables
}
