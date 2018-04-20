package control;

public class TieferCmd implements ICommand {

	Figur figur;
	int meter;
	
	public TieferCmd(Figur figur, int meter) {
		this.figur = figur;
		this.meter = meter;
	}
	
	public void ausfuehren() {
		figur.tiefer(meter);
	}
	
	public void rueckgaengig() {
		figur.tiefer(meter * -1);
	}	
}