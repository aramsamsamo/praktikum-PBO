/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class Reptil extends Hewan implements Berjalan {

    public Reptil(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " bersuara: Sssttt/Mendesis!");
    }

    @Override
    public void berjalan() {
        System.out.println(getNama() + " berjalan/merayap dekat dengan permukaan tanah.");
    }
}
