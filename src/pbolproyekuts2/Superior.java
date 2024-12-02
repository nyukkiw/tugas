/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolproyekuts2;

/**
 *
 * @author User
 */
public class Superior extends Kamar {

    public Superior(String nomorKamar, String tipeKamar, double hargaPerMalam, boolean tersedia) {
        super(nomorKamar, tipeKamar, hargaPerMalam, tersedia);
    }

    public Superior() {
    }

    @Override
    public String descRoom() {
        return "Superior Room:\n-Ukuran Kamar:22x28cm"
                + "\nTempat tidur:Queen size\nFasilitas:AC,TV,Lemari,Meja dan Kursi,\n2 single seater sofa,"
                + "Wifi yang lebih lancar\n-Kamar mandi:Shower"
                + "Air panas dan dingin,\nPerlengkapan mandi dasar,Handuk";
    }
}
