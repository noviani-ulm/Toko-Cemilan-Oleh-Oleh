/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.oleh.oleh.VisitorPattern;

/**
 *
 * @author ASUS
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Kue kue) {
		int cost = kue.getHargaSatuan()*kue.getJumlah();
		System.out.println(kue.getNama()+ " Harga = " + kue.getHargaSatuan());
                System.out.println("Jumlah dibeli " + kue.getJumlah() + " Biji" + " total " +cost);
                System.out.println();
               
		return cost;
	}
        
        @Override
	public int visit(Ikan ikan) {
		int cost = ikan.getHargaPerWadah()*ikan.getJl();
		System.out.println(ikan.getNama()+ "Harga = " + ikan.getHargaPerWadah());
                System.out.println("Jumlah dibeli " + ikan.getJl() + " Wadah" + " total " + cost);
                System.out.println();
		return cost;
	}
}
