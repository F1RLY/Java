package encapsulation.view;
import encapsulation.model.Mahasiswa;

public class MainEncapsulation {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Budi", 20);
        m1.tampilInfo();

        // Menggunakan setter
        m1.setUmur(21);
        m1.setNama("Andi");

        // Menggunakan getter
        System.out.println("\nSetelah diubah:");
        m1.tampilInfo();
    }
}
