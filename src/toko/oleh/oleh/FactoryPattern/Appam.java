package toko.oleh.oleh.FactoryPattern;

public class Appam implements Makanan { 

    private String namaMakanan = Appam.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya manis, terbuat dari gula merah \n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
