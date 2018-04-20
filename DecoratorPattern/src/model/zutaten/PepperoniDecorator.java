package model.zutaten;

import model.Pizza;

/**
 * 
 * @author David Meyer
 *
 */
public class PepperoniDecorator extends ZutatenDecorator {

	public PepperoniDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " mit Pepperoni";
	}
	
	@Override
	public double getPreis() {
		return super.getPreis() + 0.5;
	}
	
}
