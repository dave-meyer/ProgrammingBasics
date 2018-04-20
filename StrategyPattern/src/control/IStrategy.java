package control;
import java.util.ArrayList;

/**
 * Vorlage fuer verschiedene Kompressionstrategien
 * 
 * Die Methode compress wird vorgegeben.
 * Jede Kompressionsstrategie muss diese Methode implementieren 
 * Sie wird dann von einem StrategyContext Objekt ausgefuehrt
 * 
 * @author David Meyer
 * @see StrategyContext
 */
public interface IStrategy {

	/** Komprimiert die angegebenen Dateien
	 * Der Komprimierungsalgorithmus wird durch die jeweilige Implementierung festgelegt
	 * @param files Liste mit Dateipfaden, dessen Dateien komprimiert werden sollen
	 */
	public void compress(ArrayList<String> files);
}