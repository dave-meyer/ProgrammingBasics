package control;

/**
 * Einheit von Pizza Zutaten
 */
public enum Dimension {

	PRISE("Prise"),
	ESSLOEFFEL("Esslöffel"),
	TEELOEFFEL("Teelöffel"),
	KILOGRAMM("Kilogramm"),
	GRAMM("Gramm"),
	DEKAGRAMM("Dekagramm"),
	STUECK("Stück");
	
	/** Anzeigetext der Einheit */
	String text;
	Dimension(String text) {
		this.text = text;
	}
	
	/** Anzeigetext der Einheit */
	public String getText()  {
		return text;
	}
}