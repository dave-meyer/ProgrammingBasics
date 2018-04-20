package model;

/**
 * 
 * @author David Meyer
 *
 */
public class PizzaMittel extends Pizza {

	public PizzaMittel() {
		super();
		this.preis = 6.0;
	}
	
	@Override
	public String getBeschreibung() {
		return "Mittlere " + super.getBeschreibung();
	}
	
}
