package toko.oleh.oleh.FactoryPattern;

public class Wajik implements Makanan { 

    private String namaMakanan = Wajik.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya manis, terbuat dari beras ketan \n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
