package model;

/**
 * 
 * @author David Meyer
 *
 */
public class PizzaGross extends Pizza {

	public PizzaGross() {
		super();
		this.preis = 7.0;
	}
	
	@Override
	public String getBeschreibung() {
		return "Grosse " + super.getBeschreibung();
	}
}
