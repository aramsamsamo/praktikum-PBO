/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        // 1. Output Produk
        Elektronik_NJ produk1 = new Elektronik_NJ("TV Pintar", 15000000, 2);
        System.out.println("1. Output Produk");
        produk1.tampilkanInfo();

        System.out.println(); // Baris baru pembatas
        
        // 2. Output Pegawai
        PegawaiTetap_NJ pegawai1 = new PegawaiTetap_NJ("Anjas", 7000000, 2000000);
        System.out.println("2. Output Pegawai");
        pegawai1.tampilkanInfo();

        System.out.println(); // Baris baru pembatas

        // 3. Output Polimorfisme
        // Referensi kelas induk (Produk) memegang objek dari kelas turunan (Makanan)
        Produk_NJ produkPolimorfisme = new Makanan_NJ("Nugget Kanzler", 60000, "30-09-2026");
        System.out.println("3. Output Poliomorfisme");
        produkPolimorfisme.tampilkanInfo();

        System.out.println(); // Baris baru pembatas
        
        // Referensi kelas induk (Pegawai) memegang objek dari kelas turunan (PegawaiKontrak)
        Pegawai_NJ pegawaiPolimorfisme = new PegawaiKontrak_NJ ("Mara", 3000000, 6);
        pegawaiPolimorfisme.tampilkanInfo();
    }
}
