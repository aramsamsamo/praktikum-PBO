/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author AnjasAnjasAnjas
 */

// Kelas  Turuan SepedaMotor
public class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas induk (Kendaraan)
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
