package control;

/**
 * Wenn die angegebene Pizzagröße oder Pizzatyp nicht zulässig ist
 * @author David Meyer
 *
 */
public class PizzaNotFoundException extends Exception {

	String text = "";
	
	public PizzaNotFoundException() {
		text = "Wir führen diese Pizza nicht";
	}
	
	public PizzaNotFoundException(String eingabe) {
		text = "Wir führen die Pizza '" + eingabe + "' nicht";
	}
	
	@Override
	public String getMessage() {
		return text;
	}
	
}
