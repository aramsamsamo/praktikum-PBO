package tugas_pertemuan_3;

public class MainMOBIL {
    public static void main(String[] args) {
        // Instansiasi dua objek Mobil
        MOBIL mobil1 = new MOBIL("Toyota", "GR Yaris", 2023, "Merah");
        MOBIL mobil2 = new MOBIL("Honda", "Civic Type R", 2022, "Hitam");

        // Menyalakan mesin dan menampilkan info awal
        mobil1.startEngine();
        mobil1.displayInfo();

        System.out.println();

        mobil2.startEngine();
        mobil2.displayInfo();

        System.out.println("\n--- Perubahan Warna Mobil ---");
        // Mengubah warna mobil1
        mobil1.setWarna("Putih");
        System.out.print("Setelah warna diubah -> ");
        mobil1.displayInfo();
    }
}