/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemTransportasi;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Kendaraan {
    // Atribut dasar
    protected String merk;
    protected int kecepatanMaksimal;
    // Constructor
    public Kendaraan(String merk, int kecepatanMaksimal) {
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }
    // Metode umum yang nantinya akan di-override di kelas turunan
    public void jalankan() {
        System.out.println(merk + " sedang berjalan dengan kecepatan standar.");
    }
    // CONTOH OVERLOADING 1: Tanpa parameter
    public void klakson() {
        System.out.println("Klakson berbunyi: Tin tin!");
    }
    // CONTOH OVERLOADING 2: Dengan parameter (nama metode sama, isi/jumlah parameter berbeda)
    public void klakson(String suara) {
        System.out.println("Klakson berbunyi khusus: " + suara);
    }
    // "TODO:" Tambahkan 1 atribut baru (misal: warna) dan buat getter/setter-nya sendiri!
}
