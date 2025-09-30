public class Kambing extends Hewan {
    public Kambing(int usia){
        super(usia);
    }
    
    @Override
    public void berkomunikasi(){
        System.out.println("Kambing berusia "+ super.usia + " tahun berkomunikasi dengan mengeeembee");
    }
}
