/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolproyekuts2;

/**
 *
 * @author User
 */
public class Duluxe extends Kamar {

    public Duluxe(String nomorKamar, String tipeKamar, double hargaPerMalam, boolean tersedia) {
        super(nomorKamar, tipeKamar, hargaPerMalam, tersedia);
    }

    public Duluxe() {
    }

    @Override
    public String descRoom() {
        return "Duluxe Room:\n-Ukuran Kamar:25x30cm"
                + "\nTempat tidur:King size\nFasilitas:AC,TV,Lemari,Meja dan Kursi ergonomis"
                + ",Wifi yang lebih lancar,\nMinibar\n-Kamar mandi:Bathtub,Shower"
                + "Air panas dan dingin,\nPerlengkapan mandi premium,Handuk dengan bahan lembut";
    }
}
