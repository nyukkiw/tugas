/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbolproyekuts2;

/**
 *
 * @author User
 */
public class Costumer {

    private String nik;
    private String nama;
    private String tglLahir;
    private String jenisKel;
    private String NoHP;
    private String username;
    private String password;

    public Costumer(String nik, String nama, String tglLahir, String jenisKel, String NoHP, String username, String password) {
        this.nik = nik;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.jenisKel = jenisKel;
        this.NoHP = NoHP;
        this.username = username;
        this.password = password;
    }

    public Costumer() {

    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJenisKel() {
        return jenisKel;
    }

    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel;
    }

    public String getNoHP() {
        return NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
