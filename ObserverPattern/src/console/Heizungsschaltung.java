package console;

import java.util.ArrayList;

/**
 * Simulation einer Heizungsschaltung
 * welche mittels dem ObserverPattern eingetragene
 * Observer über Temperaturänderungen benachrichtigt
 * 
 * Enthält Main, welches ein paar Testfälle durchspielt
 * 
 * @see IObserver
 * @author David Meyer
 */
public class Heizungsschaltung {

	/** Liste mit Observern, die bei einer Aenderung
	 * der Temperatur benachrichtigt werden sollen */
	private ArrayList<IObserver> observer;
	/** Die Temperatur der Heizung (in Grad Celsius) */
	private float temp;
	
	/**
	 * Observer Pattern testen
	 * @param args Laufzeitparameter (nicht verwendet)
	 */
	public static void main(String[] args) {
		
		Heizungsschaltung h = new Heizungsschaltung();
		// 2 Observer erstellen
		Hausmeister o1 = new Hausmeister();
		Hausverwaltung o2 = new Hausverwaltung();
		// Observer als solche in der Heizungsschaltung eintragen
		h.addObserver(o1);
		h.addObserver(o2);
		// Temperaturwert der Heizung veraendern
		h.setTemp(10);
		// Die Observer sollten benachrichtigt werden und eine Konsolenausgabe machen
		
		h.removeObserver(o1);
		h.setTemp(15);
	}
	
	/**
	 * Konstruktor
	 */
	public Heizungsschaltung() {
		observer = new ArrayList<IObserver>(); // Liste mit Observern erstellen
	}
	
	/** Einen neuen Observer hinzufuegen.
	 * Dieser wird (zusammen mit den anderen Observern)
	 * bei einer Aenderung der Temperatur benachrichtigt
	 * (mittels der Methode tempGeandert(float temp) aus dem IObserver Interface)
	 * @param observer Objekt einer Klasse die das Interface IObserver implementiert und benachrichtigt werden soll
	 */
	public void addObserver(IObserver observer) {
		this.observer.add(observer);
	}
	
	/**
	 * Der angegebene Observer soll nicht mehr
	 * ueber Temperaturaenderungen benachrichtigt werden
	 * @param observer Instanz einer Klasse die das Interface IObserver implementiert und nicht mehr benachrichtigt werden soll
	 */
	public void removeObserver(IObserver observer) {
		this.observer.remove(observer);
	}
	
	/**
	 * Ist das angegebene Objekt ein eingetragener Observer
	 * des Heizungschaltung Objektes
	 * @param observer Oberserver Objekt
	 * @return true = Observer ist eingetragen ; false = Observer ist noch nicht eingetragen
	 */
	public boolean isObserver(IObserver observer) {
		return this.observer.indexOf(observer) != 1;
	}
	
	/**
	 * Aktualisiert den Temperaturwert und teilt
	 * den eingetragenen Observern die Aenderung mit
	 * @param t neue Temperaturwert  (in Grad Celsius)
	 */
	public void setTemp(float t) {
		temp = t;
		notifyObserver(temp);
	}
	
	/**
	 * Teilt allen eingetragenen Observern die angegebene Temperatur mit
	 * @param t Die Temperatur, die den Observern mitgeteilt werden soll (in Grad Celsius)
	 */
	public void notifyObserver(float t) {
		for(IObserver obs : observer) {
			obs.tempGeaendert(temp);
		}
	}
}