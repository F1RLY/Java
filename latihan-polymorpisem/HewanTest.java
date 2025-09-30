
public class HewanTest {
    public static void main(String[] args) {
        Kucing kucingoren = new Kucing(3);
        kucingoren.berkomunikasi();

        Hewan kucinghitam = new Hewan("Kucing Hitam", 5);
        kucinghitam.berkomunikasi();

        Hewan hewan2 = new Kambing(4);
        hewan2.berkomunikasi();
    }
}
