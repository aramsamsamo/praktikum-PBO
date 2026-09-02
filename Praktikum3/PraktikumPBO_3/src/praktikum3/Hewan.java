package praktikum3;

public class Hewan {
    // Atribut dengan modifier private (Encapsulation)
    private String nama;
    private int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method
    void suara() {
        System.out.println("Hewan bersuara");
    }

    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }

    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}
