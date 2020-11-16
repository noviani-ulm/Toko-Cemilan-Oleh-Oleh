package toko.oleh.oleh.FactoryPattern;

public class Rimpi implements Makanan { 

    private String namaMakanan = Rimpi.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya manis,bahan utaman yaitu pisang \n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
