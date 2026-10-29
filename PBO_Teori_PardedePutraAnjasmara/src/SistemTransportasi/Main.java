/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemTransportasi;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        // Objek dari Kelas Induk
        Kendaraan kendaraanUmum = new Kendaraan("Umum", 60);
        kendaraanUmum.jalankan();
        
        System.out.println("----------------------------");

        // Objek dari Kelas Turunan
        Mobil mobilSaya = new Mobil("Toyota", 180, 4);
        
        // Memanggil metode hasil Overriding
        mobilSaya.jalankan();

        // Memanggil metode hasil Overloading
        mobilSaya.klakson();              // Versi tanpa parameter
        mobilSaya.klakson("Bip Bip!");    // Versi dengan parameter

        // TODO: Buat objek dari kelas turunan kedua (misal: Motor) dan panggil metode-metodenya!
    }
}