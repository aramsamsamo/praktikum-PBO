/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuan_10;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
   public static void main(String[] args) {
        Pembayaran laptop = new Elektronik();
        Pembayaran roti = new Makanan();

        double hargaLaptop = 8500000;
        double hargaRoti = 20000;

        double pajakLaptop = laptop.hitungPajak(hargaLaptop);
        double pajakRoti = roti.hitungPajak(hargaRoti);

        System.out.println("SISTEM PEMBAYARAN TOKO");
        System.out.println("Harga Laptop  : Rp " + hargaLaptop);
        System.out.println("Pajak Laptop (10%): Rp " + pajakLaptop);
        System.out.println("Total Bayar   : Rp " + (hargaLaptop + pajakLaptop));
        System.out.println("----------------------------------");
        System.out.println("Harga Roti    : Rp " + hargaRoti);
        System.out.println("Pajak Roti (5%)  : Rp " + pajakRoti);
        System.out.println("Total Bayar   : Rp " + (hargaRoti + pajakRoti));
    } 
}
