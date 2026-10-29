/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/*
 * Subclass dari Pegawai_NJ khusus untuk Pegawai Kontrak.
 */
public class PegawaiKontrak_NJ extends Pegawai_NJ{
    private int kontrak; // Atribut khusus lama kontrak (dalam bulan)
    
    // Konstruktor
    public PegawaiKontrak_NJ(String namaProduk, double gaji, int kontrak) {
        super(namaProduk, gaji); // Mengirim data pegawai ke kelas induk
        this.kontrak = kontrak;
    }
    
    // Getter dan Setter
    public int GetKontrak() {
        return kontrak;
    }
    
    public void setKontrak() {
        this.kontrak = kontrak;
    }
    
    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil pencetakan nama dan gaji
        System.out.println("Lama Kontrak: " + kontrak + " Bulan");
    }
}
