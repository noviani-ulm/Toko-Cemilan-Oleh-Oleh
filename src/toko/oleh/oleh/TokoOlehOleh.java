/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.oleh.oleh;
import java.util.Scanner;
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
                 toko.oleh.oleh.TemplatePattern.OrderTemplate tempatorder = new toko.oleh.oleh.TemplatePattern.OrderOnline();
                 tempatorder.processOrder(true);
                 System.out.println();
                 System.out.println("\nPembelian Langsung:");
                 toko.oleh.oleh.TemplatePattern.OrderTemplate bayarorder = new toko.oleh.oleh.TemplatePattern.OrderLangsung();
                 bayarorder.processOrder(true);
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
    