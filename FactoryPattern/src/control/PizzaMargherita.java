package control;

import java.util.ArrayList;

public class PizzaMargherita implements IPizza {

	private ArrayList<Zutat> ingredients;
	/** Ist die Pizza vorbereitet? */
	private boolean prepared = false;
	/** Ist die Pizza gebacken? */
	private boolean baked = false;
	
	public PizzaMargherita() {
		
		ingredients = new ArrayList<Zutat>();
		ingredients.add(new Zutat("Tomatensauce", 100, Dimension.GRAMM));
		ingredients.add(new Zutat("Käse", 50, Dimension.GRAMM));
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

	public boolean isPrepared() {
		return prepared;
	}

	public boolean isBaked() {
		return baked;
	}
}