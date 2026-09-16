/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class MainKendaraan {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        // (Nama, Kecepatan Maksimum, Jenis Mesin, Jumlah Pintu)
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, "Turbo", 5);

        System.out.println("=== Informasi Kendaraan (Metode Kelas Induk) ===");
        // Memanggil method public dari kelas Kendaraan
        mobil1.tampilkanInfoKendaraan();

        System.out.println("\n=== Informasi Mobil (Metode Subclass) ===");
        // Memanggil method public dari kelas Mobil yang mengakses variabel protected
        mobil1.tampilkanInfoMobil();

        System.out.println("\n=== Pengujian Akses Modifier Langsung ===");
        // 1. Mengakses variabel public (jenisMesin) -> BISA
        System.out.println("Jenis Mesin (Public): " + mobil1.jenisMesin);

        // 2. Mengakses variabel protected (kecepatanMaks) -> BISA 
        // (karena kelas Main berada dalam package yang sama: praktikum4)
        System.out.println("Kecepatan Maksimum (Protected): " + mobil1.kecepatanMaks + " km/h");

        // 3. Mengakses variabel private (nama) -> ERROR jika diakses langsung!
        // System.out.println(mobil1.nama); // Un-comment ini akan menyebabkan Compile Error

        // Untuk mengakses variabel private, harus menggunakan Getter
        System.out.println("Nama Kendaraan (Private via Getter): " + mobil1.getNama());
    }
}
