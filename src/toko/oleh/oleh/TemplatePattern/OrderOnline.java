package toko.oleh.oleh.TemplatePattern;


public class OrderOnline extends OrderTemplate{
    
    @Override
    public void doMemilih() 

    { 

        System.out.println("Item ditambahkan ke keranjng belanja online"); 

        System.out.println("Dapatkan bungkus yang menarik"); 

        System.out.println("Masukkan Alamat Tujuan"); 

    } 

  

    @Override

    public void doBayar() 

    { 

        System.out.println("Pembayaran dapat dilakukan dengan Transfer Bank atau Dompet digital"); 

    } 

  

    @Override
    public void doAntar() 

    { 

        System.out.println ("Barang dikirim melalui jasa pengantaran ke alamat Anda"); 

    } 

  
} 