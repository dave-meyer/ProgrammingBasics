package control;

import java.util.ArrayList;

public interface IPizza {
	
	/** Pizza zubereiten und baken */
	void create();
	/** Zutaten der Pizza */
	ArrayList<Zutat> getIngredients();
	
	void backen(float minutes);
}