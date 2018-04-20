package model.leafs;

import model.Leaf;

public class BlutdruckMessen extends Leaf {

	public BlutdruckMessen() {
		this.setCosts(15);
		this.setName("Blutdruck messen");
	}
	
	@Override
	public void operation() {
		System.out.println("Blutdruck wird gemessen");
	}	
	
}
