package model.zutaten;

import model.Pizza;

/**
 * 
 * @author David Meyer
 *
 */
public class TomatenDecorator extends ZutatenDecorator {

	public TomatenDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " mit Käse";
	}
	
	@Override
	public double getPreis() {
		return super.getPreis() + 0.5;
	}
	
}
