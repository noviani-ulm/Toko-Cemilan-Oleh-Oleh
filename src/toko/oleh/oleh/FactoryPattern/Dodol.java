package toko.oleh.oleh.FactoryPattern;

public class Dodol implements Makanan { 

    private String namaMakanan = Dodol.class.getSimpleName();

    @Override
    public void rasa() {
        System.out.print(namaMakanan+" : Rasanya manis terbuat dari santan kelapa,tepung ketan,gula merah\n");
}
}
  
