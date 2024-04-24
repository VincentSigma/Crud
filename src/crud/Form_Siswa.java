package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Form_Siswa extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private ResultSet hasil;
// membuat objek baru dari class CRUD yang sudah terkoneksi dengan database
    Crud aa = new Crud();

    /**
     * Creates new form Form_Siswa
     */
    public Form_Siswa() throws SQLException {
        initComponents();
        tampil_database();
    }
    // method untuk menampilkan data ke tabel_siswa [JTable]

    public void tampil_database() {
        Object[] baris = {"ID", "Nama", "Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while (hasil.next()) {
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }
    // method untuk reset text
public void reset_text() {
txt_id.setText("");
txt_nama.setText("");
txt_alamat.setText("");
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        txt_id.setText(" ");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Siswa");

        jLabel2.setText("ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_siswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_alamat)
                        .addComponent(txt_nama)
                        .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan)
                            .addComponent(btn_reset)
                            .addComponent(btn_hapus)
                            .addComponent(btn_keluar)
                            .addComponent(btn_ubah))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        if (txt_id.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
txt_id.requestFocus();
} else if (txt_nama.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
txt_nama.requestFocus();
} else if (txt_alamat.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
txt_alamat.requestFocus();
} else {
try { aa.setID(txt_id.getText());
aa.setNama(txt_nama.getText());
aa.setAlamat(txt_alamat.getText());
aa.simpanData(aa.getID(), aa.getNama(), aa.getAlamat());
JOptionPane.showMessageDialog(null, "Data berhasil tersimpan" , "Informasi",

JOptionPane.INFORMATION_MESSAGE);

tampil_database();
reset_text();
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Data gagal tersimpan" , "Informasi",
JOptionPane.INFORMATION_MESSAGE);
}
}
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        if (txt_id.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
           txt_id.requestFocus();
       } else {
           if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini ?","Warning",2) == JOptionPane.YES_OPTION){
               String id="";
               try{aa.setID(txt_id.getText());
                    aa.hapusData(aa.getID());
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
                    tampil_database();
                    reset_text();
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Data gagal dihapus" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
               }
           }
       }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
if (txt_id.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
txt_id.requestFocus();
} else if (txt_nama.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
txt_nama.requestFocus();
} else if (txt_alamat.getText().trim().equals("")){
JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
txt_alamat.requestFocus();
} else {
try { aa.setID(txt_id.getText());
aa.setNama(txt_nama.getText());
aa.setAlamat(txt_alamat.getText());
aa.ubahData(aa.getID(), aa.getNama(), aa.getAlamat());
JOptionPane.showMessageDialog(null, "Data berhasil diubah" , "Informasi",

JOptionPane.INFORMATION_MESSAGE);

tampil_database();
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Data gagal diubah" , "Informasi",
JOptionPane.INFORMATION_MESSAGE);
}
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
try { int row = tabel_siswa.rowAtPoint(evt.getPoint());
String id = tabel_siswa.getValueAt(row, 0).toString();
String nama = tabel_siswa.getValueAt(row, 1).toString();
String alamat = tabel_siswa.getValueAt(row, 2).toString();
txt_id.setText(String.valueOf(id));
txt_nama.setText(String.valueOf(nama));
txt_alamat.setText(String.valueOf(alamat));
} catch (Exception e) {
}        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_siswaMouseClicked

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?","Warning",2)
== JOptionPane.YES_OPTION){
System.exit(0);
}        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form_Siswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form_Siswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
