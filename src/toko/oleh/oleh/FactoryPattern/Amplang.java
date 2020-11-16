package toko.oleh.oleh.FactoryPattern;

public class Amplang implements Makanan{ 

    private String namaMakanan = Amplang.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya renyah dan gurih, terbuat dari bahan utama ikan dan tepung\n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  