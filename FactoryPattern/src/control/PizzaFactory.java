package control;

public class PizzaFactory {

	public IPizza createPizza(String pizzaType) throws PizzaNotFoundException {

		System.out.println("Okay");
		pizzaType = pizzaType.toLowerCase();
		String[] pizzaInstructions = pizzaType.split(" ");
		IPizza pizza;
		switch(pizzaInstructions[0]) {
		case "diavolo":
			PizzaDiavolo pizzaDiavolo = new PizzaDiavolo();
			pizzaDiavolo.create();
			pizzaDiavolo.backen(5);
			pizza = pizzaDiavolo;
			break;
		case "margherita": 
			PizzaMargherita pizzaMargherita = new PizzaMargherita();
			pizzaMargherita.create();
			pizzaMargherita.backen(4);
			pizza = pizzaMargherita;
			break;
		default: throw new PizzaNotFoundException(pizzaType);
		}

		if(pizzaInstructions.length > 1) {
			switch (pizzaInstructions[1]) {
			case "extrakäse":
				pizza.getIngredients().add(new Zutat("Käse", 50, Dimension.GRAMM));
				break;
			case "mais":
				pizza.getIngredients().add(new Zutat("Mais", 5, Dimension.PRISE));
				break;
			case "balsamico":
				pizza.getIngredients().add(new Zutat("Balsamico", 2, Dimension.TEELOEFFEL));
				break;
			case "scharf":
				pizza.getIngredients().add(new Zutat("Chili", 1, Dimension.PRISE));
				break;
			}
		}
		return pizza;
	}
}