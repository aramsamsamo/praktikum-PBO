/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Main {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia("Kucing");
        Burung elang = new Burung("Elang");
        Reptil komodo = new Reptil("Komodo");

        System.out.println("=== MAMALIA ===");
        kucing.suara();
        kucing.berjalan();

        System.out.println("\n=== BURUNG ===");
        elang.suara();
        elang.berjalan();
        elang.terbang();

        System.out.println("\n=== REPTIL ===");
        komodo.suara();
        komodo.berjalan();
    }
}