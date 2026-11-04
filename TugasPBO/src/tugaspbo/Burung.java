/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Burung extends Hewan implements Berjalan, Terbang {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Cicit/Cuit!");
    }

    @Override
    public void berjalan() {
        System.out.println(getNama() + " berjalan dengan dua kaki di tanah.");
    }

    @Override
    public void terbang() {
        System.out.println(getNama() + " terbang membentangkan sayap di udara.");
    }
}
