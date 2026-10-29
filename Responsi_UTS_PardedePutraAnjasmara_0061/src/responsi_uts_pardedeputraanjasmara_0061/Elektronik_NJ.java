/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/*
 * KONSEP PEWARISAN (INHERITANCE):
 * 'extends Produk_NJ' menunjukkan bahwa Elektronik_NJ adalah Subclass (Kelas Turunan)
 * yang mewarisi atribut dan metode dari kelas induk Produk_NJ.
 */
public class Elektronik_NJ extends Produk_NJ {
    // Atribut tambahan khusus untuk produk elektronik
    private int garansi; // Atribut garansi dalam tahun
    
    // Konstruktor Subclass
    public Elektronik_NJ(String namaProduk, double harga, int garansi){
        // super(...) memanggil konstruktor milik kelas induk (Produk_NJ)
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Getter dan Setter khusus untuk atribut garansi
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    /*
     * KONSEP METHOD OVERRIDING:
     * Menulis ulang metode tampilkanInfo() milik kelas induk
     * untuk menambahkan pencetakan data garansi khusus elektronik.
     */
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil keluaran namaProduk dan harga dari kelas induk
        System.out.println("Garansi: " + garansi + " Tahun");
    }
}
