package control;

public class HoeherCmd implements ICommand {

	Figur figur;
	int meter;
	
	public HoeherCmd(Figur figur, int meter) {
		this.figur = figur;
		this.meter = meter;
	}
	
	public void ausfuehren() {
		figur.hoeher(meter);
	}
	
	public void rueckgaengig() {
		figur.hoeher(meter * -1);
	}	
}