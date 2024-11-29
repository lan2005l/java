package hellojava;

import hellojava.HomeJava;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public class NguoiHienMau extends javax.swing.JFrame {
    private Connection conn;
    
    public NguoiHienMau() {
        initComponents();
        connectDatabase();  // Kết nối CSDL
        loadDataToTable(); 
    }
    private void connectDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/Bank";
            String username = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể kết nối đến CSDL!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tblHienThi.getModel();
        model.setRowCount(0);

        try {
            String query = "SELECT * FROM NguoiHienMau";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String maNguoi = rs.getString("MaNguoiHien");
                String hoTen = rs.getString("HoTen");
                int tuoi = rs.getInt("Tuoi");
                String nhomMau = rs.getString("NhomMau");
                Date ngayHienGanNhat = rs.getDate("NgayHienGanNhat");

                model.addRow(new Object[]{maNguoi, hoTen, tuoi, nhomMau, ngayHienGanNhat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể tải dữ liệu từ CSDL!", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
        jMaNguoi = new javax.swing.JTextField();
        JHoTen = new javax.swing.JTextField();
        jNgayHien = new javax.swing.JTextField();
        jspTuoi = new javax.swing.JSpinner();
        cbNhomMau = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("HoTen");

        jLabel3.setText("Tuổi");

        jLabel4.setText("NhomMau");

        jLabel5.setText("NgayHienGanNhat");

        jLabel6.setText("MaNguoiHien");

        jMaNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaNguoiActionPerformed(evt);
            }
        });

        cbNhomMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaNguoiHien", "HoTen", "Tuoi", "NhomMau", "NgayHienGanNhat"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(34, 34, 34))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(76, 76, 76)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMaNguoi)
                            .addComponent(JHoTen)
                            .addComponent(jspTuoi)
                            .addComponent(cbNhomMau, 0, 198, Short.MAX_VALUE)
                            .addComponent(jNgayHien))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnThem)
                .addGap(40, 40, 40)
                .addComponent(btnSua)
                .addGap(42, 42, 42)
                .addComponent(btnXoa)
                .addGap(59, 59, 59)
                .addComponent(btnExit)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jMaNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jspTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbNhomMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jNgayHien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnExit))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMaNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaNguoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaNguoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
          String maNguoi = jMaNguoi.getText().trim();
    String hoTen = JHoTen.getText().trim();
    int tuoi = (int) jspTuoi.getValue();
    String nhomMau = cbNhomMau.getSelectedItem().toString();
    String ngayHienGanNhat = jNgayHien.getText().trim();

    // Kiểm tra các trường dữ liệu có được điền đầy đủ hay không
    if (maNguoi.isEmpty() || hoTen.isEmpty() || ngayHienGanNhat.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Chuẩn bị câu lệnh SQL để thêm dữ liệu
        String query = "INSERT INTO NguoiHienMau (MaNguoiHien, HoTen, Tuoi, NhomMau, NgayHienGanNhat) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, maNguoi);
        pstmt.setString(2, hoTen);
        pstmt.setInt(3, tuoi);
        pstmt.setString(4, nhomMau);
        pstmt.setString(5, ngayHienGanNhat);

        // Thực thi câu lệnh
       int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Thêm người hiến máu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            // Cập nhật lại bảng dữ liệu
            loadDataToTable();

            // Xóa dữ liệu trên form nhập liệu sau khi thêm thành công
            jMaNguoi.setText("");
            JHoTen.setText("");
            jspTuoi.setValue(18); // Giá trị mặc định
            cbNhomMau.setSelectedIndex(0); // Chọn nhóm máu đầu tiên (A)
            jNgayHien.setText("");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Không thể thêm người hiến máu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    

        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String hoTen = JHoTen.getText().trim();
        int tuoi = (int) jspTuoi.getValue();
        String nhomMau = cbNhomMau.getSelectedItem().toString();
        String ngayHienGanNhat = jNgayHien.getText().trim();  // Định dạng ngày: yyyy-mm-dd

        // Kiểm tra xem các trường thông tin đã đầy đủ chưa
        if (hoTen.isEmpty() || ngayHienGanNhat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Cập nhật thông tin người hiến trong cơ sở dữ liệu
            String updateQuery = "UPDATE NguoiHienMau SET HoTen = ?, Tuoi = ?, NhomMau = ?, NgayHienGanNhat = ? WHERE MaNguoiHien = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, hoTen);
            updateStmt.setInt(2, tuoi);
            updateStmt.setString(3, nhomMau);
            updateStmt.setString(4, ngayHienGanNhat);
            String maNguoiHien = null;
            updateStmt.setString(5, maNguoiHien);

            int rowsUpdated = updateStmt.executeUpdate();
            if (rowsUpdated > 0) {
                // Cập nhật thành công, làm mới bảng hiển thị
                loadDataToTable();
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin người hiến thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy người hiến với mã này!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblHienThi.getSelectedRow();

    if (selectedRow != -1) { // Kiểm tra xem có hàng nào được chọn không
        // Lấy dữ liệu từ từng cột của hàng được chọn
        String maNguoi = tblHienThi.getValueAt(selectedRow, 0).toString();
        String hoTen = tblHienThi.getValueAt(selectedRow, 1).toString();
        int tuoi = Integer.parseInt(tblHienThi.getValueAt(selectedRow, 2).toString());
        String nhomMau = tblHienThi.getValueAt(selectedRow, 3).toString();
        String ngayHienGanNhat = tblHienThi.getValueAt(selectedRow, 4).toString();

        // Hiển thị dữ liệu lên các trường nhập liệu
        jMaNguoi.setText(maNguoi);
        JHoTen.setText(hoTen);
        jspTuoi.setValue(tuoi);
        cbNhomMau.setSelectedItem(nhomMau);
        jNgayHien.setText(ngayHienGanNhat);
    }
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Đóng form hiện tại

        // Tạo và hiển thị lại form trang chủ
        HomeJava home = new HomeJava();
        home.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(NguoiHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiHienMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguoiHienMau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JHoTen;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbNhomMau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jMaNguoi;
    private javax.swing.JTextField jNgayHien;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jspTuoi;
    private javax.swing.JTable tblHienThi;
    // End of variables declaration//GEN-END:variables
