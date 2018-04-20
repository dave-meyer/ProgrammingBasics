package console;

/**
 * Die Heizungsschaltung nutzt dieses Interface,
 * um mehrere verschiedene Objekte unterschiedlicher Klassen
 * zu benachrichtigen, wenn es eine Temperaturänderung gibt
 * 
 * Die zu benachrichtigen Observerklassen
 * müssen dieses Interface implementieren.
 * Dabei müssen sie die tempGeändert(temp) Methode
 * überschreiben. 
 * Dort können die Klassen für sich selbst festlegen, was sie
 * mit dem Temperaturwert anstellen wollen
 * 
 * @author David Meyer
 */
public interface IObserver {

	/**
	 * Wird ausgeführt, sobald sich die Temperatur ändert.
	 * Hier sollen alle eingetragenen Observer benachrichtigt werden
	 * @param temp neuer Temperaturwert
	 */
	public void tempGeaendert(float temp);
}