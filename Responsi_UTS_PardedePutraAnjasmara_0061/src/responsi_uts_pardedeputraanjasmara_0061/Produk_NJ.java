/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/*
 * KONSEP ENKAPSULASI:
 * Kelas Produk_NJ bertindak sebagai Superclass (Kelas Induk).
 * Semua atribut diatur menjadi 'private' agar data dilindungi dari akses langsung dari luar kelas.
 */
public class Produk_NJ {
    // Atribut privat (Enkapulasi)
    private String namaProduk;
    private double harga;
    
    // Konstruktor: Digunakan untuk menginisialisasi nilai awal objek saat dibuat
    public Produk_NJ(String namaProduk, double harga) {
        this.namaProduk = namaProduk; // 'this' merujuk pada atribut milik kelas ini
        this.harga = harga;
    }
    
    // --- METODE GETTER DAN SETTER (Akses Data Terenkapsulasi) ---
    
    // Getter: Mengembalikan nilai dari atribut privat namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }
    
    // Setter: Mengubah/mengisi nilai dari atribut privat namaProduk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    // Getter untuk harga
    public double getHarga() {
        return harga;
    }
    
    // Setter untuk harga
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Metode untuk menampilkan informasi dasar produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        // (long) digunakan untuk type casting agar angka desimal (.0) dibuang saat dicetak
        System.out.println("Harga: " + (long) harga);
    }
}
