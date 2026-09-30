/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Makanan_NJ extends Produk_NJ {
    private String tanggalBasi;
    
    public Makanan_NJ (String namaProduk, double harga, String tanggalBasi) {
        super(namaProduk, harga);
        this.tanggalBasi = tanggalBasi;
    }
    
    public String GetTanggalBasi() {
        return tanggalBasi;
    }
    
    public void SetTanggalBasi() {
        this.tanggalBasi = tanggalBasi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalBasi);
    }
}
