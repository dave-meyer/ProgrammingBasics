package model.zutaten;

import model.Pizza;

/**
 * 
 * @author David Meyer
 *
 */
public abstract class ZutatenDecorator extends Pizza {

	private Pizza pizza;
	
	public ZutatenDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getBeschreibung() {
		return pizza.getBeschreibung();
	}
	
	@Override
	public double getPreis() {
		return pizza.getPreis();
	}
}
