/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemua_5_2;

/**
 *
 * @author AnjasAnjasAnjas
 */
public class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}
