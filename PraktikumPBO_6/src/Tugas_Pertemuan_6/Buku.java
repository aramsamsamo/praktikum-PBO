/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_6;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    } // Sebelum ada hitungDiskon

    @Override
    public double hitungDiskon() {
        return harga * 0.10; // Diskon 10%
    } // Setelah ada hitungDiskon
}
