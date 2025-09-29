package belajar;
public class Contoh {
        public static void main(String[] args) {
        double nilai = 76.99;
        System.out.println("Nilai: " + nilai); // 76.99
        int nilaiakhir = (int) nilai; // casting double ke int
        System.out.println("Nilai akhir: " + nilaiakhir); // 76
        double nilai2 = (double) nilaiakhir; // otomatis casting int ke double
        System.out.println("Nilai 2: " + nilai2); // 76.0

    }
}