package encapsulation.model;

public class Mahasiswa {
    // Access Modifier
    private String nama;
    private int umur;
    
    // Non-Access Modifier (final: tidak bisa diubah, static: milik class)
    public static final String UNIVERSITAS = "Universitas Indonesia";
    
    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter (mengambil nilai)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Setter (mengubah nilai)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Universitas: " + UNIVERSITAS);
    }
}
