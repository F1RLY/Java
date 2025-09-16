package view;

import model.Mahasiswa;

public class MahasiswaView{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.ipk = 3.75; 
        System.out.println("IPK Mahasiswa: " + mhs.ipk);
    }
}