package toko.oleh.oleh.FactoryPattern;

public abstract class MakananFactory {

   public static Makanan getMakanan (String jenisMakanan){
         if (jenisMakanan.equals(JenisMakanan.Amplang_Kotabaru)){
             return new Amplang();
         }
         else if (jenisMakanan.equals(JenisMakanan.Apam_Barabai)){
             return new Appam();
         }
         else if (jenisMakanan.equals(JenisMakanan.Dodol_Kandangan)){
             return new Dodol();
         }
          else if (jenisMakanan.equals(JenisMakanan.Ikan_Asin)){
             return new IkanAsin();
         }
          else if (jenisMakanan.equals(JenisMakanan.Ikan_Rabuk)){
             return new RabukIkanHaruan();
         }
          else if (jenisMakanan.equals(JenisMakanan.Wadai_Rangai)){
             return new WadaiRangai();
         }
          else if (jenisMakanan.equals(JenisMakanan.Wadai_Rimpi)){
             return new Rimpi();
         }
          else if (jenisMakanan.equals(JenisMakanan.Wajik)){
             return new Wajik();
         }
        return null;
    }
}
    
    

