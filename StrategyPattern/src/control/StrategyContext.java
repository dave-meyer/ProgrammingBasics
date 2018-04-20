package control;
import java.util.ArrayList;

/**
 * Kontext fuer verschiedene Kompressionstrategien
 * als Beispiel fuer das StrategyPattern
 * 
 * Erlaubt das Setzen und Ausfuehren einer Kompressionsstrategie.
 * Jede Strategie implementiert das IStrategy Interface,
 * wodurch verschiedene Strategien (in Form von Objekten der Strategieklassen)
 * in einer Variable gespeichert werden koennen. 
 * 
 * Das StrategyPattern gibt die compress Methode vor, welche die einzelnen
 * Implementierungen bzw. Klassen bzw. Kompressionsstrategien implementieren und
 * und auf ihren eigenen Algorithmus festlegen.
 * 
 * Die executeStrategy Methode fuehrt die compress Methode auf dem festgelegten
 * Strategy Objekt aus. Dem Programm ist zu diesem Zeitpunkt nicht bekannt,
 * welcher Kompressionsalgorihmus ausgefuehrt wird, da das Strategy Objekt 
 * in einer IStrategy Variable referenziert wird. 
 * Das Programm muss dies auch nicht wissen, solange die strategy Variable
 * gesetzt ist.
 * 
 * 5BHWII 2017/18
 * @author David Meyer
 * @see IStrategy
 */
public class StrategyContext {

	/** Objekt welches die auszufuehrende Strategie angibt */
	private IStrategy strategy;
	
	/** Setzt das zu verwendende Strategieobjekt */
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	/** Fuehrt die Kompressionsstrategie aus
	 *  @param files Liste mit Dateipfaden zu Dateien die komprimiert werden sollen
	 */
	public void executeStrategy(ArrayList<String> files) {
		strategy.compress(files);
	}
	
	/** Testen verschiedene Kompressionsstrategien 
	 * @param args Laufzeitparameter (keine)
	 */
	public static void main(String[] args) {
		
		// Liste mit Dateipfaden erstellen
		ArrayList<String> pfade = new ArrayList<String>();
		pfade.add("file.txt");
		
		// Kontextobjekt erzeugen
		StrategyContext context = new StrategyContext();
		
		// Zip Strategie einstellen und testen
		context.setStrategy(new StrategyZip());
		context.executeStrategy(pfade);
		
		// Rar Strategie einstellen und testen
		context.setStrategy(new StrategyRar());
		context.executeStrategy(pfade);
	}
}