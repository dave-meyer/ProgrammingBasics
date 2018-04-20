package control;

public class Figur {

	int x;
	int y;
	int z;
	
	/** Das Zeichen zur Darstellung dieser Figur am Feld (Koordinatensystem) */
	char zeichen = 'X';
	
	public Figur(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void vor(int wert) {
		x += wert;
	}
	
	public void hoeher(int wert) {
		y += wert;
	}
	
	public void tiefer(int wert) {
		y -= wert;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	/** Das Zeichen zur Darstellung dieser Figur am Feld (Koordinatensystem) */
	public char getZeichen() {
		return zeichen;
	}

	/** Das Zeichen zur Darstellung dieser Figur am Feld (Koordinatensystem) */
	public void setZeichen(char zeichen) {
		this.zeichen = zeichen;
	}	
}