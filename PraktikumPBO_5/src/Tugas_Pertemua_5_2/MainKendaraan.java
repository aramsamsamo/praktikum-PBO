/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemua_5_2;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class MainKendaraan {
    public static void main(String[] args) {
        System.out.println("\n==========================================");
        System.out.println("UJI COBA HIERARKI 3 LEVEL KENDARAAN");
        System.out.println("==========================================");
        
        Mobil mobil = new Mobil();
        mobil.nama = "Avanza";
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        System.out.println("[ Data Mobil ]");
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Vario";
        motor.jumlahRoda = 2;
        motor.jenisMesin = "Matic 4-tak";
        System.out.println("[ Data Sepeda Motor ]");
        motor.tampilkanInfo();
    }
}
