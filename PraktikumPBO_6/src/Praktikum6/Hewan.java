/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
   
    // Metode makan() pertama: 1 parameter
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    
    // Metode makan() kedua: 2 parameter (Overloaded)
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}


