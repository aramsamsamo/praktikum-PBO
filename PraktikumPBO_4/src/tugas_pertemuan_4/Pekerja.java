/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_4;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Pekerja extends Manusia {
    private double gaji;        // Private

    // Construction
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter and Setter
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Pekerja {" +
                "Nama='" + getNama() + '\'' +
                ", Usia=" + usia +
                ", Pekerjaan='" + pekerjaan + '\'' +
                ", Gaji=" + gaji +
                '}';
    }
}