package n1exercici1;

import java.util.Scanner;

public class n1exercici1 {
	static Undo undo;
	public static void main(String[] args) {
		
		String comanda;
		Scanner sc=new Scanner(System.in);
		undo=Undo.getInstance();
		
		System.out.println("Exit - sortir, Undo - desfer, List - llista de comandes");
		System.out.println("(Aquestes instruccions no es llistaran)\n");
		do {
			comanda = sc.nextLine();
			executar(comanda);
		}while (!comanda.equals("Exit"));
	}

	public static void executar(String comanda) {
		switch (comanda) {
		case "List":
			undo.getUndo();
			break;
		case "Undo":
			undo.deleteUndo();
			break;
		default:
			undo.setUndo(comanda);
			break;
		}	
		
	}
}
