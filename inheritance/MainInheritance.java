
package inheritance;
import inheritance.*; // Import semua kelas dalam package inheritance

public class MainInheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Mobil m = new Mobil();
        m.merk = "Toyota";
        m.jumlahPintu = 4;
        m.tampilMobil();
        
        // Multilevel
        Sedan s = new Sedan();
        s.merk = "Honda";
        s.jumlahPintu = 4;
        s.tipe = "Civic";
        s.tampilSedan();
        
        // Hierarchical
        Motor mo = new Motor();
        mo.merk = "Yamaha";
        mo.cc = 150;
        mo.tampilMotor();

        // Multiple Inheritance (Interface)
        MobilListrik ml = new MobilListrik();
        ml.merk = "Tesla";
        ml.jumlahPintu = 4;
        ml.tampilMobil();
        ml.charge();
    }
}
