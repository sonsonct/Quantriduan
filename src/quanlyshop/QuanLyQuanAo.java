/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlyshop;

import DAO.quanaoDAO;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.QuanAo;

/**
 *
 * @author ADMIN
 */
public class QuanLyQuanAo extends javax.swing.JFrame {
    private final DefaultTableModel tbModelquanao = new DefaultTableModel();
    /**
     * Creates new form QuanLyQuanAo
     */
    public QuanLyQuanAo() {
        initComponents();
        Showdata();
        btnThucHien.setEnabled(false);
        btntk1.setEnabled(false);
    }
    public void cleardata()
    {
        while (tbModelquanao.getRowCount()>0) {
            tbModelquanao.removeRow(0);
            
        }
    }
    private void Showdata()
    {
        String[] tencot = {"Mã Quần Áo", "Tên Quần Áo", "Hãng", "Giá", "Số Lượng"};
        tbModelquanao.setColumnIdentifiers(tencot);
        tbquanao.setModel(tbModelquanao);
        cleardata();
        quanaoDAO nv = new quanaoDAO();
        List<QuanAo> data = nv.getQuanAo();
        for (int i = 0; i < data.size(); i++) {
            String[] row = {
                String.valueOf(data.get(i).getMaqa()),
                data.get(i).getTenqa(),
                data.get(i).getHang(),
                String.valueOf(data.get(i).getGia()),
                String.valueOf(data.get(i).getSoluong()),
            };
            tbModelquanao.addRow(row);
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

        jLabel8 = new javax.swing.JLabel();
        btnThucHien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbquanao = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btntk1 = new javax.swing.JComboBox<>();
        btntk = new javax.swing.JButton();
        txthang = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        btnlammoi = new javax.swing.JButton();
        txtsoluong = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThucHien.setText("Thực Hiện");
        btnThucHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThucHienActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Quần Áo");

        jLabel3.setText("Mã Quần Áo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setText("Tên ");

        tbquanao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbquanao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbquanaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbquanao);

        jLabel5.setText("Hãng");

        jLabel6.setText("Số Lượng");

        jLabel7.setText("Giá");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btntk1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Mã", "Theo Hãng", "Theo Tên" }));
        btntk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntk1ActionPerformed(evt);
            }
        });

        btntk.setText("Tìm Kiếm");
        btntk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntk)
                .addGap(26, 26, 26)
                .addComponent(btntk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntk)
                    .addComponent(btntk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnlammoi.setText("Làm Mới");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giá Từ Cao Xuống Thấp", "Giá Từ Thấp Dến Cao", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txthang, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThucHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThucHienActionPerformed
        // TODO add your handling code here:
        if(btnThem.isEnabled())
        {
            try {
               
                if(txtten.getText().equals("") || txthang.getText().equals("") || txtgia.getText().equals("") || txtsoluong.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "xin hãy nhập đủ thuông tin");
                    return;
                }
                try {
                    float n = Float.parseFloat(txtgia.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "xin hãy nhập lai gia VD:123000!");
                    return;
                }

                QuanAo qa = new QuanAo();
                qa.setTenqa(txtten.getText());
                qa.setHang(txthang.getText());
                qa.setSoluong(Integer.valueOf(txtsoluong.getText()));
                qa.setGia(Float.valueOf(txtgia.getText()));
                
                quanaoDAO ins = new quanaoDAO();
                ins.insert(qa);
                JOptionPane.showMessageDialog(this, "Them moi thanh cong");
                Showdata();

            } catch (Exception e) {
                //                if(e.getMessage().equals("Duplicate entry '"+txtMaNV.getText()+"' for key 'PRIMARY'")){
                    //                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại vui lòng nhập lại");
                    //                }
                System.err.println("Loi:" + e.getMessage());
            }
        }else if(btnsua.isEnabled()){

            try {
                if(txtten.getText().equals("") || txthang.getText().equals("") || txtgia.getText().equals("") || txtsoluong.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "xin hãy nhập đủ thuông tin");
                    return;
                }
                try {
                    float n = Float.parseFloat(txtgia.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "xin hãy nhập lai gia VD:123000!");
                    return;
                }

                QuanAo qa = new QuanAo();
                qa.setMaqa(Integer.valueOf(txtma.getText()));
                qa.setTenqa(txtten.getText());
                qa.setHang(txthang.getText());
                qa.setSoluong(Integer.valueOf(txtsoluong.getText()));
                qa.setGia(Float.valueOf(txtgia.getText()));
                
                quanaoDAO ins = new quanaoDAO();
                ins.update(qa);

                JOptionPane.showMessageDialog(this, "Sua thanh cong");
                Showdata();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else if(btnxoa.isEnabled()){
            String ml = String.valueOf(txtma.getText());
            StringBuilder sb = new StringBuilder();
            if(ml.equals("")){
                JOptionPane.showMessageDialog(this, "Mã quần áo không được trống");
                return;
            }
            else{
                quanaoDAO ins = new quanaoDAO();

                boolean kt = ins.delete(Integer.valueOf(ml));
                if(kt==true)
                {
                    JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                }else{
                    JOptionPane.showMessageDialog(this, "Xoa that bai");
                }
                Showdata();
            }
        }else if(btntk.isEnabled()){
            
            if(btntk1.getSelectedItem()=="Theo Mã"){
                if(txtma.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Mã quần áo không được trống");
                    return;
                }else{
                    try {
                    cleardata();
                    quanaoDAO ins = new quanaoDAO();
                    List<QuanAo> data = ins.SearchByMa(Integer.valueOf(txtma.getText()));
                    for (int i = 0; i < data.size(); i++) {
                        String[] row = {
                            String.valueOf(data.get(i).getMaqa()),
                            data.get(i).getTenqa(),

                            data.get(i).getHang(),
                            String.valueOf(data.get(i).getGia()),
                            String.valueOf(data.get(i).getSoluong()),
                            
                        };
                        tbModelquanao.addRow(row);

                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "Mã quần áo không tồn tại Khong Ton Tai");

                    }
                }
                
                
            }else if(btntk1.getSelectedItem()=="Theo Tên"){
                if(txtten.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Tên quần áo không được trống");
                    return;
                }else{
                    try {
                    cleardata();
                    quanaoDAO ins = new quanaoDAO();
                    List<QuanAo> data = ins.SearchByTen(txtten.getText());
                    for (int i = 0; i < data.size(); i++) {
                        String[] row = {
                            String.valueOf(data.get(i).getMaqa()),
                            data.get(i).getTenqa(),

                            data.get(i).getHang(),
                            String.valueOf(data.get(i).getGia()),
                            String.valueOf(data.get(i).getSoluong()),
                            
                        };
                        tbModelquanao.addRow(row);

                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "Tên quần áo không tồn tại Khong Ton Tai");

                    }
                }
            }else if(btntk1.getSelectedItem()=="Theo Hãng"){
                if(txthang.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Hãng quần áo không được trống");
                    return;
                }else{
                    try {
                    cleardata();
                    quanaoDAO ins = new quanaoDAO();
                    List<QuanAo> data = ins.SearchByHang(txthang.getText());
                    for (int i = 0; i < data.size(); i++) {
                        String[] row = {
                            String.valueOf(data.get(i).getMaqa()),
                            data.get(i).getTenqa(),

                            data.get(i).getHang(),
                            String.valueOf(data.get(i).getGia()),
                            String.valueOf(data.get(i).getSoluong()),
                            
                        };
                        tbModelquanao.addRow(row);

                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "Hãng quần áo không tồn tại Khong Ton Tai");

                    }
                }
            }
            
        }
    }//GEN-LAST:event_btnThucHienActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        HeThong ht = new HeThong();
        ht.setLocationRelativeTo(null);
        ht.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tbquanaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbquanaoMouseClicked
        // TODO add your handling code here:
        int row = tbquanao.getSelectedRow();
        if(row >= 0)
        {
            txtma.setText(tbquanao.getValueAt(row, 0).toString());
            txtten.setText(tbquanao.getValueAt(row, 1).toString());
            txthang.setText(tbquanao.getValueAt(row, 2).toString());
            txtsoluong.setText(tbquanao.getValueAt(row, 4).toString());
            txtgia.setText(tbquanao.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_tbquanaoMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        txtma.setEditable(false);
        btnThucHien.setEnabled(true);
        btnsua.setEnabled(false);
        btnxoa.setEnabled(false);
        btntk1.setEnabled(false);
        btntk.setEnabled(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        btnThucHien.setEnabled(true);
        btnThem.setEnabled(false);
        btnxoa.setEnabled(false);
        btntk1.setEnabled(false);
        btntk.setEnabled(false);
        txtma.setEditable(false);
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        btnThucHien.setEnabled(true);
        btnsua.setEnabled(false);
        btnThem.setEnabled(false);
        btntk1.setEnabled(false);
        btntk.setEnabled(false);
        txtten.setEditable(false);
        txtsoluong.setEditable(false);
        txtgia.setEditable(false);
        txthang.setEditable(false);
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here:
        btnThucHien.setEnabled(false);
        btnThem.setEnabled(true);
        btnsua.setEnabled(true);
        btntk1.setEnabled(false);
        btntk.setEnabled(true);
        btnxoa.setEnabled(true);
        txtma.setText("");
        txtten.setText("");
        txtsoluong.setText("");
        txthang.setText("");
        txtgia.setText("");
        txtma.setEditable(true);
        txtten.setEditable(true);
        txtsoluong.setEditable(true);
        txtgia.setEditable(true);
        txthang.setEditable(true);
        btntk1.setSelectedItem("Theo Mã");
        Showdata();
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void btntk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntk1ActionPerformed
        // TODO add your handling code here:
        if(btntk1.getSelectedItem()=="Theo Mã"){
//            txtten.setEditable(false);
//            txtma.setEditable(true);
//            txtsoluong.setEditable(false);
//            txtgia.setEditable(false);
//            txthang.setEditable(false);
            txtma.setText("");
            txtten.setText("");
            txtsoluong.setText("");
            txthang.setText("");
            txtgia.setText("");
        }else if(btntk1.getSelectedItem()=="Theo Tên"){
            txtten.setEditable(true);
            txtma.setEditable(false);
            txtsoluong.setEditable(false);
            txtgia.setEditable(false);
            txthang.setEditable(false);
            txtma.setText("");
            txtten.setText("");
            txtsoluong.setText("");
            txthang.setText("");
            txtgia.setText("");
        }else if(btntk1.getSelectedItem()=="Theo Hãng"){
            txtten.setEditable(false);
            txtma.setEditable(false);
            txtsoluong.setEditable(false);
            txtgia.setEditable(false);
            txthang.setEditable(true);
            txtma.setText("");
            txtten.setText("");
            txtsoluong.setText("");
            txthang.setText("");
            txtgia.setText("");
        }
       
    }//GEN-LAST:event_btntk1ActionPerformed

    private void btntkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntkActionPerformed
        // TODO add your handling code here:
            txtten.setEditable(false);
            txtma.setEditable(true);
            txtsoluong.setEditable(false);
            txtgia.setEditable(false);
            txthang.setEditable(false);
        btnThucHien.setEnabled(true);
        btnsua.setEnabled(false);
        btnThem.setEnabled(false);
        btntk1.setEnabled(true);
        btnxoa.setEnabled(false);
    }//GEN-LAST:event_btntkActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem()=="Giá Từ Thấp Dến Cao"){
            try {
                    cleardata();
                    quanaoDAO ins = new quanaoDAO();
                    List<QuanAo> data = ins.getQuanAoByeGiaThap();
                    for (int i = 0; i < data.size(); i++) {
                        String[] row = {
                            String.valueOf(data.get(i).getMaqa()),
                            data.get(i).getTenqa(),

                            data.get(i).getHang(),
                            String.valueOf(data.get(i).getGia()),
                            String.valueOf(data.get(i).getSoluong()),
                            
                        };
                        tbModelquanao.addRow(row);

                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "Hãng quần áo không tồn tại Khong Ton Tai");

                    }
        }else if(jComboBox1.getSelectedItem()=="Giá Từ Cao Xuống Thấp"){
            
            try {
                    cleardata();
                    quanaoDAO ins = new quanaoDAO();
                    List<QuanAo> data = ins.getQuanAoByeGiaCao();
                    for (int i = 0; i < data.size(); i++) {
                        String[] row = {
                            String.valueOf(data.get(i).getMaqa()),
                            data.get(i).getTenqa(),

                            data.get(i).getHang(),
                            String.valueOf(data.get(i).getGia()),
                            String.valueOf(data.get(i).getSoluong()),
                            
                        };
                        tbModelquanao.addRow(row);

                    }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(this, "Hãng quần áo không tồn tại Khong Ton Tai");

                    }

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyQuanAo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuanAo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuanAo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuanAo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyQuanAo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThucHien;
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btntk;
    private javax.swing.JComboBox<String> btntk1;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbquanao;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txthang;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
