package Tugas_pbo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class info extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn =koneksi.koneksiData.openKoneksi();
    
    public info() {
        initComponents();
        readData();
    }

    private void clear(){
    txtTanggal.setText("");
    txtDeskripsi.setText("");
    }
    
    private void readData(){
        try {
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM tb_info");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("TANGGAL");
            model.addColumn("DESKRIPSI");
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while (rs.next()){
                Object[] data = {
                    rs.getString("tanggal"),
                    rs.getString("deskripsi"),
                };
                model.addRow(data);
                tbInfo.setModel(model);
            }
  
        }catch (Exception e){
            
        }
    }
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        txtDeskripsi = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Tanggal");

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "TANGGAL", "DESKRIPSI"
            }
        ));
        tbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbInfo);

        btnSimpan.setText("Upload");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtDeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeskripsiActionPerformed(evt);
            }
        });

        jLabel2.setText("Deskripsi");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnExit.setText("back");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnSimpan)
                        .addGap(62, 62, 62)
                        .addComponent(btnHapus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtTanggal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeskripsiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        try {
            st=cn.createStatement();
                String cek = "SELECT * FROM tb_info WHERE tanggal='" + txtTanggal.getText() + "'";
                rs = st.executeQuery(cek);
                if (rs.next()){
                    JOptionPane.showMessageDialog(null, "TANGGAL SUDAH ADA");
                }else{
                    String sql ="INSERT INTO tb_info VALUES ('" + txtTanggal.getText() +
                            "','" + txtDeskripsi.getText() +  "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"DATA BERHASIL DIKIRIM PADA SISWA");
                    clear();
                    readData();
        }
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtTanggal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "silahkan pilih data");
        }else{
                try{
                    st = cn.createStatement();
                    String sql = "DELETE FROM tb_info WHERE tanggal = '" + txtTanggal.getText() + "'";
                    st.execute(sql);
                    
                    JOptionPane.showMessageDialog(null,"DATA BERHASIL DI HAPUS");
                    readData();
                    clear();
                }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);

            } 
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfoMouseClicked
        txtTanggal.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(), 0).toString());
        txtDeskripsi.setText(tbInfo.getValueAt(tbInfo.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tbInfoMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
            MenuUtama halamanUtama = new MenuUtama();
            halamanUtama.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbInfo;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
