package controller;

/**
 * Test fuer das Singleton Pattern
 * @author David Meyer
 */
public class Main {
	/**
	 * Testet den Singleton Pattern
	 * Holt sich mehrmals die Instanz des Singletons
	 * Jedes Mal wird die selbe Instanz zurueckgegeben
	 * Bei der ersten Durchfuehrung wird eine neue Instanz erstellt,
	 * danach wird jedoch nur die vorhandene Instanz zurueckgegeben
	 * @param args Laufzeitparameter (keine)
	 */
	public static void main(String[] args) {
		
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
}