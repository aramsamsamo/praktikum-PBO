/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan untuk mobil

    // Construction
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks langsung karena bertipe protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
