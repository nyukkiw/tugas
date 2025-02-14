/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbolproyekuts2;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class aplikasi extends javax.swing.JFrame {

    Connection con = getConnection();

    public aplikasi() {
        initComponents();
        if (con != null) {
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(50); 
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    loading.setValue(i); 

                }

//                String user = "hr";
//                String Pass = "banyu2005";
//                String host = "localHost";
//                String port = "1521";
//                String db = "xe";
                String ket = null;

//                Connection conn = con;
//
//                try {
//                    Class.forName("oracle.jdbc.driver.OracleDriver");
//                } catch (ClassNotFoundException e) {
//                    System.out.println("Driver tidak ditemukan");
//                    System.out.println("message:" + e.getMessage());
//                }
                try {
                    //con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, user, Pass);
                    if (con != null) {
                        String count = "SELECT COUNT(*) AS row_count FROM costumer";
                        PreparedStatement countStmt = con.prepareStatement(count);
                        ResultSet countRs = countStmt.executeQuery();
                        int rowCount = 0;
                        if (countRs.next()) {
                            rowCount = countRs.getInt("row_count");
                        }
                        countRs.close();
                        countStmt.close();
                       
                        if (rowCount != 0) {
                            String query = "SELECT keterangan FROM costumer where user_id=(select count(*)from costumer)";
                            PreparedStatement stmt = con.prepareStatement(query);
                            ResultSet rs = stmt.executeQuery();

                            if (rs.next()) {
                                ket = rs.getString("keterangan");
                                
                            }

                            rs.close();
                            stmt.close();
                        } else {
                            ket = null;
                        }

                    }

                } catch (SQLException e) {
                    System.out.println("Driver tidak ditemukan");
                    System.out.println("message:" + e);
                }
                if ("Aktif".equals(ket)) {
                    halPesanKamar obj = new halPesanKamar();
                    obj.setConn(con);
                    obj.setVisible(true);
                    dispose();
                } else if ("Tidak aktif".equals(ket)) {

                    SwingUtilities.invokeLater(() -> {

                        Opening obj = new Opening();
                        obj.setCon(getConnection());
                        obj.setVisible(true);
                        dispose();

                    });

                } else {
                    Opening obj = new Opening();
                    obj.setCon(getConnection());
                    obj.setVisible(true);
                    dispose();
                }

            }).start();

        } else {
            JOptionPane.showMessageDialog(null, "Gagal terhubung:" + JOptionPane.ERROR_MESSAGE);
        }

    }

    public Connection getConnection() {
        String host = "localhost";  
        String port = "1521";
        String db = "xe";
        String user = "hr";
        String pass = "banyu2005";
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
            e.printStackTrace();  // Menampilkan detail error
        }
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, user, pass);
        } catch (SQLException e) {
            System.out.println("Gagal terhubung ke database");
            e.printStackTrace();  
        }

        return conn;
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
        loading = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        loading.setBackground(new java.awt.Color(0, 0, 0));
        loading.setForeground(new java.awt.Color(0, 0, 0));
        loading.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                loadingAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("yowweii.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadingAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_loadingAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_loadingAncestorAdded

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
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loading;
    // End of variables declaration//GEN-END:variables
}
