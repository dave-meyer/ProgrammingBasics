package model.leafs;

import model.Leaf;

public class OperationsCheck extends Leaf {

	public OperationsCheck() {
		this.setCosts(5);
		this.setName("OperationsCheck");
	}
	
	@Override
	public void operation() {
		System.out.println("Check nach der Operation wird ausgeführt");
	}		
}