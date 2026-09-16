/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class MainPekerja {
    public static void main(String[] args) {
        // membuat objek dari kelas Pekerja
        // Nama, Usia, Pekerjaan, Gaji
        Pekerja pekerja = new Pekerja("Pardede Putra Anjasmara", 20, "Data Analyst", 8000000);
        
        // Tampilkan info awal menggunakan toString()
        System.out.println(pekerja.toString());

        // Ubah nama menggunakan setter
        pekerja.setNama("Budi Santoso");

        // Tampilkan ulang info
        System.out.println("\n--- Setelah Mengubah Nama ---");
        System.out.println(pekerja.toString());

        // Pengujian Akses Langsung:
        System.out.println("\n--- Pengujian Akses Langsung ---");
        
        // 1. Akses pekerjaan (public) -> BERHASIL
        System.out.println("Pekerjaan: " + pekerja.pekerjaan);

        // 2. Akses usia (protected) -> BERHASIL (karena masih dalam package yang sama)
        System.out.println("Usia: " + pekerja.usia);

        // 3. Akses nama (private) -> ERROR!
        // System.out.println(pekerja.nama); 
        
        // 4. Akses gaji (private) -> ERROR!
        // System.out.println(pekerja.gaji); 
    }
}