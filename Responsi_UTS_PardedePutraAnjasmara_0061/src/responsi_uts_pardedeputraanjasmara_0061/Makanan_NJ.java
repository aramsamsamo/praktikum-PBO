/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/*
 * Subclass Makanan_NJ mewarisi atribut namaProduk dan harga dari Produk_NJ.
 */
public class Makanan_NJ extends Produk_NJ {
    // Atribut tambahan khusus untuk produk makanan
    private String tanggalBasi;
    
    // Konstruktor
    public Makanan_NJ (String namaProduk, double harga, String tanggalBasi) {
        super(namaProduk, harga); // Mengirim namaProduk & harga ke konstruktor induk
        this.tanggalBasi = tanggalBasi;
    }
    
    // Getter and Setter
    public String GetTanggalBasi() {
        return tanggalBasi;
    }
    
    public void SetTanggalBasi() {
        this.tanggalBasi = tanggalBasi;
    }
    
    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Cetak info umum produk (nama & harga)
        System.out.println("Tanggal Kadaluarsa: " + tanggalBasi);
    }
}
