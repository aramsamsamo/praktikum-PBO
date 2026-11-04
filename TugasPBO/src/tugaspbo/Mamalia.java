/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Mamalia extends Hewan implements Berjalan {

    public Mamalia(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Guk/Meow/Moo!");
    }

    @Override
    public void berjalan() {
        System.out.println(getNama() + " berjalan menggunakan empat/dua kaki.");
    }
}
