package model;

/**
 * Component
 * @author David Meyer
 */
public abstract class Component {

	/** Name der Datei oder Ordner */
	String name;
	
	/** Groesse der Datei oder Gesamtgroesse des Ordners */
	public abstract double getDateigroesse();
	
	/** Konstruktor */
	public Component(String name) {
		this.name = name;
	}
	
	/** @return Name der Datei oder Ordner  */
	public String getName() {
		return name;
	}
	
	@Override
	/** @return Default: Name */
	public String toString() {
		return getName();
	}
	
	/** @return Baumstruktur fuer Ordner und Dateien */
	public abstract String getStructure(int layer);
	
	/** @return Struktur mit Layer 0 */
	public String getStructure() {
		return getStructure(0);
	}
	
	/**
	 * Einheit der Dateigroesse bestimmen
	 * Beispiel:
	 * 1000 Bytes = 1 KB
	 * 1 250 000 Bytes = 1.25 MB
	 * @return Gibt die Dateigroesse mit Suffix zurueck
	 */
	public String getDateigroesseAsString() {
		double groesse = getDateigroesse();
		String suffix = "";
		int counter = 0;
		while((groesse / 1000) >= 1) {
			counter++;
			switch(counter) {
			case 1: suffix = "KB"; break;
			case 2: suffix = "MB"; break;
			case 3: suffix = "GB"; break;
			case 4: suffix = "TB"; break;
			default: return groesse+suffix;
			}
			groesse /= 1000;
		}
		
		return groesse+suffix;
	}
}
