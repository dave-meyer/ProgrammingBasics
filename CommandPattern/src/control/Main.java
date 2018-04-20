package control;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/** Koordinatensystem (Feld) */
	static int[][] koordinaten = new int[10][10];

	static char leeresFeld = '*';

	/** Enthaelt alle Figuren am Koordinatenfeld */
	static ArrayList<Figur> figuren;

	/** Nimmt alle ausgefuehrten Commands/Befehle auf und laesst Befehle rueckgaengig machen bzw. wiederherstellen */
	static CommandRecorder recorder;

	public static void main(String[] args) {

		figuren = new ArrayList<Figur>();
		figuren.add(new Figur(0, 0, 0));
		recorder = new CommandRecorder();
		
		// Test-Schritte ausfuehren
		recorder.ausfuehren(new HoeherCmd(figuren.get(0), 2));
		recorder.ausfuehren(new HoeherCmd(figuren.get(0), 1));
		recorder.undoSchritt();
		recorder.redoSchritt();
		recorder.ausfuehren(new VorCmd(figuren.get(0), 1));
		recorder.undoSchritt();

		showKoords();

		// Inputs lesen und darauf reagieren
		while(true) {

			Scanner scan = new Scanner(System.in);
			readInput(scan.next());
			showKoords();
			//System.out.println(input);
//			Console cons = System.console();
		}


	}

	public static void readInput(String input) {
		switch(input) {
			case "s": recorder.ausfuehren(new HoeherCmd(figuren.get(0), 1)); break;
			case "w": recorder.ausfuehren(new TieferCmd(figuren.get(0), 1)); break;
			case "a": recorder.ausfuehren(new VorCmd(figuren.get(0), -1)); break;
			case "d": recorder.ausfuehren(new VorCmd(figuren.get(0), 1)); break;
			case "r": recorder.redoSchritt(); break;
			case "q": recorder.undoSchritt(); break;
		}
	}

	/** Koordinatensystem mit Figuren anzeigen */
	public static void showKoords() {

		for(int i = 0; i < koordinaten.length; i++) {
			for(int j = 0; j < koordinaten[i].length; j++) {
				boolean figFound = false;
				for(Figur fig : figuren) {
					if((fig.getX() == j) && (fig.getY() == i)) {
						figFound = true;
						System.out.print(fig.getZeichen());
					}
				}
				if(!figFound) System.out.print(leeresFeld);
				System.out.print("\t");
			}
			System.out.println();
		}	
	}
}