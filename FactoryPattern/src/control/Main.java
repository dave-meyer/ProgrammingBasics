package control;

import java.util.Scanner;

/**
 * Test des Factory Patterns
 * @author David Meyer
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		
		PizzaFactory factory = new PizzaFactory();
		
		System.out.println("Welcome to the PizzaFactory!");
		System.out.println("*----------------------------------*");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Your order, please?");
			try {
				String scanned = scan.nextLine();
				if(scanned.toLowerCase().equals("exit")) break;
				IPizza pizza = factory.createPizza(scanned);
				System.out.println("Here you are!");
				System.out.println("The Pizza has following ingredients:");
				for(int i = 0; i < pizza.getIngredients().size(); i++) {
					System.out.print(pizza.getIngredients().get(i));
					if(i < pizza.getIngredients().size()-1) System.out.print(", ");
				}
				System.out.println();
			} catch (PizzaNotFoundException e) {
				//e.printStackTrace();
				System.out.println("I am sorry, we don't serve this kind of pizza");
			}
		}
		scan.close();
		System.out.println("Goodbye!");
	}	
}