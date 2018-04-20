package control;

public class VorCmd implements ICommand {

	Figur figur;
	int meter;
	
	public VorCmd(Figur figur, int meter) {
		this.figur = figur;
		this.meter = meter;
	}
	
	public void ausfuehren() {
		figur.vor(meter);
	}
	
	public void rueckgaengig() {
		figur.vor(meter * -1);
	}	
}