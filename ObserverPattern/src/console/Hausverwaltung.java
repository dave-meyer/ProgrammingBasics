package console;

/**
 * Implementierung eines Observers
 * Soll über Temperaturänderungen der Heizungsschaltung benachrichtigt werden
 * 
 * @see IObserver
 * @see Heizungsschaltung
 * @author David Meyer
 */
public class Hausverwaltung implements IObserver {

	/**
	 * Derzeitige Temperatur der Heizung (in °C)
	 * Dieser Wert wird mit dem Observer aktuell gehalten
	 */
	float temperatur;
	
	@Override
	public void tempGeaendert(float temp) {
		temperatur = temp;
		System.out.println("Observer2 (Hausverwaltung) hat die Temperatur mitbekommen: " + temperatur);
	}

	@Override
	public String toString() {
		return "Hausverwaltung";
	}
}
