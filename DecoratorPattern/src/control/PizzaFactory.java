package control;

import model.Pizza;
import model.PizzaGross;
import model.PizzaKlein;
import model.PizzaMittel;
import model.zutaten.KaeseDecorator;
import model.zutaten.PepperoniDecorator;
import model.zutaten.TomatensauceDecorator;

/**
 * 
 * @author David Meyer
 *
 */
public class PizzaFactory {

	public PizzaFactory() {
		
	}
	
	/**
	 * @return Willkommen in der PizzaFabrik!
	 */
	public String getWilkommensnachricht() {
		return "Wilkommen in der PizzaFabrik!\n";
	}
	
	/**
	 * Pizza bestellen mit Größe unt Pizzatyp
	 * Wird Größe nicht angegeben: Mittlere Pizza
	 * @param pizzaString Groesse (optional) und Pizzatyp
	 * @return Gewünschte Pizza
	 * @throws PizzaNotFoundException Unzulässige Größe oder Typ
	 */
	public Pizza pizzaBestellen(String pizzaString) throws PizzaNotFoundException {
		
		pizzaString = pizzaString.toLowerCase(); // Gross- und Kleinschreibung ignorieren
		String[] splits = pizzaString.split(" "); // "Befehle aufspalten"
		Pizza p = null;	// servierte Pizza
		Pizza basePizza = null; // Klein, Mittel, Gross, ... 
		String pizzaGroesse = "";
		String pizzaTyp = "";
		
		if(splits.length > 1) { // Wenn mehrere "Befehle"
			
			pizzaGroesse = splits[0]; // Erster Befehl = Pizzagroesse
			pizzaTyp = splits[1]; // Zweiter Befehl = Pizzatyp
			switch(pizzaGroesse) {
				case "grosse": basePizza = new PizzaGross(); break;
				case "mittlere": basePizza = new PizzaMittel(); break;
				case "kleine": basePizza = new PizzaKlein(); break;
				default: throw new PizzaNotFoundException(pizzaString);
			}
		}
		else { // Wenn nur ein einziger "Befehl"
			pizzaTyp = splits[0]; // Pizzatyp
			// Pizzagroesse =  Mittlere Pizza
			basePizza = new PizzaMittel();
		}
		switch(pizzaTyp) {
			case "margherita": p = new KaeseDecorator(new TomatensauceDecorator(basePizza)); break;
			case "diavolo": p = new KaeseDecorator(new TomatensauceDecorator(new PepperoniDecorator(basePizza))); break;
			default: throw new PizzaNotFoundException(pizzaString);
		}
		
		return p;
	}	
}