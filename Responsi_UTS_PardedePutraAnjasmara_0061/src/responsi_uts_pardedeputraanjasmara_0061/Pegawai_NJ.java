/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_uts_pardedeputraanjasmara_0061;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Pegawai_NJ {
    // Enkapulasi: atribut private
    private String namaPegawai;
    private double gaji;
    
    public Pegawai_NJ(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //Getter dan Setter
    public String GetNamaPegawai() {
        return namaPegawai;
    }
    
    public void SetNamaPegawai() {
        this.namaPegawai = namaPegawai;
    }
    
    // Methode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + (long) gaji);
    }
}
