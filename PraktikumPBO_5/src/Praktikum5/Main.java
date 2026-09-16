/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        System.out.println("--- Informasi My Mobil Gueh ---");
        mobil.tampilkanInfo();

        System.out.println(); // Baris baru

        // Membuat objek SepedaMotor
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        System.out.println("--- Informasi My Sepeda Motor Gueh ---");
        motor.tampilkanInfo();
    }
}


