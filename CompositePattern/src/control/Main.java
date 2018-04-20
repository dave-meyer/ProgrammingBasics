package control;

import model.leafs.*;
import model.composites.*;

public class Main {
	
	public static void main(String[] args) {
		
		Untersuchung baum = new Untersuchung("UNTERSUCHEN");
		
		// Ebene 1
		Untersuchung vorUntersuchung = new Untersuchung("Voruntersuchung");			// 1
		Untersuchung hauptUntersuchung = new Untersuchung("Hauptuntersuchung");		// 2	
		Untersuchung nachUntersuchung = new Untersuchung("Nachuntersuchung");		// 3
		
		baum.add(vorUntersuchung);
		baum.add(hauptUntersuchung);
		baum.add(nachUntersuchung);
		
		// Ebene 2
		vorUntersuchung.add(new FieberMessen());
		vorUntersuchung.add(new BlutdruckMessen());
		hauptUntersuchung.add(new BlutdruckMessen());
		Oberarzt oberArzt = new Oberarzt();
		oberArzt.add(new Operieren());			// Ebene 3
		oberArzt.add(new OperationsCheck());	// Ebene 3
		hauptUntersuchung.add(oberArzt);
		
		nachUntersuchung.add(new Roentgen());	
		Oberarzt oberArzt2 = new Oberarzt();	
		oberArzt2.add(new BlutdruckMessen());	// Ebene 3
		nachUntersuchung.add(oberArzt2);		// Ebene 3
		
		System.out.println(baum.getStructure(0));
	}
}