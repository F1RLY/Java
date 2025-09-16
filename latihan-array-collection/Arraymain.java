public class Arraymain {
    public static void main(String[] args) {
        //cara 1
        String[] nama = {"Alice", "Bob", "Charlie", "Diana"};
        System.out.println(nama[3]);  

        //cara 2
        String[] daftarNama = new String[4];
        daftarNama[0] = "Eve";
        daftarNama[1] = "Frank";
        daftarNama[2] = "Grace";
        daftarNama[3] = "Hannah";
        System.out.println(daftarNama[2]);

        double[] nilai = {78.5, 77.0, 89.3, 24.84};
        System.out.println(nilai[2]);
    }
}