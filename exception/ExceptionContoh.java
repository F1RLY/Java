package exception;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionContoh {
    public static void main(String[] args) {
        // Contoh Unchecked Exception
        try {
            int hasil = 10 / 0; // akan error
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        // Contoh Checked Exception (membaca file)
        try {
            bacaFile("data.txt");
        } catch (IOException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }

    // throws digunakan untuk deklarasi Exception
    public static void bacaFile(String namaFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(namaFile));
        String baris;
        while ((baris = br.readLine()) != null) {
            System.out.println(baris);
        }
        br.close();
    }
}
