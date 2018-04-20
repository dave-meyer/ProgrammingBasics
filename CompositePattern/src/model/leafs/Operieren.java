package model.leafs;

import model.Leaf;

public class Operieren extends Leaf {

	public Operieren() {
		this.setCosts(100);
		this.setName("Operation");
	}
	
	@Override
	public void operation() {
		System.out.println("Eine Operation wird durchgeführt");
	}	
	
}
