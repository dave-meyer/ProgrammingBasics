package console;

/**
 * Implementierung eines Observers
 * Soll �ber Temperatur�nderungen der Heizungsschaltung benachrichtigt werden
 * 
 * @see IObserver
 * @see Heizungsschaltung
 * @author David Meyer
 */
public class Hausmeister implements IObserver {

	/**
	 * Derzeitige Temperatur der Heizung (in �C)
	 * Dieser Wert wird mit dem Observer aktuell gehalten
	 */
	float temperatur;
	
	@Override
	/**
	 * Wird von der Heizunggschaltung ausgef�hrt,
	 * wenn sich dort die Temperatur �ndert
	 * und dieses Objekt bei der Heizungsschaltung als Observer eingetragen ist
	 */
	public void tempGeaendert(float temp) {
		temperatur = temp;
		System.out.println("Observer1 (Hausmeister) hat die Temperatur mitbekommen: " + temperatur);
	}	
	
	@Override
	public String toString() {
		return "Hausmeister";
	}
}