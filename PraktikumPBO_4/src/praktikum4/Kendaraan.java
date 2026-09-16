/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;            // Private: hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;    // Protected: bisa diakses package yang sama & subclass
    public String jenisMesin;       // Public: bisa diakses dari mana saja
    
    // Constuction
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    // Getter dan Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Method public untuk menampilan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}