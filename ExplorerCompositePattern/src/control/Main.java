package control;

import model.Composite;
import model.Leaf;

/**
 * Test des Explorers mit Composite Pattern
 * @author David Meyer
 *
 */
public class Main {

	public static void main(String[] args) {
		// Hauptordner
		Composite gesamtOrdner = new Composite("Schule");
		
		// Ordner fuer Faecher
		Composite ordner1 = new Composite("UFW-P");
		Composite ordner2 = new Composite("SWP-OP");
		Composite ordner3 = new Composite("AUT-AUT");

		
		gesamtOrdner.addChild(ordner1);
		gesamtOrdner.addChild(ordner2);
		gesamtOrdner.addChild(ordner3);
		
		// Inhalt Ordner 1
		Leaf mitschrift1 = new Leaf("Mitschrift 1", "Management systeme", 500000);
		ordner1.addChild(mitschrift1);
		
		// Inhalt Ordner 2
		Composite ordner4 = new Composite("Composite Pattern");
		Leaf mitschrift2 = new Leaf("Mitschrift 1", "Composite Pattern", 250000);
		Leaf mitschrift3 = new Leaf("Beispiel", "Untersuchung", 500000);
		Leaf mitschrift4 = new Leaf("Beispiel 2", "Explorer", 500000);
		ordner4.addChild(mitschrift2);
		ordner4.addChild(mitschrift3);
		ordner4.addChild(mitschrift4);
		ordner2.addChild(ordner4);
		
		// Inhalt Ordner 3
		ordner3.addChild(new Leaf("Mitschrift 1", "PT1 Element", 1000000000));
		
		// Ausgabe der Ordnerstrukur des Hauptordners
		System.out.println(gesamtOrdner.getStructure());
	}
}