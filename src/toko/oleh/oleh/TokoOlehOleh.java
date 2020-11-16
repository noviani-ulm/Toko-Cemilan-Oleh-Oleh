/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.oleh.oleh;
import java.util.Scanner;
import toko.oleh.oleh.FactoryPattern.JenisMakanan;
import toko.oleh.oleh.FactoryPattern.Makanan;
import toko.oleh.oleh.FactoryPattern.MakananFactory;
public class TokoOlehOleh {
   
    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        
        System.out.println("********** SELAMAT DATANG ***********");
        System.out.println(" Di Toko Oleh-Oleh Khas Banjarmasin ");
        System.out.println(" ");
        System.out.println("Yuk Lihat Produk Kami: \n");
        Makanan satu = MakananFactory.getMakanan(JenisMakanan.Amplang_Kotabaru);
        satu.rasa();
    
        Makanan dua = MakananFactory.getMakanan(JenisMakanan.Apam_Barabai);
        dua.rasa();
    
        Makanan tiga = MakananFactory.getMakanan(JenisMakanan.Dodol_Kandangan);
        tiga.rasa();
    
        Makanan empat = MakananFactory.getMakanan(JenisMakanan.Ikan_Rabuk);
        empat.rasa();
    
        Makanan lima = MakananFactory.getMakanan(JenisMakanan.Wadai_Rangai);
        lima.rasa();
    
        Makanan enam = MakananFactory.getMakanan(JenisMakanan.Wadai_Rimpi);
        enam.rasa();
    
        Makanan tujuh = MakananFactory.getMakanan(JenisMakanan.Wajik);
        tujuh .rasa();
    
        Makanan delapan = MakananFactory.getMakanan(JenisMakanan.Ikan_Asin);
        delapan.rasa();
        
        
        Scanner input = new Scanner(System.in);
        String ul = "",lagi;
        System.out.println("Wah...bagaimana nih produk kami?");
        System.out.println("Informasi apalagi yang ingin kamu dapatkan?");
        System.out.println("1. Proses Pembuatan");
        System.out.println("2. Harga Produk");
        System.out.println("3. Pembelian Produk");
        System.out.println("4. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = input.nextInt();
        System.out.println("=====================================");

        switch(pilih) {
            case 1:{
                
                break;
            }
            case 2:{
                
                break;
            }
             case 3:{
                 System.out.println("Pembelian melalui Online:");
                 toko.oleh.oleh.TemplatePattern.OrderTemplate orderonline = new toko.oleh.oleh.TemplatePattern.OrderOnline();
                 orderonline.prosesOrder(true);
                 System.out.println();
               
                 System.out.println("\nPembelian Langsung:");
                 toko.oleh.oleh.TemplatePattern.OrderTemplate orderlangsung = new toko.oleh.oleh.TemplatePattern.OrderLangsung();
                 orderlangsung.prosesOrder(true);
                   break;
             }
            case 4:{
                System.exit(4);
                System.out.println("Terima Kasih sudah berkunjung di Sistem Informasi Toko Oleh-Oleh Banjarmasin!! ");
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
    }
}
    
