/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    // Constuction
    public Manusia(String nama, int manusia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    // Getter dan Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama =  nama;
    }
    // Method public untuk menampilan informasi Pekerja
    public void tampilkaninfoPekerja() {
        System.out.println("Namanya adalah: " + nama);
        System.out.println("Dia berusia: " + usia + "tahun");
        System.out.println("Dia bekerja sebagai: " + pekerjaan);
    }
}
