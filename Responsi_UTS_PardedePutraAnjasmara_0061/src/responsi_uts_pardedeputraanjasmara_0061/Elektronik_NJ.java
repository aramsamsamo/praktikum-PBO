/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Elektronik_NJ extends Produk_NJ {
    private int garansi; // Atribut garansi dalam tahun
    
    public Elektronik_NJ(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " Tahun");
    }
}
