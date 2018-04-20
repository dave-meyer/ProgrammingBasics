package model.zutaten;

import model.Pizza;

/**
 * 
 * @author David Meyer
 *
 */
public class KaeseDecorator extends ZutatenDecorator {

	public KaeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " mit Kaese";
	}
	
	@Override
	public double getPreis() {
		return super.getPreis() + 0.5;
	}	
}