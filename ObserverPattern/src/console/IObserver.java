package console;

/**
 * Die Heizungsschaltung nutzt dieses Interface,
 * um mehrere verschiedene Objekte unterschiedlicher Klassen
 * zu benachrichtigen, wenn es eine Temperatur�nderung gibt
 * 
 * Die zu benachrichtigen Observerklassen
 * m�ssen dieses Interface implementieren.
 * Dabei m�ssen sie die tempGe�ndert(temp) Methode
 * �berschreiben. 
 * Dort k�nnen die Klassen f�r sich selbst festlegen, was sie
 * mit dem Temperaturwert anstellen wollen
 * 
 * @author David Meyer
 */
public interface IObserver {

	/**
	 * Wird ausgef�hrt, sobald sich die Temperatur �ndert.
	 * Hier sollen alle eingetragenen Observer benachrichtigt werden
	 * @param temp neuer Temperaturwert
	 */
	public void tempGeaendert(float temp);
}