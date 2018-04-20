package control;

/**
 * Wenn eine Pizza verlangt wurde, die aber nicht existiert
 * @author David Meyer
 * @version 1.0
 */
public class PizzaNotFoundException extends Exception {

	/** Name der Pizza der eingegeben aber nicht gefunden wurde */
	String pizzaName;
	
	public PizzaNotFoundException(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	
	/** Error Message */
	public String getMessage() {
		return "Pizza " + pizzaName + " does not exist";
	}	
}