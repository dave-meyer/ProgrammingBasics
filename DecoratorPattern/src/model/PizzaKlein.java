package model;

/**
 * 
 * @author David Meyer
 *
 */
public class PizzaKlein extends Pizza {

	public PizzaKlein() {
		super();
		this.preis = 5.0;
	}
	
	@Override
	public String getBeschreibung() {
		return "Kleine " + super.getBeschreibung();
	}
	
}
