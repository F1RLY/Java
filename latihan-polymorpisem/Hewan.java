
public class Hewan {
    public int usia;
    private String nama;

    public Hewan(){

    }
    public Hewan(int usia, String nama){
        this.usia = usia;
        this.nama = nama;
    }

    public Hewan(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public Hewan(String nama){
        this.nama = nama;
    }

    public Hewan(int usia){
        this.usia = usia;
    }

    public void berkomunikasi(){
        System.out.println("Hewan dengan nama " + this.nama + " dan usia " + this.usia + " berkomunikasi");
    }
}
