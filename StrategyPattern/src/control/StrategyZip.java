package control;
import java.util.ArrayList;

/**
 * Strategie fuer die Kompression mit zip
 * @author David Meyer
 * @see IStrategy
 * @see StrategyContext
 */
public class StrategyZip implements IStrategy {

	@Override
	/** Sollte die Dateien an den angegebenen Pfaden mit zip komprimieren 
	 * Testweise findet eine Konsolenausgabe statt
	 * @param files ArrayList mit den Pfaden zu den Dateien
	 */
	public void compress(ArrayList<String> files) {
		System.out.println("Compressing with zip");
	}
}