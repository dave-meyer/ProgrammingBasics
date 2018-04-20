package model;

/**
 * 
 * @author David Meyer
 *
 */
public abstract class Pizza {

	double preis;
	
	public Pizza() {
		preis = 0;
	}
	
	public double getPreis() {
		return this.preis;
	}
	
	public String getBeschreibung() {
		return "Pizza";
	}
	
	@Override
	public String toString() {
		return getBeschreibung() + ": \t" + getPreis() + "€";
	}
}
