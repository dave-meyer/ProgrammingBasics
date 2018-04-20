package controller;

/**
 * Singleton = Eine Klasse, von der nur eine Instanz erstellt werden kann
 * Die Instanz wird in der statischen Variable instance gespeichert
 * Die statische Methode getInstance() gibt die Instanz zurueck
 * Falls die Instanz noch nicht existiert, wird sie in der getInstance() Methode erstellt und danach erst zurueckgegeben
 * Der Konstruktor der Klasse ist private, weswegen extern keine Instanz erstellt werden kann
 * Die Instanz wird nur in der getInstance() Methode erstellt, falls noch keine Instanz erstellt wurde
 * 
 * @author David Meyer
 */
public class Singleton {

	/** Einzige Instanz der Klasse */
	private static Singleton instance;
	
	/** Privater Konstruktor */
	private Singleton() {
	}
	
	/** 
	 * Gibt die Instanz zurueck
	 * Falls keine existiert, wird eine erstellt
	 * @return die einzige Instanz der Klasse
	 */
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
			System.out.println("Eine neue Instanz wurde erstellt");
		}
		else {
			System.out.println("Eine schon erstellte Instanz wurde zurückgegeben");
		}
		return instance;
	}
}