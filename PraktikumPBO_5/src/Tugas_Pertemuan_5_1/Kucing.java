/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_5_1;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Kucing extends Hewan {
    
    @Override 
    public void suara(){
        System.out.println("Suara   : Meow Meow!");
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        suara(); // Memanggil metode suara khas kucing
    }
}
