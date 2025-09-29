import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        
        ArrayList <String> daftarNama= new ArrayList<String>();
        daftarNama.add("Zahran");
        daftarNama.add("Budi");
        daftarNama.add("Caca");
        daftarNama.add("Dina");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
