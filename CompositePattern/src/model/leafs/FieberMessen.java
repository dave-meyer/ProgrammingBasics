package model.leafs;

import model.Leaf;

public class FieberMessen extends Leaf {

	public FieberMessen() {
		this.setCosts(10);
		this.setName("Fieber messen");
	}
	
	@Override
	public void operation() {
		System.out.println("Temperatur wird gemessen");
	}	
	
}
