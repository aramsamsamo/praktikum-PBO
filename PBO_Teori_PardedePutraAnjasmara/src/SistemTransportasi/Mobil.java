/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemTransportasi;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Mobil extends Kendaraan {
    // Atribut khusus milik kelas Mobil
    private int jumlahPintu;

    // Constructor
    public Mobil(String merk, int kecepatanMaksimal, int jumlahPintu) {
        // Memanggil constructor dari kelas induk (Kendaraan)
        super(merk, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
    }

    // CONTOH OVERRIDING: Menimpa metode jalankan() dari kelas Kendaraan
    @Override
    public void jalankan() {
        System.out.println("Mobil " + merk + " menginjak gas dan melaju hingga " + kecepatanMaksimal + " km/jam.");
    }

    // "TODO:" Buat metode khusus kelas Mobil yang tidak ada di kelas Kendaraan (misal: bukaBagasi())!
}
