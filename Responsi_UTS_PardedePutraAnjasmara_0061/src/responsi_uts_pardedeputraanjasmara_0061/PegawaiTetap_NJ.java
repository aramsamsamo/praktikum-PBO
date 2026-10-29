/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/*
 * Subclass dari Pegawai_NJ khusus untuk Pegawai Tetap.
 */
public class PegawaiTetap_NJ extends Pegawai_NJ {
    private double tunjangan; // Atribut khusus tunjangan
    
    // Konstruktor
    public PegawaiTetap_NJ(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji); // Mengirim data pegawai ke kelas induk
        this.tunjangan = tunjangan;
    }
    
    // Getter dan Setter
    public double GetTunjangan() {
        return tunjangan;
    }
    
    public void SetTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    // Overriding metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil pencetakan nama dan gaji
        System.out.println("Tunjangan: " + (long) tunjangan);
    }
}
