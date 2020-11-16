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
public interface ShoppingCartVisitor {

	int visit(Kue kue);
        int visit(Ikan ikan);
}