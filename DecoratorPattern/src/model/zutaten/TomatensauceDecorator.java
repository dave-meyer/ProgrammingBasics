package model.zutaten;

import model.Pizza;

/**
 * 
 * @author David Meyer
 *
 */
public class TomatensauceDecorator extends ZutatenDecorator {

	public TomatensauceDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " mit Tomatensauce";
	}
	
	@Override
	public double getPreis() {
		return super.getPreis() + 1.0;
	}
	
}
