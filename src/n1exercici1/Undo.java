package n1exercici1;

import java.util.ArrayList;

public class Undo {
	private static Undo instance;
	private Undo() {}
	public static synchronized Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	 
	private ArrayList<String> commands=new ArrayList<String>();
	
	public void setUndo(String comanda) {
		commands.add(comanda);
	}
	
	public void deleteUndo() {
		if (commands.isEmpty()) System.out.println("No hi han comandes.");
		else commands.remove(commands.size()-1);
	}
	
	public void getUndo() {
		System.out.println("\nLlista de comandes");
		if (commands.isEmpty()) System.out.println("No hi han comandes.");
		else commands.forEach((n) -> System.out.println(n));
	}
}
