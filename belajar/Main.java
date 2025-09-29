package belajar;
interface Operasi {
    int hitung(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression
        Operasi tambah = (a, b) -> a + b;
        Operasi kali = (a, b) -> a * b;

        System.out.println("Tambah: " + tambah.hitung(5, 3)); // 8
        System.out.println("Kali: " + kali.hitung(5, 3));     // 15
    }
}
