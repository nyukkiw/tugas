/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbolproyekuts2;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class halPesanKamar extends javax.swing.JFrame {

    private Connection conn;
    ArrayList<Kamar> kamarList = new ArrayList<>();
    String[] standar = {"001", "002", "003"};
    String[] superior = {"004", "005", "006"};
    String[] duluxe = {"007", "008", "009"};

    public halPesanKamar() {
        initComponents();
        kamarList.add(new Standar("001", "Standar Room", 250000, true));
        kamarList.add(new Standar("002", "Standar Room", 250000, true));
        kamarList.add(new Standar("003", "Standar Room", 250000, true));
        kamarList.add(new Superior("004", "Superior Room", 350000, true));
        kamarList.add(new Superior("005", "Superior Room", 350000, true));
        kamarList.add(new Superior("006", "Superior Room", 350000, true));
        kamarList.add(new Duluxe("007", "Duluxe Room", 500000, true));
        kamarList.add(new Duluxe("008", "Duluxe Room", 500000, true));
        kamarList.add(new Duluxe("009", "Duluxe Room", 500000, true));

    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pilihkamar = new javax.swing.JComboBox<>();
        lihat = new javax.swing.JButton();
        pesan = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        nokamar = new javax.swing.JComboBox<>();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesan Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        pilihkamar.setBackground(new java.awt.Color(255, 255, 255));
        pilihkamar.setForeground(new java.awt.Color(0, 0, 0));
        pilihkamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kamar", "Standar Room", "Superior Room", "Duluxe Room", " " }));
        pilihkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihkamarActionPerformed(evt);
            }
        });

        lihat.setBackground(new java.awt.Color(255, 255, 255));
        lihat.setForeground(new java.awt.Color(0, 0, 0));
        lihat.setText("Lihat Kamar");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        pesan.setBackground(new java.awt.Color(255, 255, 255));
        pesan.setForeground(new java.awt.Color(0, 0, 0));
        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setForeground(new java.awt.Color(0, 0, 0));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        nokamar.setBackground(new java.awt.Color(255, 255, 255));
        nokamar.setForeground(new java.awt.Color(0, 0, 0));
        nokamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No kamar yang tersedia" }));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setForeground(new java.awt.Color(0, 0, 0));
        logout.setText("LogOut");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lihat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nokamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pilihkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nokamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lihat)
                    .addComponent(pesan)
                    .addComponent(cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        String kamar = (String) pilihkamar.getSelectedItem();
        if (kamar.equals("Pilih kamar")) {
            JOptionPane.showMessageDialog(null, "Pilih kamar yang ingin anda lihat");
            return;
        } else {

            roomTour obj = new roomTour();
            obj.setChoosenOne(kamar);
            obj.setVisible(true);

        }


    }//GEN-LAST:event_lihatActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Anda yakin ingin cancel? ", "Exit", JOptionPane.YES_NO_OPTION);

        if (input == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_cancelActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed

        String kamar = (String) nokamar.getSelectedItem();

        for (Kamar list : kamarList) {

            if (list.getNomorKamar().equals(kamar) && list.isTersedia()) {
                list.setTersedia(false);

                JOptionPane.showMessageDialog(null, "Kamar berhasil dipesan");
                TransaksiBaru obj = new TransaksiBaru(kamar);
                obj.setVisible(true);

            } else if (list.getNomorKamar().equals(kamar) && !list.isTersedia()) {
                JOptionPane.showMessageDialog(null, "Kamar sudah tidak tersedia");
                break;
            }
        }


    }//GEN-LAST:event_pesanActionPerformed

    private void pilihkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihkamarActionPerformed
        nokamar.removeAllItems();

        if (pilihkamar.getSelectedItem().equals("Standar Room")) {
            for (String stan : standar) {
                nokamar.addItem(stan);
            }
        } else if (pilihkamar.getSelectedItem().equals("Superior Room")) {
            for (String sup : superior) {
                nokamar.addItem(sup);
            }
        } else if (pilihkamar.getSelectedItem().equals("Duluxe Room")) {
            for (String dul : duluxe) {
                nokamar.addItem(dul);
            }
        }
    }//GEN-LAST:event_pilihkamarActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Connection con = null;
        PreparedStatement ps = null;

        con = conn;

        try {
            ps = conn.prepareStatement("update costumer set keterangan = 'Tidak aktif' where user_id=(select count(*)from costumer)");
            ps.executeUpdate();
            conn.commit();
            Opening obj = new Opening();
            obj.setCon(conn);
            obj.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            System.out.println("message: " + ex.getMessage());
            System.out.println(" ");
        }


    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(halPesanKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halPesanKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halPesanKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halPesanKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new halPesanKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lihat;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> nokamar;
    private javax.swing.JButton pesan;
    private javax.swing.JComboBox<String> pilihkamar;
    // End of variables declaration//GEN-END:variables
}
