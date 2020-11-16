
package toko.oleh.oleh.TemplatePattern;


public abstract class OrderTemplate 
{ 

    public boolean bungkus; 

  

    public abstract void doMemilih(); 

  

    public abstract void doBayar(); 

  

    public final void barangdibungkus() 

    { 

        try

        { 

            System.out.println("Barang telah dibungkus"); 

        } 

        catch (Exception e) 

        { 

            System.out.println("Barang tidak dibungkus"); 

        } 

    } 

  

    public abstract void doAntar(); 


    public final void prosesOrder(boolean bungkus) 

    { 

        doMemilih(); 

        doBayar(); 

        if (bungkus) { 

            barangdibungkus(); 

        } 

        doAntar(); 

    } 
} 


