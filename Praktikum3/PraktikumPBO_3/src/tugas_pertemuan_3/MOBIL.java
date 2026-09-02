package tugas_pertemuan_3; 
        
public class MOBIL{
    // Atribut private
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public MOBIL (String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    // Method untuk mengubah warna mobil
    public void setWarna(String warnaBaru) {
        this.warna = warnaBaru;
    }

    // Method tambahan
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk + " | Model: " + model + " | Tahun: " + tahun + " | Warna: " + warna);
    }
}