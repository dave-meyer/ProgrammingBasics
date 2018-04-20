package control;

import java.util.ArrayList;

public class PizzaDiavolo implements IPizza {

	private ArrayList<Zutat> ingredients;
	private boolean prepared = false;
	private boolean baked = false;
	
	public PizzaDiavolo() {
		
		ingredients = new ArrayList<Zutat>();
		ingredients.add(new Zutat("Tomatensauce", 100, Dimension.GRAMM));
		ingredients.add(new Zutat("Salami", 4, Dimension.STUECK));
		ingredients.add(new Zutat("Käse", 50, Dimension.GRAMM));
		ingredients.add(new Zutat("Jalapenos", 3, Dimension.STUECK));
	}
	
	@Override
	public void create() {
		prepared = true;
	}
	
	public void addIngredient(Zutat zutat) {
		ingredients.add(zutat);
	}
	
	@Override
	public ArrayList<Zutat> getIngredients() {
		return ingredients;
	}

	@Override
	public void backen(float minutes) {
		
		int startZeit = (int) System.currentTimeMillis()/1000;
		int currentTime = (int) System.currentTimeMillis()/1000;
		while(currentTime < (startZeit + (minutes))) { // Zur Simulation sind Minuten=Sekunden
			currentTime = (int) System.currentTimeMillis()/1000;
		}
		baked = true;
	}
	
	@Override
	public String toString() {
		String s = "PizzaDiavolo with the ingredients";
		for(int i = 0; i < this.getIngredients().size(); i++) {
			s += getIngredients().get(i);
			if(i < this.getIngredients().size()-1) s += ", ";
		}
		return s;
	}
}