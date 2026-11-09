/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHidung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5)); // Output= 15
        
        // Objek Pengurangan
        OperasiHidung pengurangan = new Pengurangan();
        System.out.println("Penguranga: " + pengurangan.hitung(10, 5)); // Output= 5
    }
}
