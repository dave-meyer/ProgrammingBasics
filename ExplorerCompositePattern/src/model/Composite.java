package model;

import java.util.ArrayList;

/**
 * Composite (Ordner)
 * @author David Meyer
 *
 */
public class Composite extends Component {

	/** Kind-Elemente (Ordner oder Dateien) */
	ArrayList<Component> children;
	
	/** Konstruktor */
	public Composite(String name) {
		super(name);
		children = new ArrayList<Component>();
	}
		
	/** @param child Neues Kind hinzufuegen */
	public void addChild(Component child) {
		children.add(child);
	}
	
	/** @return Alle Kinder */
	public ArrayList<Component> getChildren() {
		return children;
	}
	
	/** @param child angegebenes Kind von dem Ordner entfernen  */
	public void removeChild(Component child) {
		getChildren().remove(child);
	}
	
	@Override
	/** @return Ordnername mit Anzahl der Kinder und Dateigroesse */
	public String toString() {
		return getName() + " (Ordner mit "+getChildren().size()+" Kindern, gesamt "+getDateigroesseAsString()+")";
	}

	@Override
	/** @return Dateigroesse aller Dateien im Ordner zusammen */
	public double getDateigroesse() {
		double groesse = 0;
		for(int i = 0; i < getChildren().size(); i++) {
			groesse += getChildren().get(i).getDateigroesse();
		}
		return groesse;
	}
	
	@Override
	/** @return Baumstruktur dieses Ordners mit Unterordnern und Dateien */
	public String getStructure(int layer) {
		String s = "";
		s += toString()+"\n";
		for(int i = 0; i < getChildren().size(); i++) {
			for(int j = 0; j < layer; j++) {
				s += "\t";
			}
			s += "\t"+getChildren().get(i).getStructure(layer + 1)+"\n";
		}
		return s;
	}
}