/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolproyekuts2;

/**
 *
 * @author User
 */
public class Standar extends Kamar {

    public Standar(String nomorKamar, String tipeKamar, double hargaPerMalam, boolean tersedia) {
        super(nomorKamar, tipeKamar, hargaPerMalam, tersedia);
    }

    public Standar() {
    }
    
    @Override
    public String descRoom(){
        return"Standar Room:\n-Ukuran Kamar:18x22cm"
            + "\n-Tempat tidur:Queen size"+"\n-Fasilitas:AC,TV,Lemari,Meja dan kursi,Wifi"+
              "\n-Kamar Mandi:Kamar mandi dengan shower air panas dan dingin,"
            + "\nPerlengkapan mandi dasar,Handuk";
    }

}
