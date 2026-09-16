/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_5_1;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class MainHewan {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UJI COBA PEWARISAN HEWAN & OVERRIDING");
        System.out.println("==========================================");
        
        Kucing kucing = new Kucing();
        kucing.nama = "Mimi";
        kucing.jenis = "Mamalia (Kucing Anggora)";
        System.out.println("[ Data Kucing ]");
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Bolt";
        anjing.jenis = "Mamalia (Anjing Husky)";
        System.out.println("[ Data Anjing ]");
        anjing.tampilkanInfo();
    }
}
