/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_6;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class KeranjangBelanja {
    private Produk[] daftarProduk;
    private int jumlahProduk;

    // Konstruktor dengan kapasitas maksimum keranjang
    public KeranjangBelanja(int kapasitas) {
        daftarProduk = new Produk[kapasitas];
        jumlahProduk = 0;
    }

    // Metode untuk menambahkan produk ke dalam array
    public void tambahProduk(Produk produk) {
        if (jumlahProduk < daftarProduk.length) {
            daftarProduk[jumlahProduk] = produk;
            jumlahProduk++;
        } else {
            System.out.println("Keranjang belanja sudah penuh!");
        }
    }

    // Metode menghitung total harga setelah diskon (Penerapan Polimorfisme)
    public void tampilkanRincianBelanja() {
        System.out.println("====== RINCIAN KERANJANG BELANJA ======");
        double totalAwal = 0;
        double totalDiskon = 0;

        for (int i = 0; i < jumlahProduk; i++) {
            Produk p = daftarProduk[i];
            double diskon = p.hitungDiskon(); // Memanggil metode overriding secara polimorfis
            double hargaAkhir = p.getHargaSetelahDiskon();

            totalAwal += p.getHarga();
            totalDiskon += diskon;

            System.out.println("- " + p.getNama() + " | Harga: Rp" + p.getHarga() + 
                               " | Diskon: Rp" + diskon + " | Harga Akhir: Rp" + hargaAkhir);
        }

        double totalBayar = totalAwal - totalDiskon;
        System.out.println("----------------------------------------");
        System.out.println("Total Harga Awal : Rp" + totalAwal);
        System.out.println("Total Diskon     : Rp" + totalDiskon);
        System.out.println("Total Bayar      : Rp" + totalBayar);
        System.out.println("========================================");
    }
}
