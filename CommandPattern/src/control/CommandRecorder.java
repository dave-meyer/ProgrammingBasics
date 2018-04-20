package control;

import java.util.Stack;

public class CommandRecorder {

	/** Alle Commands die wieder rueckgaengig gemacht werden koennen
	 * (eingeordnet in Ausfuehrungsreihenfolge) */
	public Stack<ICommand> mainStack;
	/** Alle Commands die rueckgaengig gemacht wurden und wiederhergestellt werden koennen
	 * (eingeordnet in Reihenfolge in der diese rueckgaengig gemacht wurden) */
	public Stack<ICommand> secondaryStack;
	
	public CommandRecorder() {
		mainStack = new Stack<ICommand>();
		secondaryStack = new Stack<ICommand>();
	}
	
	public void undoSchritt() {
		ICommand command = mainStack.pop();
		command.rueckgaengig();
		secondaryStack.push(command);
	}
	
	public void redoSchritt() {
		ICommand command = secondaryStack.pop();
		command.ausfuehren();
		mainStack.push(command);
	}
	
	/** Fuehrt einen Befehl aus und legt ihn in den mainStack,
	 * damit er wieder rueckgaengig gemacht werden kann.
	 * SecondaryStack wird gecleared */
	public void ausfuehren(ICommand c) {
		mainStack.push(c);
		secondaryStack.clear();
		c.ausfuehren();
	}	
}