/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_9;

/**
 *
 * @author AnjasAnjasAnjas
 */
abstract class Hewan {
    // Metode abstrak
    abstract void suara();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah Hewan.");
    }
}

class Kucing extends Hewan {
    @Override 
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

class Anjing extends Hewan {
    @Override 
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}