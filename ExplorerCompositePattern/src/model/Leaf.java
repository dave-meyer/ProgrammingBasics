package model;

/**
 * Leaf (Datei)
 * @author David Meyer
 *
 */
public class Leaf extends Component {

	/** Dateigroesse in Bytes */
	double dateigroesse;
	/** Inhalt der Datei */
	String inhalt;
	
	public Leaf(String name, String inhalt, double groesse) {
		super(name);
		dateigroesse = groesse;
		this.inhalt = inhalt;
	}
	
	@Override
	/**
	 * Groesse der Datei
	 */
	public double getDateigroesse() {
		return dateigroesse;
	}

	/** @return Inhalt der Datei */
	public String getInhalt() {
		return inhalt;
	}
	
	/** @param inhalt Inhalt der Datei */
	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	
	/** Gibt den Inhalt der Datei in der Konsole aus */
	public void printInhalt() {
		System.out.println(inhalt);
	}
	
	@Override
	/** @return Alias von toString() */
	public String getStructure() {
		return toString();
	}	
	
	@Override
	/** @return Name und Dateigroesse (mit Suffix) */
	public String toString() {
		return this.getName()+" "+getDateigroesseAsString();
	}

	@Override
	/** @return Alias von getStructure() */
	public String getStructure(int layer) {
		return getStructure(); 
	}
}