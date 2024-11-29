
package hellojava; 

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class QuảnLiMau extends javax.swing.JFrame {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    
    public QuảnLiMau() {
        initComponents();
        connectToDatabase();
        loadDataToTable();    
    }
    
    private void connectToDatabase() {
        try {
            // Thay đổi thông tin kết nối phù hợp với cấu hình của bạn
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "123456");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Đổ dữ liệu vào bảng JTable
    private void loadDataToTable() {
        try {
            String sql = "SELECT * FROM Mau"; // Thay 'blood_table' bằng tên bảng thực tế của bạn
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            // Cài đặt mô hình bảng cho JTable
            DefaultTableModel model = (DefaultTableModel) jHienThi.getModel();
            model.setRowCount(0); // Xóa dữ liệu cũ nếu có

            // Duyệt qua kết quả và thêm vào JTable
            while (rs.next()) {
                String maMau = rs.getString("MaMau"); // Thay "MaMau" bằng tên cột thực tế của bạn
                String nhomMau = rs.getString("NhomMau");
                String theTich = rs.getString("TheTich");
                String ngayHetHan = rs.getString("NgayHetHan");

                // Thêm dòng mới vào bảng
                model.addRow(new Object[]{maMau, nhomMau, theTich, ngayHetHan});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jAdd = new javax.swing.JButton();
        jMaMau = new javax.swing.JTextField();
        cbNhom = new javax.swing.JComboBox<>();
        jTheTich = new javax.swing.JTextField();
        JNgayHetHan = new javax.swing.JTextField();
        jEdit = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jHienThi = new javax.swing.JTable();
        jThoat = new javax.swing.JButton();
        JTong = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JSoLuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("quan ly mau");

        jLabel1.setText("MaMau");

        jLabel3.setText("NhomMau");

        jLabel5.setText("TheTich");

        jLabel6.setText("NgayHetHan");

        jAdd.setText("Thêm");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        cbNhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        cbNhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomActionPerformed(evt);
            }
        });

        jEdit.setText("Sửa");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });

        jDelete.setText("Xóa");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaMau", "NhomMau", "TheTich", "NgayHetHan"
            }
        ));
        jHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jHienThi);

        jThoat.setText("Exit");
        jThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jThoatActionPerformed(evt);
            }
        });

        JTong.setText("Tổng");
        JTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTongActionPerformed(evt);
            }
        });

        jLabel8.setText("So Luong");

        JSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSoLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAdd)
                        .addGap(53, 53, 53)
                        .addComponent(jEdit)
                        .addGap(71, 71, 71)
                        .addComponent(jDelete)
                        .addGap(61, 61, 61)
                        .addComponent(jThoat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(309, 309, 309))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jMaMau, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbNhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(JTong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JNgayHetHan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                                .addComponent(jTheTich, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jMaMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbNhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTheTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdd)
                    .addComponent(jEdit)
                    .addComponent(jDelete)
                    .addComponent(jThoat))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JSoLuongActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // TODO add your handling code here:
        String maMau = jMaMau.getText();
    String nhomMau = cbNhom.getSelectedItem().toString();
    String theTich = jTheTich.getText();
    String ngayHetHan = JNgayHetHan.getText();

    try {
        String sql = "INSERT INTO Mau (MaMau, NhomMau, TheTich, NgayHetHan) VALUES (?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, maMau);
        pst.setString(2, nhomMau);
        pst.setFloat(3, Float.parseFloat(theTich));
        pst.setDate(4, Date.valueOf(ngayHetHan));

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loadDataToTable(); // Tải lại dữ liệu
        }
    } catch (SQLException | NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi khi thêm: " + ex.getMessage());
    }
    }//GEN-LAST:event_jAddActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
        // TODO add your handling code here:
        String maMau = jMaMau.getText().trim();
    String nhomMau = cbNhom.getSelectedItem().toString();
    String theTich = jTheTich.getText().trim();
    String ngayHetHan = JNgayHetHan.getText().trim();

    // Kiểm tra tính hợp lệ của dữ liệu
    if (maMau.isEmpty() || theTich.isEmpty() || ngayHetHan.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        return;
    }

    try {
        // Câu lệnh SQL để cập nhật dữ liệu
        String sql = "UPDATE Mau SET NhomMau = ?, TheTich = ?, NgayHetHan = ? WHERE MaMau = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, nhomMau);
        pst.setFloat(2, Float.parseFloat(theTich)); // Chuyển TheTich sang dạng số thực
        pst.setDate(3, Date.valueOf(ngayHetHan)); // Chuyển NgayHetHan sang kiểu ngày
        pst.setString(4, maMau);

        // Thực hiện cập nhật
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            loadDataToTable(); // Tải lại dữ liệu vào bảng
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã máu để cập nhật!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu: " + ex.getMessage());
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Ngày hết hạn không đúng định dạng! Định dạng yêu cầu: yyyy-MM-dd");
    }
    }//GEN-LAST:event_jEditActionPerformed

    private void jHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHienThiMouseClicked
        // TODO add your handling code here:
        int selectedRow = jHienThi.getSelectedRow();
    if (selectedRow >= 0) {
        // Lấy mô hình của bảng
        DefaultTableModel model = (DefaultTableModel) jHienThi.getModel();

        // Lấy dữ liệu từ các cột của hàng đã chọn
        String maMau = model.getValueAt(selectedRow, 0).toString(); // Lấy giá trị từ cột "MaMau"
        String nhomMau = model.getValueAt(selectedRow, 1).toString(); // Lấy giá trị từ cột "NhomMau"
        String theTich = model.getValueAt(selectedRow, 2).toString(); // Lấy giá trị từ cột "TheTich"
        String ngayHetHan = model.getValueAt(selectedRow, 3).toString(); // Lấy giá trị từ cột "NgayHetHan"

        // Cập nhật các trường JTextField và JComboBox dựa trên dữ liệu từ bảng
        jMaMau.setText(maMau);
        cbNhom.setSelectedItem(nhomMau);
        jTheTich.setText(theTich);
        JNgayHetHan.setText(ngayHetHan);
    }
    }//GEN-LAST:event_jHienThiMouseClicked

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String maMau = jMaMau.getText().trim();

    // Kiểm tra xem MaMau có được nhập không
    if (maMau.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn hoặc nhập mã máu để xóa!");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa mã máu này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return; // Nếu người dùng chọn "No", dừng thực hiện
    }

    try {
        // Câu lệnh SQL để xóa dữ liệu
        String sql = "DELETE FROM Mau WHERE MaMau = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, maMau);

        // Thực hiện xóa
        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            loadDataToTable(); // Tải lại dữ liệu vào bảng sau khi xóa
            clearInputFields(); // Xóa nội dung các trường nhập liệu
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã máu để xóa!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi khi xóa dữ liệu: " + ex.getMessage());
    }
    }                                      
    
    private void clearInputFields() {
    jMaMau.setText("");
    cbNhom.setSelectedIndex(0);
    jTheTich.setText("");
    JNgayHetHan.setText("");
    }                                       

    private void jThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jThoatActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Đóng form hiện tại

        // Tạo và hiển thị lại form trang chủ
        HomeJava home = new HomeJava();
        home.setVisible(true);
    }//GEN-LAST:event_jThoatActionPerformed

    private void JTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTongActionPerformed
        // TODO add your handling code here:
        String selectedGroup = (String) cbNhom.getSelectedItem();
    
    // Kết nối tới cơ sở dữ liệu (cập nhật URL, username và password cho đúng)
    String url = "jdbc:mysql://localhost:3306/Bank";
    String user = "root";
    String password = "123456";
    
    // Chuỗi SQL để đếm tổng số túi máu theo nhóm máu được chọn
    String sql = "SELECT COUNT(*) FROM Mau WHERE NhomMau = ?";
    
    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        // Thiết lập giá trị của nhóm máu trong câu truy vấn
        stmt.setString(1, selectedGroup);
        
        // Thực hiện truy vấn
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            // Lấy kết quả đếm
            int totalBags = rs.getInt(1);
            
            // Hiển thị kết quả trong txtTotal (JTextField)
            JSoLuong.setText(String.valueOf(totalBags));
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_JTongActionPerformed

    private void cbNhomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNhomActionPerformed

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
            java.util.logging.Logger.getLogger(QuảnLiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuảnLiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuảnLiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuảnLiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuảnLiMau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JNgayHetHan;
    private javax.swing.JTextField JSoLuong;
    private javax.swing.JButton JTong;
    private javax.swing.JComboBox<String> cbNhom;
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jEdit;
    private javax.swing.JTable jHienThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jMaMau;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTheTich;
    private javax.swing.JButton jThoat;
    // End of variables declaration//GEN-END:variables
}
