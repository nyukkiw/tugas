/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbolproyekuts2;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class roomTour extends javax.swing.JFrame {

    private String choosenOne = "Standar Room";
    private ArrayList<String> jenisKamar = new ArrayList<>() {
        {
            add("Standar Room");
            add("Duluxe Room");
            add("Superior Room");

        }
    };

    private ArrayList<ImageIcon> image = new ArrayList<>() {
        {
            add(new ImageIcon("src/standarRoom.jpg"));
            add(new ImageIcon("src/duluxeRoom.jpg"));
            add(new ImageIcon("src/superiorRoom.jpg"));
        }
    };

    public String getChoosenOne() {
        return choosenOne;
    }

    public void setChoosenOne(String choosenOne) {
        this.choosenOne = choosenOne;
        showRoomImage();
        showDesc();
    }

    public roomTour() {
        initComponents();

    }

    private void showRoomImage() {
        // Bersihkan panel sebelum menambahkan gambar baru
        viewRoom.removeAll();

        // Cari index berdasarkan choosenOne
        int index = jenisKamar.indexOf(choosenOne);
        if (index != -1) {
            // Ambil gambar dari array list berdasarkan index
            JLabel picture = new JLabel(image.get(index));

            // Tambahkan gambar ke panel viewRoom
            viewRoom.add(picture);

            // Atur ukuran dan posisi gambar agar sesuai panel
            picture.setBounds(0, 0, viewRoom.getWidth(), viewRoom.getHeight());

        } else {
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan Kamar");

        }

        // Refresh tampilan panel
        viewRoom.revalidate();
        viewRoom.repaint();
    }

    private void showDesc() {
        String ket = null;
        switch (choosenOne) {
            case "Standar Room":
                Standar stan = new Standar();

                ket = stan.descRoom();
                break;
            case "Duluxe Room":
                Duluxe dul = new Duluxe();
                ket = dul.descRoom();
                break;
            case "Superior Room":
                Superior sup = new Superior();
                ket = sup.descRoom();
                break;

        }
        descRoom.setEditable(false);
        descRoom.setText(ket);

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
        viewRoom = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descRoom = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Tour\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        viewRoom.setBackground(new java.awt.Color(255, 255, 255));
        viewRoom.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout viewRoomLayout = new javax.swing.GroupLayout(viewRoom);
        viewRoom.setLayout(viewRoomLayout);
        viewRoomLayout.setHorizontalGroup(
            viewRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewRoomLayout.setVerticalGroup(
            viewRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        kembali.setBackground(new java.awt.Color(255, 255, 255));
        kembali.setForeground(new java.awt.Color(0, 0, 0));
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        descRoom.setBackground(new java.awt.Color(255, 255, 255));
        descRoom.setColumns(20);
        descRoom.setForeground(new java.awt.Color(0, 0, 0));
        descRoom.setRows(5);
        jScrollPane1.setViewportView(descRoom);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(kembali)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kembali))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        dispose();


    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(roomTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomTour().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descRoom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JPanel viewRoom;
    // End of variables declaration//GEN-END:variables
}
