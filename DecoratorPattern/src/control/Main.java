package control;

import java.util.Scanner;

/**
 * 
 * @author David Meyer
 *
 */
public class Main {

	public static void main(String[] args) {

		PizzaFactory fabrik = new PizzaFactory();
		System.out.print(fabrik.getWilkommensnachricht());
		
		Scanner scan = new Scanner(System.in);
		String input;
		while(true) {
			input = scan.nextLine();
			if(input.equals("exit")) break;
			try {
				System.out.println(fabrik.pizzaBestellen(input));
			} catch (PizzaNotFoundException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		scan.close();
	}

}
