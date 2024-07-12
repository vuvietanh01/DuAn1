
package form;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import repository.SanPham;
import service.SanPhamService;


public class FormSanPham extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    
    public FormSanPham() {
        initComponents();
        dtm = (DefaultTableModel) tbl_SP.getModel();
        loadDataToTable(); 
    }

    public void loadDataToTable() {
        SanPhamService sanPhamService = new SanPhamService();
        ArrayList<SanPham> listSanPham = sanPhamService.getToAllSanPham();

    // Xóa tất cả các dòng hiện tại
        dtm.setRowCount(0);

    // Thêm các sản phẩm vào model
    for (SanPham sp : listSanPham) {
        dtm.addRow(new Object[]{
            sp.getMaSanPham(),
            sp.getTenSanPham(),
            sp.getLoaiId(),
            sp.getNhaSanXuatId(),
            sp.getDeGiayId(),
            sp.getThuongHieuId()
        });
    }
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_keyword = new javax.swing.JTextField();
        btn_Loc = new javax.swing.JButton();
        cbx_THTK = new javax.swing.JComboBox<>();
        cbx_MauTK = new javax.swing.JComboBox<>();
        cbx_SizeKT = new javax.swing.JComboBox<>();
        cbx_CLTK = new javax.swing.JComboBox<>();
        cbx_NgTaoTK = new javax.swing.JComboBox<>();
        cbx_TrTTK = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SP = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh Sách Giày");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm Giày"));

        txt_keyword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_keywordKeyReleased(evt);
            }
        });

        btn_Loc.setText("Lọc");
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        cbx_THTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_THTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_THTKMouseClicked(evt);
            }
        });

        cbx_MauTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_MauTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_MauTKActionPerformed(evt);
            }
        });

        cbx_SizeKT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_SizeKT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_SizeKTActionPerformed(evt);
            }
        });

        cbx_CLTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_CLTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_CLTKMouseClicked(evt);
            }
        });
        cbx_CLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_CLTKActionPerformed(evt);
            }
        });

        cbx_NgTaoTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_NgTaoTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_NgTaoTKMouseClicked(evt);
            }
        });
        cbx_NgTaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_NgTaoTKActionPerformed(evt);
            }
        });

        cbx_TrTTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_TrTTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_TrTTKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_THTK, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_MauTK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_SizeKT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_CLTK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_NgTaoTK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_TrTTK, 0, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Loc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Loc)
                    .addComponent(cbx_THTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_MauTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_SizeKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_CLTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_NgTaoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_TrTTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Giày"));

        tbl_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MASP", "TenSP", "Loai", "Nhà SX", "Đế Giày", "Thương Hiệu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_keywordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_keywordKeyReleased
        
    }//GEN-LAST:event_txt_keywordKeyReleased

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        
    }//GEN-LAST:event_btn_LocActionPerformed

    private void cbx_THTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_THTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_THTKMouseClicked

    private void cbx_MauTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MauTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_MauTKActionPerformed

    private void cbx_SizeKTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_SizeKTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_SizeKTActionPerformed

    private void cbx_CLTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_CLTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_CLTKMouseClicked

    private void cbx_CLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_CLTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_CLTKActionPerformed

    private void cbx_NgTaoTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_NgTaoTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_NgTaoTKMouseClicked

    private void cbx_NgTaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_NgTaoTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_NgTaoTKActionPerformed

    private void cbx_TrTTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_TrTTKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_TrTTKMouseClicked

    private void tbl_SPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SPMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbl_SPMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Loc;
    private javax.swing.JComboBox<String> cbx_CLSPCT;
    private javax.swing.JComboBox<String> cbx_CLTK;
    private javax.swing.JComboBox<String> cbx_MauSPCT;
    private javax.swing.JComboBox<String> cbx_MauTK;
    private javax.swing.JComboBox<String> cbx_NgTaoTK;
    private javax.swing.JComboBox<String> cbx_SizeKT;
    private javax.swing.JComboBox<String> cbx_SizeSCPT;
    private javax.swing.JComboBox<String> cbx_THSPCT;
    private javax.swing.JComboBox<String> cbx_THTK;
    private javax.swing.JComboBox<String> cbx_TrTSPCT;
    private javax.swing.JComboBox<String> cbx_TrTTK;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_SP;
    private javax.swing.JTable tbl_SPCT;
    private javax.swing.JTextArea txA_MoTa;
    private javax.swing.JTextField txt_GiaBan;
    private javax.swing.JTextField txt_MaSPCT;
    private javax.swing.JTextField txt_SoLuongSPCT;
    private javax.swing.JTextField txt_TenGiaySPCT;
    private javax.swing.JTextField txt_keyword;
    // End of variables declaration//GEN-END:variables
}
