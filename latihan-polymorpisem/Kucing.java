public class Kucing extends Hewan {
    public Kucing(int usia){
        super(usia);
    }
    
    @Override
    public void berkomunikasi(){
        System.out.println("Kucing berusia "+ super.usia + " tahun berkomunikasi dengan cara mengeong");
    }

}