/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_6;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class MainTugas {
    public static void main(String[] args) {
        // Keranjang belanja dengan kapasitas maksimal 5 produk
        KeranjangBelanja keranjang = new KeranjangBelanja(5);

        // Penerapan Polimorfisme: Objek turunan disimpan dalam variabel tipe Produk
        Produk buku1 = new Buku("Pemrograman Java PBO", 100000);
        Produk laptop = new Elektronik("Laptop ASUS", 12000000);
        Produk kaos = new Pakaian("Kaos Polos", 150000);

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        keranjang.tampilkanRincianBelanja();
    }
}
 