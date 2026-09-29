/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        // Pengujian Polimorfisme & Overriding
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow (Runtime Polymorphism)

        Kucing kucing = new Kucing();
        kucing.makan("ikan");       // Memanggil makan(String)
        kucing.makan("ikan", 2);    // Memanggil makan(String, int)

        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3);  // Memanggil makan(String, int) dari superclass
    }
}
