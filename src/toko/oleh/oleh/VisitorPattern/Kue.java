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
public class Kue implements ItemElement {
    private int hargaSatuan;
    private int jumlah;
    private String nama;
    
    public Kue (int hs, int jm, String nm){
        this.hargaSatuan = hs;
        this.jumlah = jm;
        this.nama = nm;
    }
    
    public int getHargaSatuan(){
        return hargaSatuan;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public String getNama(){
        return this.nama;
    }
@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

