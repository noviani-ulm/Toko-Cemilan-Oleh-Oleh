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
public class Ikan implements ItemElement {
	
	private int hargaPerwadah;
	private int jumlah;
	private String nama;
	
	public Ikan(int PerWadah, int jl, String nm){
		this.hargaPerwadah = PerWadah;
                this.jumlah = jl;
                this.nama = nm;
	}
	
	public int getHargaPerWadah() {
		return hargaPerwadah;
	}


	public int getJl() {
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