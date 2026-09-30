/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class PegawaiKontrak_NJ extends Pegawai_NJ{
    private int kontrak;
    
    public PegawaiKontrak_NJ(String namaProduk, double gaji, int kontrak) {
        super(namaProduk, gaji);
        this.kontrak = kontrak;
    }
    
    public int GetKontrak() {
        return kontrak;
    }
    
    public void setKontrak() {
        this.kontrak = kontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + kontrak + " Bulan");
    }
}
