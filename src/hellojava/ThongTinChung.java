
package hellojava;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class ThongTinChung extends javax.swing.JFrame {

    public ThongTinChung() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jThoatExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRead = new javax.swing.JButton();
        jMahien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jThongTin = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("xem thong tin");

        jThoatExit.setText("Exit");
        jThoatExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jThoatExitActionPerformed(evt);
            }
        });

        jLabel1.setText("MaHienMau");

        jRead.setText("read");
        jRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReadActionPerformed(evt);
            }
        });

        jThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaHienMau", "MaNguoiHien", "MaMau", "MaBenhvien", "NgayHien"
            }
        ));
        jScrollPane1.setViewportView(jThongTin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jThoatExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jMahien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jRead)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jMahien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jThoatExit)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jThoatExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jThoatExitActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Đóng form hiện tại

        // Tạo và hiển thị lại form trang chủ
        HomeJava home = new HomeJava();
        home.setVisible(true);
    }//GEN-LAST:event_jThoatExitActionPerformed

    private void jReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReadActionPerformed
        // TODO add your handling code here:
        String maHienMau = jMahien.getText().trim();

    // Kiểm tra nếu trường nhập trống
    if (maHienMau.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hiến máu!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Kết nối đến cơ sở dữ liệu và truy vấn
    try {
        // Tạo kết nối đến cơ sở dữ liệu
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "123456");
        
        // Câu lệnh SQL truy vấn dữ liệu dựa trên mã hiến máu
        String query = "SELECT * FROM HienMau WHERE MaHienMau = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, maHienMau);

        // Thực thi câu lệnh SQL và lấy kết quả
        ResultSet rs = stmt.executeQuery();

        // Xóa dữ liệu cũ trên bảng trước khi hiển thị kết quả mới
        DefaultTableModel model = (DefaultTableModel) jThongTin.getModel();
        model.setRowCount(0);

        // Đọc dữ liệu từ ResultSet và đưa vào bảng
        while (rs.next()) {
            String maHien = rs.getString("MaHienMau");
            String maNguoiHien = rs.getString("MaNguoiHien");
            String maMau = rs.getString("MaMau");
            String maBenhVien = rs.getString("MaBenhVien");
            String ngayHien = rs.getString("NgayHien");

            model.addRow(new Object[]{maHien, maNguoiHien, maMau, maBenhVien, ngayHien});
        }

        // Kiểm tra nếu không có kết quả
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu với mã hiến máu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

        // Đóng kết nối
        rs.close();
        stmt.close();
        conn.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi truy vấn cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jReadActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinChung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jMahien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRead;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jThoatExit;
    private javax.swing.JTable jThongTin;
    // End of variables declaration//GEN-END:variables
}
