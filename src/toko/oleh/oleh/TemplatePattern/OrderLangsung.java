package toko.oleh.oleh.TemplatePattern;

public class OrderLangsung extends OrderTemplate{
    
    @Override
    public void doMemilih() 

    { 

        System.out.println("Pembeli memilih sendiri barang yang diinginkan"); 
        System.out.println("Jika beruntung maka dapat mencicipi"); 
    } 

  

    @Override

    public void doBayar() 

    { 

        System.out.println("Bayar langsung dikasir secara Tunai atau dengan Kartu ATM"); 

    } 

  

    @Override

    public void doAntar() 

    { 

        System.out.println("Barang siap dibawa oleh pembeli"); 

    } 
}
