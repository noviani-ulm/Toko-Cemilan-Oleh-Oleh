package toko.oleh.oleh.FactoryPattern;

public class IkanAsin implements Makanan { 

    private String namaMakanan = IkanAsin.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya asin terbuat dari ikan yang dikeringkan \n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
