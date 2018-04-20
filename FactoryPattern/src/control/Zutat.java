package control;

public class Zutat {

	private String zutat;
	private float menge;
	private Dimension einheit;
	
	public Zutat(String zutat, float menge, Dimension einheit) {
	
		this.zutat = zutat;
		this.menge = menge;
		this.einheit = einheit;
	}
	
	@Override
	public String toString() {
		//return zutat+" x "+menge+" "+("" + einheit.toString().charAt(0)).toUpperCase() + einheit.toString().substring(1).toLowerCase();
		return zutat+" x "+menge+" "+einheit.text;
	}
}