package toko.oleh.oleh.FactoryPattern;

public class WadaiRangai implements Makanan { 

    private String namaMakanan = WadaiRangai.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" \t: Rasanya gurih dan manis terbuat dari kelapa dan sagu \n"); //To change body of generated methods, choose Tools | Templates.
    } 
}
  
