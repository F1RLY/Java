package inheritance;

// Single Inheritance
public class Kendaraan {
    String merk;
    void info() {
        System.out.println("Ini adalah kendaraan merk " + merk);
    }
}

class Mobil extends Kendaraan {  // Inherits from Kendaraan
    int jumlahPintu;
    void tampilMobil() {
        System.out.println("Mobil " + merk + " dengan pintu: " + jumlahPintu);
    }
}

// Multilevel Inheritance
 class Sedan extends Mobil {
    String tipe;
    void tampilSedan() {
        System.out.println("Sedan " + merk + ", tipe: " + tipe);
    }
}

// Hierarchical Inheritance
 class Motor extends Kendaraan {
    int cc;
    void tampilMotor() {
        System.out.println("Motor " + merk + " dengan CC: " + cc);
    }
}

// Multiple Inheritance (via interface)
interface Electric {
    void charge();
}

class MobilListrik extends Mobil implements Electric {
    public void charge() {
        System.out.println("Mobil listrik sedang di-charge...");
    }
}
