package model.leafs;

import model.Leaf;

public class Roentgen extends Leaf {

	public Roentgen() {
		this.setCosts(25);
		this.setName("Röntgen");
	}
	
	@Override
	public void operation() {
		System.out.println("Es wird Verb.parseVerb(\"Röntgen\").toPastParticiple()");
	}	
	
}
