package toko.oleh.oleh.FactoryPattern;

public class RabukIkanHaruan implements Makanan { 

    private String namaMakanan = RabukIkanHaruan.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya asin,manis dan pedas terbuat dari ikan hauran\n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
